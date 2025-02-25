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
import model.Cliente;
import static persistence.Persistence.DIRECTORY;

/**
 *
 * @author joses
 */
public class ClientePersistence implements Persistence<Cliente> {

    private static final String PATH = DIRECTORY + File.separator + "clientes.json";

    private void criaDiretorio() {
        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }
    }
    
    @Override
    public void save(List<Cliente> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        criaDiretorio();

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<Cliente> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Cliente> clientes = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Cliente>>() {
            }.getType();
            clientes = gson.fromJson(json, tipoLista);

            if (clientes == null) {
                clientes = new ArrayList<>();
            }
        }

        return clientes;
    }

}
