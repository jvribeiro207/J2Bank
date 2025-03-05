/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package persistence;

import java.util.List;

public interface Persistence<T> {

    String DIRECTORY = "data";

    public void save(List<T> itens);

    public List<T> findAll();
}
