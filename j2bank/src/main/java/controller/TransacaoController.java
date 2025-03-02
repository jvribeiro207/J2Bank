
package controller;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import model.*;
import persistence.TransacaoPersistence;
/**
 *
 * @author joaov
 */
public class TransacaoController {
    
    private TransacaoPersistence persistence;

    public TransacaoController() {
        persistence = new TransacaoPersistence();
    }
    
    public void registraTransferencia(String cpfOrigem, String cpfDestino, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Transacao transferencia = new Transacao(cpfOrigem, cpfDestino, valor, data.format(formato), "Transferencia");
        
        persistence.registraTransacao(transferencia);
    }
    
    public void registraSaque(String cpfOrigem, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Transacao saque = new Transacao(cpfOrigem, null, valor, data.format(formato), "Saque");
        
        persistence.registraTransacao(saque);
    }
    
    public void registraDeposito(String cpfOrigem, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Transacao deposito = new Transacao(cpfOrigem, null, valor, data.format(formato), "Depósito");
        
        persistence.registraTransacao(deposito);
    }
    
    /*public List<Transacao> carregaLista(){
        List<Transacao> lista = findAll();
    }*/
}
