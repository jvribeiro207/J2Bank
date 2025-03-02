
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;
import javax.swing.JOptionPane;


/**
 *
 * @author joaov
 */
public  class Transacao {
    
    private String cpfOrigem;
    private String cpfDestino;
    private BigDecimal valor;
    private String data;
    private String tipo;

    //construtor
    public Transacao(String cpfOrigem, String cpfDestino, BigDecimal valor, String data, String tipo) {
        this.cpfOrigem = cpfOrigem;
        this.cpfDestino = cpfDestino;
        this.valor = valor.setScale(2, RoundingMode.HALF_UP);
        this.data = data;
        this.tipo = tipo;
    }
    
    public String getCpfOrigem(){
        return cpfOrigem;
    }
    public String getCpfDestino(){
        return cpfDestino;
    }
    public BigDecimal getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getTipoTransacao() {
        return tipo;
    }
   
        //TODO: realizarSaque, realizarDeposito, registraTransacao.
}