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
import static persistence.Persistence.DIRECTORY;

/**
 *
 * @author joaov
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
    public void save(List<Cliente> clientes) {
        Gson gson = new Gson();
        String json = gson.toJson(clientes);

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

    public Cliente buscarCliente(String cpf) {
        Persistence<Cliente> clientes = new ClientePersistence();
        List<Cliente> todos = clientes.findAll();

        //busca o cliente pelo CPF
        return todos.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);

    }

    public void criarCliente(Cliente cliente) {
        //carrega a lista existente
        List<Cliente> clientes = findAll();

        //adiciona o novo cliente
        clientes.add(cliente);

        //salva a lista atualizada no JSON
        save(clientes);

    }

    public void atualizar(Cliente clienteAtualizado) {
        List<Cliente> clientes = findAll();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(clienteAtualizado.getCpf())) {
                clientes.set(i, clienteAtualizado); //atualiza o cliente na lista
                break;
            }
        }
        save(clientes); //salva a lista atualizada no JSON
    }
}
