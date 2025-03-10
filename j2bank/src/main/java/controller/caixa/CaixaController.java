/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.caixa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Caixa;
import persistence.Persistence;
import persistence.CaixaPersistence;
import view.gerente.ListaGerencUsuarios;


public class CaixaController {
    private ListaGerencUsuarios janela;
    private DefaultListModel<Caixa> model;
    
    public CaixaController(ListaGerencUsuarios janela){
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getLista_caixas().setModel(model);
        this.model = (DefaultListModel<Caixa>) janela.getLista_caixas().getModel();
    }
    
    public void carregaCaixas() {
        Persistence<Caixa> caixaPersistence = new CaixaPersistence();
        List<Caixa> todos = caixaPersistence.findAll();
        
        for (Caixa caixa : todos) {
            model.addElement(caixa);
        }
    }
    
    public List<Caixa> listaCaixas() {
        List<Caixa> caixas = new ArrayList<>();
        for (int i = 0; i < model.size(); i++) {
            caixas.add(model.get(i));
        }
        return caixas;
    }
    
    public void salvaCaixasAoFechar() {
        Persistence<Caixa> caixaPersistence = new CaixaPersistence();
        caixaPersistence.save(listaCaixas());
    }
    
    public void removeCaixa() {
        model.removeElementAt(janela.getLista_caixas().getSelectedIndex());
    }
}
