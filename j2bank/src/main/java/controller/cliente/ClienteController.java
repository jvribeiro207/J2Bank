/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.cliente;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Cliente;
import persistence.ClientePersistence;
import persistence.Persistence;
import view.gerente.ListaGerencUsuarios;

public class ClienteController {

    private DefaultListModel<Cliente> model;
    private ClientePersistence persistence;
    private ListaGerencUsuarios janela;

    public ClienteController(ListaGerencUsuarios janela) {
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getLista_clientes().setModel(model);
        this.model = (DefaultListModel<Cliente>) janela.getLista_clientes().getModel();
    }

    public ClienteController(DefaultListModel<Cliente> model) {
        this.model = model;
    }

    public ClienteController() {
        persistence = new ClientePersistence();
    }

    public void carregaClientes() {
        Persistence<Cliente> clientePersistence = new ClientePersistence();
        List<Cliente> todos = clientePersistence.findAll();

        for (Cliente cliente : todos) {
            model.addElement(cliente);
        }
    }

    public List<Cliente> listaClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < model.size(); i++) {
            clientes.add(model.get(i));
        }
        return clientes;
    }

    public void salvaClientesAoFechar() {
        Persistence<Cliente> caixaPersistence = new ClientePersistence();
        caixaPersistence.save(listaClientes());
    }

    public void removeCliente() {
        model.removeElementAt(janela.getLista_clientes().getSelectedIndex());
    }

    public boolean transferir(String cpfOrigem, String cpfDestino, BigDecimal valor) {

        Cliente origem = persistence.buscarCliente(cpfOrigem);
        Cliente destino = persistence.buscarCliente(cpfDestino);

        System.out.println(origem);
        System.out.println(destino);
        System.out.println(valor);

        BigDecimal limite = new BigDecimal("1000000");

        if (origem == null || destino == null || valor.compareTo(limite) > 0 || origem.getCpf().equals(destino.getCpf()) || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }

        if (origem.debitaSaldo(valor)) {
            destino.creditaSaldo(valor);

            persistence.atualizar(origem);
            persistence.atualizar(destino);
            return true;
        }

        return false;
    }

    public BigDecimal atualizaSaldo(String cpf) {
        Cliente atualizado = persistence.buscarCliente(cpf);
        return atualizado.getSaldo();
    }

    public boolean investir(String cpfInvestidor, BigDecimal valor, String nomeDaOperacao) {
        Cliente investidor = persistence.buscarCliente(cpfInvestidor);

        if (investidor.debitaSaldo(valor)) {
            persistence.atualizar(investidor);
            return true;
        }
        return false;
    }

    public boolean saque(String cpfOrigem, BigDecimal valor) {

        Cliente origem = persistence.buscarCliente(cpfOrigem);
        BigDecimal saldoAtual = origem.getSaldo();

        if (origem == null || valor.compareTo(BigDecimal.ZERO) < 0 || valor.compareTo(saldoAtual) > 0 || valor.compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }

        if (origem.debitaSaldo(valor)) {
            persistence.atualizar(origem);
            return true;
        }
        return false;
    }

    public boolean deposito(String cpfOrigem, BigDecimal valor) {

        Cliente origem = persistence.buscarCliente(cpfOrigem);

        if (origem == null) {
            return false;
        }

        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }

        origem.creditaSaldo(valor);
        persistence.atualizar(origem);
        return true;
    }
}
