/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Cliente;
import persistence.TestPersistence;
import persistence.Persistence;

/**
 *
 * @author jose
 */
public class TestController {

    private DefaultListModel<Cliente> model;
    private TestPersistence persistence;

    public TestController(DefaultListModel<Cliente> model) {
        this.model = model;
    }

    public TestController() {
        persistence = new TestPersistence();
    }

    public void carregaClientes() {
        Persistence<Cliente> clientePersistence = new TestPersistence();
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
        Persistence<Cliente> caixaPersistence = new TestPersistence();
        caixaPersistence.save(listaClientes());
    }

    public void removeCliente(int indice) {
        model.remove(indice);
    }

    public boolean transferir(String cpfOrigem, String cpfDestino, BigDecimal valor) {

        Cliente origem = persistence.buscarCliente(cpfOrigem);
        Cliente destino = persistence.buscarCliente(cpfDestino);

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
