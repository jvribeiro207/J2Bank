/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.math.BigDecimal;

/**
 *
 * @author B r u n o
 */
public class Cliente extends Usuario {
    
    private BigDecimal saldo;

    public Cliente(String nome, String cpf, String tipo, String senha) {
        super(nome, cpf, tipo, senha);
        saldo = BigDecimal.ZERO;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return getNome() + " - " + getSenha() + " - " + getCpf() + " - Saldo: " + getSaldo();
    }
}

