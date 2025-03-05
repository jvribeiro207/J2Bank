/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.gerente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Gerente;
import persistence.GerentePersistence;
import view.gerente.ListaGerencUsuarios;


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
