/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author joaov
 */
public class Solicitacao {
    
    private String cpfCliente;
    private BigDecimal valor;
    private String tipoSolicitacao;
    private String status;
    private String data;

    public Solicitacao(String cpfCliente, BigDecimal valor, String tipoSolicitacao, String status, String data) {
        this.cpfCliente = cpfCliente;
        this.valor = valor;
        this.tipoSolicitacao = tipoSolicitacao;
        this.status = status;
        this.data = data;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getData() {
        return data;
    }

    public String getTipoSolicitacao() {
        return tipoSolicitacao;
    }
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    @Override
    public String toString(){
        return "Mutuário: " + getCpfCliente() +
                " - " + "Valor: " + getValor() +
                " - " + getTipoSolicitacao();
    }
 
}
