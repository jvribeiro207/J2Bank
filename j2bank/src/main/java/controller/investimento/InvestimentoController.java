/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.investimento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Cliente;
import model.Investimento;
import persistence.InvestimentoPersistence;
import view.cliente.TelaInvestimentos;

/**
 *
 * @author joaov
 */
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

    public void registraInvestimento(String cpf, BigDecimal valor, String nomeDaOperacao) {
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Investimento investimento = new Investimento(cpf, valor, data.format(formato), nomeDaOperacao);

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
}
