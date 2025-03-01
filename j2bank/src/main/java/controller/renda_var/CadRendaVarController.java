/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.renda_var;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.RendaFixa;
import model.RendaVar;
import persistence.Persistence;
import persistence.RendaFixaPersistence;
import persistence.RendaVarPersistence;
import view.gerente.CadRendaFixa;
import view.gerente.CadRendaVar;
import view.gerente.ListaRendaFixa;

/**
 *
 * @author B r u n o
 */
public class CadRendaVarController {
    private CadRendaVar janela;

    public CadRendaVarController(CadRendaVar janela) {
        this.janela = janela;
    }
    
    public void adicionaRendaFixa(){
        RendaVar nova_op = new RendaVar 
        (janela.getTipo_opTxt(),janela.getPercentual_riscoTxt(),janela.getNome_opTxt(),janela.getRendimentoTxt());
        
        RendaVarPersistence persistence = new RendaVarPersistence();
        
        List<RendaVar> itens = persistence.findAll();
        itens.add(nova_op);
        
        persistence.save(itens);
    }
    
}
