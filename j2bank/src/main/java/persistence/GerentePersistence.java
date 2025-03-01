/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import persistence.*;
//import model.Usuario;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import model.Gerente;

/**
 *
 * @author B r u n o
 */


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
}


