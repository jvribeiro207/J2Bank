/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Cliente;
import persistence.ClientePersistence;
import persistence.Persistence;

/**
 *
 * @author joaov
 */
public class ClienteController {
    private DefaultListModel<Cliente> model;


    public ClienteController(DefaultListModel<Cliente> model) {
        this.model = model;
    }
    
    public void carregaClientes() {
        Persistence<Cliente> clientePersistence = new ClientePersistence();
        List<Cliente> todos = clientePersistence.findAll();
        
        for (Cliente cliente : todos) {
            model.addElement(cliente);
        }
    }
    
    public List<Cliente> listaClientes() {
        List<Cliente> caixas = new ArrayList<>();
        for (int i = 0; i < model.size(); i++) {
            caixas.add(model.get(i));
        }
        return caixas;
    }
    
    public void salvaClientesAoFechar() {
        Persistence<Cliente> caixaPersistence = new ClientePersistence();
        caixaPersistence.save(listaClientes());
    }
    
    public void removeCliente(int indice) {
        model.remove(indice);
    }
}

