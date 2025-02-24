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
import model.RendaFixa;
import model.RendaVar;

/**
 *
 * @author B r u n o
 */
public class RendaVarPersistence implements Persistence<RendaVar> {

    private static final String PATH = DIRECTORY + File.separator + "renda-var.json";
    
    private void criaDiretorio(){
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }

    @Override
    public void save(List<RendaVar> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<RendaVar> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<RendaVar> ops_fixa = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<RendaVar>>() {
            }.getType();
            ops_fixa = gson.fromJson(json, tipoLista);

            if (ops_fixa == null) {
                ops_fixa = new ArrayList<>();
            }
        }

        return ops_fixa;
    }
}
