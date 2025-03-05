/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package persistence;

import persistence.*;
//import model.Usuario;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

/**
 *
 * @author B r u n o
 */

/*
public class UsuarioPersistence implements Persistence<Usuario> {

    private static final String PATH = DIRECTORY + File.separator + "usuarios.json";

    @Override
    public void save(List<Usuario> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);

        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        Arquivo.salva(PATH, json);

    }

    @Override
    public List<Usuario> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Usuario> usuarios = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Usuario>>() {
            }.getType();
            usuarios = gson.fromJson(json, tipoLista);

            if (usuarios == null) {
                usuarios = new ArrayList<>();
            }
        }

        return usuarios;
    }
}

*/
