/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Solicitacao;
import static persistence.Persistence.DIRECTORY;

/**
 *
 * @author joaov
 */
public class SolicitacaoPersistence implements Persistence<Solicitacao> {
    private static final String PATH = DIRECTORY + File.separator + "solicitacoes.json";
    
        private void criaDiretorio() {
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }
        
    @Override
    public void save(List<Solicitacao> solicitacoes) {
        Gson gson = new Gson();
        String json = gson.toJson(solicitacoes);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }
    
     @Override
    public List<Solicitacao> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Solicitacao> solicitacoes = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Solicitacao>>() {
            }.getType();
            solicitacoes = gson.fromJson(json, tipoLista);

            if (solicitacoes == null) {
                solicitacoes = new ArrayList<>();
            }
        }
        return solicitacoes;
    }
    
    public void registraSolicitacao(Solicitacao solicitacao){
        List<Solicitacao> solicitacoes = findAll();
        solicitacoes.add(solicitacao);
        save(solicitacoes);
    }
}
