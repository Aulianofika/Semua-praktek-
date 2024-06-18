/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika16mei2024;

/**
 *
 * @author Vika
 */
public class relationexample {
    public static void main(String[] args){
      
        persegipanjang p1 = new persegipanjang(25,60);
        persegipanjang p2 = new persegipanjang(70,55);
                
        relation luas = new persegipanjang();
        System.out.println("luas persegi1  :"+p1.getluas());
        System.out.println("luas persegi2  :"+p2.getluas());
        System.out.println(luas.isGreater(p1,p2));
        System.out.println(luas.isLess(p1,p2));
        System.out.println(luas.isEqual(p1,p2));
        
    }      
}
