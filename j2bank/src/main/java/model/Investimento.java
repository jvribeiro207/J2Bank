/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Investimento {

    private String cpfInvestidor;
    private BigDecimal valorInvestido;
    private String data;
    private String nomeDaOperacao;

    public Investimento(String cpfInvestidor, BigDecimal valorInvestido, String data, String nomeDaOperacao) {
        this.cpfInvestidor = cpfInvestidor;
        this.valorInvestido = valorInvestido;
        this.data = data;
        this.nomeDaOperacao = nomeDaOperacao;
    }

    public String getCpfInvestidor() {
        return cpfInvestidor;
    }

    public BigDecimal getValorInvestido() {
        return valorInvestido;
    }

    public String getData() {
        return data;
    }

    public String getNomeDaOperacao() {
        return nomeDaOperacao;
    }

    @Override
    public String toString() {
        return "Nome da Operacao: " + nomeDaOperacao + " | "
                + "Valor Investido: R$" + valorInvestido.setScale(2, RoundingMode.HALF_UP) + " | "
                + "Data: " + data;
    }
}
