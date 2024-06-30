/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fika36april;

/**
 *
 * @author Vika
 */
public class relationexample {
    public static void main(String[] args){
        line line1 = new line(1, 5, 1, 4);
        line line2 = new line(2, 5, 1, 4);
        
        relation line = new line();
        System.out.println("line 1  :"+line1.getLength());
        System.out.println("line2   :"+line2.getLength());
        System.out.println(line.isGreater(line1, line2));
    }
}
