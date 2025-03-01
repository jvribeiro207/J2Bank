/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Caixa;
import persistence.Persistence;
import persistence.CaixaPersistence;


/**
 *
 * @author jose
 */
public class CaixaController {
    private DefaultListModel<Caixa> model;


    public CaixaController(DefaultListModel<Caixa> model) {
        this.model = model;
    }
    
    public void carregaCaixas() {
        Persistence<Caixa> caixaPersistence = new CaixaPersistence();
        List<Caixa> todos = caixaPersistence.findAll();
        
        for (Caixa caixa : todos) {
            model.addElement(caixa);
        }
    }
    
    public List<Caixa> listaCaixas() {
        List<Caixa> caixas = new ArrayList<>();
        for (int i = 0; i < model.size(); i++) {
            caixas.add(model.get(i));
        }
        return caixas;
    }
    
    public void salvaCaixasAoFechar() {
        Persistence<Caixa> caixaPersistence = new CaixaPersistence();
        caixaPersistence.save(listaCaixas());
    }
    
    public void removeCaixa(int indice) {
        model.remove(indice);
    }
}