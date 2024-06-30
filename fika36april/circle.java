/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika36april;

/**
 *
 * @author Vika
 */
public class circle extends shape{
    private int jari;
    
    public circle(){
        
    }
    public int getjari(){
        return jari;
    }
    public void setjari(int jari){
        this.jari=jari;
    }
    public String getname(){
        return "circle";
    }
    public double getarea(){
        return 3.14 * jari*jari;
    }

    void setRadius(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
