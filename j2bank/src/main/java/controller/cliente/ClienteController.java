/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Cliente;
import persistence.ClientePersistence;
import persistence.Persistence;
import view.gerente.ListaGerencUsuarios;

/**
 *
 * @author joaov
 */
public class ClienteController {
    private ListaGerencUsuarios janela;
    private DefaultListModel<Cliente> model;
    
    public ClienteController(ListaGerencUsuarios janela){
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getLista_clientes().setModel(model);
        this.model = (DefaultListModel<Cliente>) janela.getLista_clientes().getModel();
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
        Persistence<Cliente> clientePersistence = new ClientePersistence();
        clientePersistence.save(listaClientes());
    }
    
    public void removeCliente(){
        model.removeElementAt(janela.getLista_clientes().getSelectedIndex());
    }
}