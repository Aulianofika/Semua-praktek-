/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aul.DAO;

import java.util.List;
import aul.Model.Barang;

/**
 *
 * @author Vika
 */
public interface ImplementBarang {
    public void insert(Barang b);
    public void delete(int no);
    public void update(Barang b);
    public List<Barang> getAll();
    public List<Barang> getCariNama(String nama);
}
