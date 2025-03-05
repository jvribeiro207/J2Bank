/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.renda_fixa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.RendaFixa;
import persistence.Persistence;
import persistence.RendaFixaPersistence;
import view.gerente.ListaRendaFixa;


public class RendaFixaController {
    private JList<RendaFixa> lista;
    private ListaRendaFixa janela;
    private DefaultListModel<RendaFixa> model;

    public RendaFixaController(ListaRendaFixa janela) {
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getListaRendaF().setModel(model);
        this.model = (DefaultListModel<RendaFixa>) janela.getListaRendaF().getModel();
        this.lista = janela.getListaRendaF();
    }
    
    public RendaFixaController(JList<RendaFixa> lista){
        this.janela = null;
        this.lista = lista;
        this.model = new DefaultListModel<>();
        this.lista.setModel(model);
        this.model = (DefaultListModel<RendaFixa>) this.lista.getModel();
    }
    
    public void carregaRendaFixa(){
        Persistence<RendaFixa> fixaPersistence = new RendaFixaPersistence();
        List<RendaFixa> todos = fixaPersistence.findAll();
        
        for (RendaFixa op : todos) {
            model.addElement(op);
        }
    }
    
    public List<RendaFixa> listaRendaFixa(){
        List<RendaFixa> ops_fixas = new ArrayList<>();

        for (int i = 0; i < model.size(); i++) {
            ops_fixas.add(model.get(i));
        }

        return ops_fixas;
    }
    
    public void salvaRendaFixaAoFechar(){
        Persistence<RendaFixa> fixaPersistence = new RendaFixaPersistence();
        fixaPersistence.save(listaRendaFixa());
    }
    
    public void removeRendaFixa(){
        model.removeElementAt(janela.getListaRendaF().getSelectedIndex());
    }
    
}
