/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.renda_fixa;

import java.util.List;
import model.RendaFixa;
import persistence.RendaFixaPersistence;
import view.gerente.CadRendaFixa;

/**
 *
 * @author B r u n o
 */
public class CadRendaFixaController {

    private CadRendaFixa janela;

    public CadRendaFixaController(CadRendaFixa janela) {
        this.janela = janela;
    }

    public void adicionaRendaFixa() {
        RendaFixa nova_op = new RendaFixa(janela.getPrazoMinTxt(), janela.getValidadeTxt(), janela.getNome_opTxt(), janela.getRendimentoTxt());

        RendaFixaPersistence persistence = new RendaFixaPersistence();

        List<RendaFixa> itens = persistence.findAll();
        itens.add(nova_op);

        persistence.save(itens);
    }

}
