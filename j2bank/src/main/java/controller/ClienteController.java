/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Cliente;
import persistence.ClientePersistence;
import persistence.Persistence;

public class ClienteController {

    private DefaultListModel<Cliente> model;
    private ClientePersistence persistence;

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

    public void removeCliente(int indice) {
        model.remove(indice);
    }

    public boolean transferir(String cpfOrigem, String cpfDestino, BigDecimal valor) {

        Cliente origem = persistence.buscarCliente(cpfOrigem);
        Cliente destino = persistence.buscarCliente(cpfDestino);

        BigDecimal limite = new BigDecimal("1000000");

        if (valor.compareTo(limite) > 0) {
            return false;
        }

        if (origem == null || destino == null) {
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

        if (origem == null) {
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

        origem.creditaSaldo(valor);
        persistence.atualizar(origem);
        return true;
    }
}
