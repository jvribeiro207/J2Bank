/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.renda_var;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.RendaVar;
import persistence.Persistence;
import persistence.RendaVarPersistence;
import view.gerente.ListaRendaVar;


public class RendaVarController {
    private JList<RendaVar> lista;
    private ListaRendaVar janela;
    private DefaultListModel<RendaVar> model;

    public RendaVarController(ListaRendaVar janela) {
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getListaRendaVar().setModel(model);
        this.model = (DefaultListModel<RendaVar>) janela.getListaRendaVar().getModel();
        this.lista = janela.getListaRendaVar();
    }
    
    public RendaVarController(JList<RendaVar> lista){
        this.lista = lista;
        this.model = new DefaultListModel<>();
        this.lista.setModel(model);
        this.model = (DefaultListModel<RendaVar>) this.lista.getModel();
    }
     
    public void carregaRendaVar(){
        Persistence<RendaVar> varPersistence = new RendaVarPersistence();
        List<RendaVar> todos = varPersistence.findAll();
        
        for (RendaVar op : todos) {
            model.addElement(op);
        }
    }
    
    public List<RendaVar> listaRendaVar(){
        List<RendaVar> ops_fixas = new ArrayList<>();

        for (int i = 0; i < model.size(); i++) {
            ops_fixas.add(model.get(i));
        }

        return ops_fixas;
    }
    
    public void salvaRendaVarAoFechar(){
        Persistence<RendaVar> varPersistence = new RendaVarPersistence();
        varPersistence.save(listaRendaVar());
    }
    
    public void removeRendaVar(){
        model.removeElementAt(janela.getListaRendaVar().getSelectedIndex());
    }
    
}
