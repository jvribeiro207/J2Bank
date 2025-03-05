/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import model.Solicitacao;
import persistence.SolicitacaoPersistence;
import view.cliente.TelaSolicitacao;


public class SolicitacaoController {
    private SolicitacaoPersistence persistence;
    private TelaSolicitacao tela;
    private DefaultListModel<Solicitacao> model;

    public SolicitacaoController() {
        persistence = new SolicitacaoPersistence();
    }
    
    public void registraEmprestimo(String cpfCliente, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Solicitacao emprestimo = new Solicitacao(cpfCliente, valor, "Empréstimo", "PENDENTE", data.format(formato));
        persistence.registraSolicitacao(emprestimo);
    }
    
    public void registraFinanciamento(String cpfCliente, BigDecimal valor){
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Solicitacao financiamento = new Solicitacao(cpfCliente, valor, "Financiamento", "PENDENTE", data.format(formato));
        persistence.registraSolicitacao(financiamento);
    }
    
}
