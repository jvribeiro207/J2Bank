package persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import model.Transacao;
import static persistence.Persistence.DIRECTORY;

/**
 *
 * @author joaov
 */
public class TransacaoPersistence implements Persistence<Transacao> {

    private static final String PATH = DIRECTORY + File.separator + "transacoes.json";

    private void criaDiretorio() {
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }

    @Override
    public void save(List<Transacao> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<Transacao> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Transacao> transacoes = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Transacao>>() {
            }.getType();
            transacoes = gson.fromJson(json, tipoLista);

            if (transacoes == null) {
                transacoes = new ArrayList<>();
            }
        }

        return transacoes;
    }
    
    public void registraTransacao(Transacao transacao){
        List<Transacao> transacoes = findAll();
        transacoes.add(transacao);
        save(transacoes);
    }
}