
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;
import javax.swing.JOptionPane;
import persistence.ClientePersistence;
import persistence.TransacaoPersistence;

/**
 *
 * @author joaov
 */
public  class Transacao {
    
    private TransacaoPersistence transacaoPersistence;
    private ClientePersistence clientePersistence;
    private String cpfOrigem;
    private String cpfDestino;
    private BigDecimal valor;
    private String data;
    private String tipo;

    //construtor
    public Transacao(String cpfOrigem, String cpfDestino, BigDecimal valor, String data, String tipo) {
        this.cpfOrigem = cpfOrigem;
        this.valor = valor.setScale(2, RoundingMode.HALF_UP);
        this.data = data;
        this.tipo = tipo;
        
        if(tipo.equals("TRANSFERENCIA")){
            this.cpfDestino = cpfDestino;
        }else{
            this.cpfDestino = null;
        }
        ClientePersistence clientePersistence = new ClientePersistence();
        TransacaoPersistence transacaoPersistence = new TransacaoPersistence();
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


