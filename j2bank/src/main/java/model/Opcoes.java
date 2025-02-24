/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author B r u n o
 */
abstract class Opcoes {

    private String nome_op;
    private String rendimento;

    public Opcoes(String nome_op, String rendimento) {
        this.nome_op = nome_op;
        this.rendimento = rendimento;
    }

    public String getNome_op() {
        return nome_op;
    }

    public void setNome_op(String nome_op) {
        this.nome_op = nome_op;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }
}
