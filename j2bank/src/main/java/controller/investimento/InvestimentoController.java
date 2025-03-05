/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.investimento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Investimento;
import persistence.InvestimentoPersistence;
import view.cliente.TelaInvestimentos;

public class InvestimentoController {

    private InvestimentoPersistence persistence;
    private TelaInvestimentos tela;
    private DefaultListModel<Investimento> model;

    public InvestimentoController(TelaInvestimentos tela) {
        this.tela = tela;
        persistence = new InvestimentoPersistence();
        this.model = new DefaultListModel<>();
        tela.getListaInvestimentos().setModel(model);
        this.model = (DefaultListModel<Investimento>) tela.getListaInvestimentos().getModel();
    }

    public InvestimentoController() {
        persistence = new InvestimentoPersistence();
    }

    public void registraInvestimento(String cpf, BigDecimal valor, String nomeDaOperacao, String tipo) {
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Investimento investimento = new Investimento(cpf, valor, data.format(formato), nomeDaOperacao, tipo);

        persistence.registraInvestimento(investimento);
    }

    public void carregaInvestimentos() {

        List<Investimento> todas = persistence.findAll();
        Cliente logado = tela.getLogado();

        for (Investimento i : todas) {
            if (i.getCpfInvestidor().equals(logado.getCpf())) {
                model.addElement(i);
            }
        }
    }

    public List<Investimento> listaInvestimentos() {
        List<Investimento> lista = new ArrayList<>();

        for (int i = 0; i < model.size(); i++) {
            lista.add(model.get(i));
        }

        return lista;
    }

    public void salvaAoFechar() {
        InvestimentoPersistence persistence = new InvestimentoPersistence();
        persistence.save(listaInvestimentos());
    }

    public void removeInvestimento(Investimento selecionado) {
        List<Investimento> lista = persistence.findAll();
        for(Investimento i : lista){
            if(i.getNomeDaOperacao().equals(selecionado.getNomeDaOperacao())){
                lista.remove(i);
            }
        }
        persistence.save(lista);
    }

}
