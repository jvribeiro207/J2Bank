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
import model.Caixa;
import model.Cliente;

import static persistence.Persistence.DIRECTORY;

/**
 *
 * @author joaov
 */
public class CaixaPersistence implements Persistence<Caixa>{
     private static final String PATH = DIRECTORY + File.separator + "caixas.json";
     
      private void criaDiretorio() {
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }
    @Override
    public void save(List<Caixa> caixas) {
        Gson gson = new Gson();
        String json = gson.toJson(caixas);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }
    @Override
    public List<Caixa> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Caixa> caixas = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Caixa>>() {
            }.getType();
            caixas = gson.fromJson(json, tipoLista);

            if (caixas == null) {
                caixas = new ArrayList<>();
            }
        }

        return caixas;
    }
    public Caixa buscarCaixa(String cpf) {
    Persistence<Caixa> caixas = new CaixaPersistence();
    List <Caixa> todos = caixas.findAll();

    //busca o caixa pelo CPF
    return todos.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    
}
    public void criarCaixa(Caixa caixa) {
    //carrega a lista existente
    List<Caixa> caixas = findAll();

    //adiciona o novo cliente
    caixas.add(caixa);

    //salva a lista atualizada no JSON
    save(caixas);

}
}
