/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package controller.renda_var;

import java.util.List;
import model.RendaVar;
import persistence.RendaVarPersistence;
import view.gerente.CadRendaVar;

public class CadRendaVarController {

    private CadRendaVar janela;

    public CadRendaVarController(CadRendaVar janela) {
        this.janela = janela;
    }

    public void adicionaRendaFixa() {
        RendaVar nova_op = new RendaVar(janela.getTipo_opTxt(), janela.getPercentual_riscoTxt(), janela.getNome_opTxt(), janela.getRendimentoTxt());

        RendaVarPersistence persistence = new RendaVarPersistence();

        List<RendaVar> itens = persistence.findAll();
        itens.add(nova_op);

        persistence.save(itens);
    }

}
