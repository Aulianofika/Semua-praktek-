/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulia_30mei2024_model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Vika
 */
public class MataKuliahDao {
    private List<MataKuliah> data = new ArrayList<MataKuliah>();
    
    public MataKuliahDao()
    {
        data.add(new MataKuliah("Vika","2013125467","4","Teknologi informasi","2A","C++ Pengantar","3"));
        data.add(new MataKuliah("lulu","2012432104","4","Elektro","2D","Sistem Kontrol Elektronika","5"));
        data.add(new MataKuliah("Nova","2312954392","2","Bahasa Inggris","1C","Vocabulary Building","4"));
    }
    
    public void insert(MataKuliah m)
    {
        data.add(m);
    }
    
    public void update(int index, MataKuliah m)
    {
        data.set(index, m);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public MataKuliah getMataKuliah(int index)
    {
        return data.get(index);
    }

    public List<MataKuliah> getAllMataKuliah() 
    {
        return data;
    }
}
