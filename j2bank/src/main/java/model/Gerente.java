/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package model;

public class Gerente extends Caixa {

    public Gerente(String nome, String senha, String tipo, String cpf) {
        super(nome, senha, tipo, cpf);
    }
    
    @Override
    public String toString(){
        return getNome() + " - " + getSenha() + " - " + getCpf();
    }
}
