/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author B r u n o
 */
public class Cliente extends Usuario {
    
    private BigDecimal saldo;
    private List<Transacao> historicoTransacoes;
    
    public Cliente(String nome, String senha, String tipo) {
        super(nome, senha, tipo);
    }
    
}
