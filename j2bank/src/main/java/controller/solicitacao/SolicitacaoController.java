/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.solicitacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.RendaVar;
import model.Solicitacao;
import persistence.Persistence;
import persistence.RendaVarPersistence;
import persistence.SolicitacaoPersistence;
import view.cliente.TelaSolicitacao;

/**
 *
 * @author joaov
 */
public class SolicitacaoController {

    private SolicitacaoPersistence persistence;
    //private TelaSolicitacao tela;
    private JList<Solicitacao> lista;
    private DefaultListModel<Solicitacao> model;
    private List<Solicitacao> solicitacoes;
    
    public SolicitacaoController(JList<Solicitacao> lista) {
        this.persistence = new SolicitacaoPersistence();
        this.lista = lista;
        this.model = new DefaultListModel<>();
        this.lista.setModel(model);
        this.model = (DefaultListModel<Solicitacao>) this.lista.getModel();
        this.solicitacoes = persistence.findAll();
    }
    
    public SolicitacaoController() {
        this.persistence = new SolicitacaoPersistence();
        this.solicitacoes = persistence.findAll();
    }
    
    public void registraEmprestimo(String cpfCliente, BigDecimal valor) {
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Solicitacao emprestimo = new Solicitacao(cpfCliente, valor, "Empréstimo", "PENDENTE", data.format(formato));
        persistence.registraSolicitacao(emprestimo);
    }
    
    public void registraFinanciamento(String cpfCliente, BigDecimal valor) {
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Solicitacao financiamento = new Solicitacao(cpfCliente, valor, "Financiamento", "PENDENTE", data.format(formato));
        persistence.registraSolicitacao(financiamento);
    }
    
    public void atualizaLista() {
        salvaLista();
        model.removeAllElements();
        carregaSolicitacao();
    }
    
    public Solicitacao buscaSolicitacao(Solicitacao busca) {
        return solicitacoes.stream().filter(s -> s.equals(busca)).findFirst().orElse(null);
    }
    
    public Solicitacao buscaSolicitacaoPorCpf(String cpf) {
        return solicitacoes.stream().filter
        (s -> s.getCpfCliente().equals(cpf) && s.getStatus().equals("DEFERIDA")).findFirst().orElse(null);
    }
    
    public void carregaSolicitacao() {
        for (Solicitacao s : solicitacoes) {
            if (s.getStatus().equals("PENDENTE")) {
                model.addElement(s);
            }
        }
    }
    
    public void aprovaSolicitacao() {
        Solicitacao busca = lista.getSelectedValue();
        buscaSolicitacao(busca).setStatus("DEFERIDA");
    }
    
    public void recusaSolicitacao() {
        Solicitacao busca = lista.getSelectedValue();
        buscaSolicitacao(busca).setStatus("INDEFERIDA");
    }
    
    public void salvaLista() {
        persistence.save(solicitacoes);
    }
    
    public void removeSolicitacao(Solicitacao excluida) {
        solicitacoes.removeIf(s -> s.getStatus().equals("INDEFERIDA"));
        solicitacoes.remove(excluida);
        salvaLista();
    }
    
}
