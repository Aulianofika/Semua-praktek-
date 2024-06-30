/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika36april;

/**
 *
 * @author Vika
 */
public class abstractexample {
    public  static void main(String[] args){
        square square = new square();
        square.setSisi(20);
        System.out.println("nama        : "+square.getname());
        System.out.println("area        : "+square.getarea());
     
        
        circle circle = new circle();
        circle.setRadius(20);
        System.out.println("name :"+circle.getname());
        System.out.println("area :"+circle.getname());
        
    }
}
