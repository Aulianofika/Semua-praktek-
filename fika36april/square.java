/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika36april;

/**
 *
 * @author Vika
 */
public class square extends shape{
    private int sisi;
    
    public square(){      
    }
    
    public int getSisi(){
        return sisi;
    }
    
    public void  setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public String getname(){
        return "square";
    }
    @Override
    public double getarea(){
        return sisi*sisi;
    }
}
