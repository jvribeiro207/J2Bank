/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;

import java.math.BigDecimal;

public class Cliente extends Usuario {

    private BigDecimal saldo;

    public Cliente(String nome, String cpf, String tipo, String senha) {
        super(nome, cpf, tipo, senha);
        saldo = BigDecimal.ZERO;
    }

    public void setSaldo(BigDecimal valor) {
        this.saldo = valor;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getSenha() + " - " + getCpf() + " - Saldo: " + getSaldo();
    }

    public boolean debitaSaldo(BigDecimal valor) {
        if (this.getSaldo().compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            return true;
        }
        return false;
    }

    public void creditaSaldo(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

}
