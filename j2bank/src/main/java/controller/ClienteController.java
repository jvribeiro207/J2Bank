/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cliente;
import persistence.ClientePersistence;

/**
 *
 * @author joaov
 */
public class ClienteController {

    private ClientePersistence clientePersistence;
    public ClienteController() {
        clientePersistence = new ClientePersistence(); // Inicializa a variável
    }

    public boolean registrarCliente(String nome, String cpf, String senha, String tipoUsuario) {
        if (nome.isEmpty() || cpf.isEmpty() || senha.isEmpty() || tipoUsuario.isEmpty()) {
            return false;
        }

        if (clientePersistence.buscarCliente(cpf) != null) {
            return false;
        }
        Cliente cliente = new Cliente(nome, cpf, tipoUsuario, senha);
        clientePersistence.criarCliente(cliente);
        return true;
    }
}
