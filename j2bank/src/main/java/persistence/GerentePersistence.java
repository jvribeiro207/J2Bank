/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package persistence;

import persistence.*;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import model.Gerente;

public class GerentePersistence implements Persistence<Gerente> {

    private static final String PATH = DIRECTORY + File.separator + "gerentes.json";

    @Override
    public void save(List<Gerente> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<Gerente> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Gerente> gerentes = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Gerente>>() {
            }.getType();
            gerentes = gson.fromJson(json, tipoLista);

            if (gerentes == null) {
                gerentes = new ArrayList<>();
            }
        }

        return gerentes;
    }

    public Gerente buscarGerente(String cpf) {
        Persistence<Gerente> gerente = new GerentePersistence();
        List<Gerente> todos = gerente.findAll();

        //busca o gerente pelo CPF
        return todos.stream().filter(g -> g.getCpf().equals(cpf)).findFirst().orElse(null);

    }

    public void criarGerente(Gerente gerente) {
        //carrega a lista existente
        List<Gerente> gerentes = findAll();

        //adiciona o novo gerente
        gerentes.add(gerente);

        //salva a lista atualizada no JSON
        save(gerentes);
    }
}
