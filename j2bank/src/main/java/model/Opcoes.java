/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;

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
