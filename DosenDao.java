/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulia_30mei2024_model;

import aulia_30mei2024_model.Dosen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vika
 */
public class DosenDao {
    private List<Dosen> data = new ArrayList<Dosen>();
    
    public DosenDao() {
        data.add(new Dosen("0001097802", "Ervan Asri", "L", "01-09-1978"));
        data.add(new Dosen("0029128003", "Yance Sonatha", "P", "29-12-1980"));
    }
    
    public void insert(Dosen d){
        data.add(d);
    }
    
    public void update(int index,Dosen d){
        data.set(index,d);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Dosen getDosen(int index){
        return data.get(index);
    }
    
     public List<Dosen> getAllDosen() 
    {
        return data;
    }
}
