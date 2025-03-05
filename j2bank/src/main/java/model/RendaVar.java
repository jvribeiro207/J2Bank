/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;


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
