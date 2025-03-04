/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 
}
