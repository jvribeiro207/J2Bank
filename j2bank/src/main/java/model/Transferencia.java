/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author joaov
 */
public class Transferencia extends Transacao{
    
    private String contaOrigem;
    private String contaDestino;

    public Transferencia(String contaOrigem, String contaDestino, BigDecimal valor, LocalDate data, TipoTransacao tipo) {
        super(valor, data, tipo);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }
    
}
