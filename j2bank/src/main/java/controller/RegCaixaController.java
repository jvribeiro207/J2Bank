
package controller;

import javax.swing.JOptionPane;
import model.Caixa;
import persistence.CaixaPersistence;
import persistence.ClientePersistence;
import persistence.GerentePersistence;

/**
 *
 * @author B r u n o
 */
public class RegCaixaController {
    
    private ClientePersistence clientePersistence;
    private CaixaPersistence caixaPersistence;
    private GerentePersistence gerentePersistence;
    
    public RegCaixaController() {
        caixaPersistence = new CaixaPersistence();
        clientePersistence = new ClientePersistence();
        gerentePersistence = new GerentePersistence();
    }

    public boolean registrarCaixa(String nome, String cpf, String senha, String tipoUsuario) {
        if (nome.isEmpty() || cpf.isEmpty() || senha.isEmpty() || tipoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, preencha todos os campos!");
            return false;
        }

        if (caixaPersistence.buscarCaixa(cpf) != null || clientePersistence.buscarCliente(cpf) != null || gerentePersistence.buscarGerente(cpf) != null) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar, pois este CPF já possui uma conta!");
            return false;
        }
        Caixa caixa = new Caixa(nome, senha, tipoUsuario, cpf);
        caixaPersistence.criarCaixa(caixa);
        return true;
    }


}
