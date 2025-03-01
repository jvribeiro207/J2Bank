
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;

/**
 *
 * @author joaov
 */
public abstract class Transacao {
    private BigDecimal valor;
    private LocalDate data;
    private TipoTransacao tipo;

    public Transacao(BigDecimal valor, LocalDate data, TipoTransacao tipo) {
        this.valor = valor.setScale(2, RoundingMode.HALF_UP);
        this.data = data;
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public TipoTransacao getTipoTransacao() {
        return tipo;
    }
    
}
enum TipoTransacao {
    TRANSFERENCIA,
    SAQUE,
    DEPOSITO,
    INVESTIMENTO,
    EMPRESTIMO
}

