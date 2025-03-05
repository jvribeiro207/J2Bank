/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.gerente;

import javax.swing.JOptionPane;
import model.Gerente;
import persistence.CaixaPersistence;
import persistence.ClientePersistence;
import persistence.GerentePersistence;

public class RegGerenteController {

    private ClientePersistence clientePersistence;
    private CaixaPersistence caixaPersistence;
    private GerentePersistence gerentePersistence;

    public RegGerenteController() {
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
