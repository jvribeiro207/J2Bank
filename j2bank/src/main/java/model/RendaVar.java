/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author B r u n o
 */
public class RendaVar extends Opcoes {
    
    private String tipo_op;
    private int percentual_risco;

    public RendaVar(String tipo_op, int percentual_risco, String nome_op, String rendimento) {
        super(nome_op, rendimento);
        this.tipo_op = tipo_op;
        this.percentual_risco = percentual_risco;
    }

    public String getTipo_op() {
        return tipo_op;
    }

    public void setTipo_op(String tipo_op) {
        this.tipo_op = tipo_op;
    }

    public int getPercentual_risco() {
        return percentual_risco;
    }

    public void setPercentual_risco(int percentual_risco) {
        this.percentual_risco = percentual_risco;
    }
    
    @Override
    public String toString() {
        return getNome_op() + 
                " - " +
                getTipo_op() +
                " - " +
                "Risco: " + getPercentual_risco() + "%" +
                " - " +
                "Rendimento esperado: " + getRendimento();
    }
    
}
