/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo35april;

/**
 *
 * @author Vika
 */
public class student extends person{
    public student(){
        super ("ali", "padang");
        System.out.println("student:Constructor");
    }
    @Override
    
    public String getname(){
        System.out.println("student getname()");
            return name;
        }
    
}
