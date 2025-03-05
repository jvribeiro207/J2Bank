/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Investimento;
import static persistence.Persistence.DIRECTORY;

public class InvestimentoPersistence implements Persistence<Investimento> {

    private static final String PATH = DIRECTORY + File.separator + "investimentos.json";

    private void criaDiretorio() {
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }

    @Override
    public void save(List<Investimento> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<Investimento> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Investimento> investimentos = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Investimento>>() {
            }.getType();
            investimentos = gson.fromJson(json, tipoLista);

            if (investimentos == null) {
                investimentos = new ArrayList<>();
            }
        }

        return investimentos;
    }

    public void registraInvestimento(Investimento investimento) {
        List<Investimento> lista = findAll();
        lista.add(investimento);
        save(lista);
    }

}
