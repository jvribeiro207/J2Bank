/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author B r u n o
 */
public class Caixa extends Usuario {
    
    public Caixa(String nome, String senha, String cpf) {
        super(nome, senha, "CAIXA");
        this.setCpf(cpf);
        
        }
    
    @Override
        public String toString(){
        return getNome() + " - " + getCpf();
    
    }
    
}
