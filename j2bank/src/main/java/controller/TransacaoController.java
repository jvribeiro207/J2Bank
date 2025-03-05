/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultListModel;
import model.*;
import persistence.TransacaoPersistence;
import view.cliente.TelaConsultas;
/**
 *
 * @author joaov
 */
public class TransacaoController {
    
    private TelaConsultas tela;
    private TransacaoPersistence persistence;
    private DefaultListModel<Transacao> model;
    
    public TransacaoController(TelaConsultas tela) {
        this.tela = tela;
        persistence = new TransacaoPersistence();
        this.model = new DefaultListModel<>();
        tela.getListaTransacoes().setModel(model);
        this.model = (DefaultListModel<Transacao>) tela.getListaTransacoes().getModel();
    }

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
    
    public void registraInvestimento(String cpfOrigem, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Transacao investimento = new Transacao(cpfOrigem, null, valor, data.format(formato), "Investimento");
        
        persistence.registraTransacao(investimento);
    }
    
    public void registraEmprestimo(String cpfOrigem, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Transacao emprestimo = new Transacao(cpfOrigem, null, valor, data.format(formato), "Empréstimo/Financiamento");
        
        persistence.registraTransacao(emprestimo);
    }
    
    public void carregaTransacoes() {
        
        List<Transacao> todas = persistence.findAll();
        Cliente logado = tela.getLogado();
        
        for(Transacao t: todas){
            if (t.getCpfOrigem().equals(logado.getCpf()) || 
            (t.getCpfDestino() != null && t.getCpfDestino().equals(logado.getCpf()))){
                model.addElement(t);
            }
    }
    }
}

