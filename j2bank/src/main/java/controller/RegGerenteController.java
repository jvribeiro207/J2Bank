/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Gerente;
import persistence.GerentePersistence;
import persistence.Persistence;
import view.auth.Registro;

/**
 *
 * @author B r u n o
 */
public class RegGerenteController {
    
    private Registro janela;
    
    public RegGerenteController(Registro janela){
        this.janela = janela;
    }
    
    public void registraGerente(){
        Gerente novo_gerente = new Gerente 
        (janela.getNome(), janela.getSenha(), janela.getTipo(), janela.getCpf());
        
        GerentePersistence gerentePersistence = new GerentePersistence();
        
        List<Gerente> todos = gerentePersistence.findAll();
        todos.add(novo_gerente);
        gerentePersistence.save(todos);
    }
    
}
