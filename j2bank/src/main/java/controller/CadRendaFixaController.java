/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.RendaFixa;
import persistence.Persistence;
import persistence.RendaFixaPersistence;
import view.gerente.CadRendaFixa;
import view.gerente.ListaRendaFixa;

/**
 *
 * @author B r u n o
 */
public class CadRendaFixaController {
    private CadRendaFixa janela;

    public CadRendaFixaController(CadRendaFixa janela) {
        this.janela = janela;
    }
    
    public void adicionaRendaFixa(){
        RendaFixa nova_op = new RendaFixa 
        (janela.getPrazoMinTxt(),janela.getValidadeTxt(),janela.getNome_opTxt(),janela.getRendimentoTxt());
        
        RendaFixaPersistence persistence = new RendaFixaPersistence();
        
        List<RendaFixa> itens = persistence.findAll();
        itens.add(nova_op);
        
        persistence.save(itens);
    }
    
}
