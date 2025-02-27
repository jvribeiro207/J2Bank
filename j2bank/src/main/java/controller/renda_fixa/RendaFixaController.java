/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.renda_fixa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.RendaFixa;
import persistence.Persistence;
import persistence.RendaFixaPersistence;
import view.gerente.ListaRendaFixa;

/**
 *
 * @author B r u n o
 */
public class RendaFixaController {
    private ListaRendaFixa janela;
    private DefaultListModel<RendaFixa> model;

    public RendaFixaController(ListaRendaFixa janela) {
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getListaRendaF().setModel(model);
        this.model = (DefaultListModel<RendaFixa>) janela.getListaRendaF().getModel();
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
