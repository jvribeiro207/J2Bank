/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Caixa;
import persistence.CaixaPersistence;
import persistence.Persistence;
import view.auth.Registro;

/**
 *
 * @author B r u n o
 */
public class RegCaixaController {

    private Registro janela;

    public RegCaixaController(Registro janela) {
        this.janela = janela;
    }

    public void registraCaixa() {
        Caixa novo_caixa = new Caixa(janela.getNome(), janela.getSenha(), janela.getTipo(), janela.getCpf());

        CaixaPersistence CaixaPersistence = new CaixaPersistence();

        List<Caixa> todos = CaixaPersistence.findAll();
        todos.add(novo_caixa);
        CaixaPersistence.save(todos);
    }

}
