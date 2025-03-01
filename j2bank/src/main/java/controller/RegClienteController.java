/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Cliente;
import persistence.ClientePersistence;

/**
 *
 * @author joaov
 */
public class RegClienteController {

    private ClientePersistence clientePersistence;
    public RegClienteController() {
        clientePersistence = new ClientePersistence(); //inicializa a variável
    }

    public boolean registrarCliente(String nome, String cpf, String senha, String tipoUsuario) {
        if (nome.isEmpty() || cpf.isEmpty() || senha.isEmpty() || tipoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, preencha todos os campos!");
            return false;
        }

        if (clientePersistence.buscarCliente(cpf) != null) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, pois este CPF já possui uma conta!");
            return false;
        }
        Cliente cliente = new Cliente(nome, cpf, tipoUsuario, senha);
        clientePersistence.criarCliente(cliente);
        return true;
    }
}
