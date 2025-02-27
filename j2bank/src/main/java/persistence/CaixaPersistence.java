/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Caixa;

/**
 *
 * @author joses
 */
public class CaixaPersistence implements Persistence<Caixa> {

    private static final String PATH = DIRECTORY + File.separator + "caixas.json";

    @Override
    public void save(List<Caixa> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

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
}
