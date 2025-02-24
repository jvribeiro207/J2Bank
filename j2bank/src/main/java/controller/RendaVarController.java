/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.RendaFixa;
import model.RendaVar;
import persistence.Persistence;
import persistence.RendaFixaPersistence;
import persistence.RendaVarPersistence;
import view.gerente.ListaRendaFixa;
import view.gerente.ListaRendaVar;

/**
 *
 * @author B r u n o
 */
public class RendaVarController {
    private ListaRendaVar janela;
    private DefaultListModel<RendaVar> model;

    public RendaVarController(ListaRendaVar janela) {
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getListaRendaVar().setModel(model);
        this.model = (DefaultListModel<RendaVar>) janela.getListaRendaVar().getModel();
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
