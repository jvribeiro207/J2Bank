/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.gerente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.Gerente;
import persistence.GerentePersistence;
import view.gerente.ListaGerencUsuarios;

/**
 *
 * @author B r u n o
 */
public class GerenteController {

    private ListaGerencUsuarios janela;
    private DefaultListModel<Gerente> model;
    
    public GerenteController(ListaGerencUsuarios janela){
        this.janela = janela;
        this.model = new DefaultListModel<>();
        janela.getLista_gerentes().setModel(model);
        this.model = (DefaultListModel<Gerente>) janela.getLista_gerentes().getModel();
    }
    
    public void carregaGerentes() {
        GerentePersistence gerentePersistence = new GerentePersistence();
        
        List<Gerente> todos = gerentePersistence.findAll();
        Gerente logado = janela.getLogado();
        
        for (Gerente g : todos) {
            if(!g.getCpf().equals(logado.getCpf())){
                model.addElement(g);
            }
        }
    }
    
    public List<Gerente> listaGerentes(){
        List<Gerente> gerentes = new ArrayList<>();
        
        for(int i = 0; i < model.size(); i++){
            gerentes.add(model.get(i));
        }
        
        gerentes.add(janela.getLogado());
        
        return gerentes;
    }
    
    public void salvaAoFechar(){
        GerentePersistence gerentePersistence = new GerentePersistence();
        gerentePersistence.save(listaGerentes());
        
    }
    
    public void removeGerente(){
        model.removeElementAt(janela.getLista_gerentes().getSelectedIndex());
    }
}
