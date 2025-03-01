/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistence;

import java.util.List;

/**
 *
 * @author B r u n o
 */
public interface Persistence<T> {
    String DIRECTORY = "data";
    public void save(List<T> itens);
    public List<T> findAll();
}