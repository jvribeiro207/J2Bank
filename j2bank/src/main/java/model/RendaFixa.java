/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author B r u n o
 */
public class RendaFixa extends Opcoes {

    private String prazoResgate;
    private String validade;

    public RendaFixa(String prazoResgate, String validade, String nome_op, String rendimento) {
        super(nome_op, rendimento);
        this.prazoResgate = prazoResgate;
        this.validade = validade;
    }

    public String getPrazoResgate() {
        return prazoResgate;
    }

    public void setPrazoResgate(String prazoResgate) {
        this.prazoResgate = prazoResgate;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    

    @Override
    public String toString() {
        return getNome_op() + 
                " - " +
                getRendimento() +
                " - " +
                "Validade: " + getValidade();
    }

}
