/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;


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
