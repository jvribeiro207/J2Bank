/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.gerente;

import java.util.List;
import javax.swing.JOptionPane;
import model.Gerente;
import persistence.CaixaPersistence;
import persistence.ClientePersistence;
import persistence.GerentePersistence;
import persistence.Persistence;
import view.auth.Registro;

/**
 *
 * @author B r u n o
 */
public class RegGerenteController {
    
    private ClientePersistence clientePersistence;
    private CaixaPersistence caixaPersistence;
    private GerentePersistence gerentePersistence;
    
    public RegGerenteController(){
         caixaPersistence = new CaixaPersistence();
        clientePersistence = new ClientePersistence();
        gerentePersistence = new GerentePersistence();
    }
    
public boolean registrarGerente(String nome, String cpf, String senha, String tipoUsuario) {
        if (nome.isEmpty() || cpf.isEmpty() || senha.isEmpty() || tipoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, preencha todos os campos!");
            return false;
        }

        if (caixaPersistence.buscarCaixa(cpf) != null || clientePersistence.buscarCliente(cpf) != null || gerentePersistence.buscarGerente(cpf) != null) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, pois este CPF já possui uma conta!");
            return false;
        }
        Gerente gerente = new Gerente(nome, senha, tipoUsuario, cpf);
        gerentePersistence.criarGerente(gerente);
        return true;
    }
}
