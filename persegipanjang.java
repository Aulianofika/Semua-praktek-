/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika16mei2024;

/**
 *
 * @author Vika
 */
public class persegipanjang implements relation {
    private int panjang;
    private int lebar;
  
    public persegipanjang(){
        
    }
    public persegipanjang(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getluas(){
        double luas = panjang*lebar;
        return luas;
    }
    
    public double getkeliling(){
        double keliling = 2*(panjang+lebar);
        return keliling;
    }
    
    
    @Override
    public boolean isGreater(Object a, Object b){
    double aluas = ((persegipanjang)a).getluas(); 
    double bluas = ((persegipanjang)b).getluas(); 
    return (aluas > bluas); 
    
    
    }
    
    @Override
    public boolean isLess( Object a, Object b){ 
    double aluas = ((persegipanjang)a).getluas(); 
    double bluas = ((persegipanjang)b).getluas(); 
    return (aluas < bluas); 
 } 
 
    @Override
 public boolean isEqual( Object a, Object b){ 
    double aluas = ((persegipanjang)a).getluas(); 
    double bluas = ((persegipanjang)b).getluas(); 
    return (aluas == bluas); 
    
 } 
 
 
}
