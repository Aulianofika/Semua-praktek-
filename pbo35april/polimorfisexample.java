/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo35april;

/**
 *
 * @author Vika
 */
public class polimorfisexample {
    public static void printInformation( person p){
        System.out.println("nama        :"+p.getname());
        System.out.println("alamat      :"+p.getaddress());
    }
    public static void main(String[] args){
        //person ref;
        student studentObject = new student();
        studentObject.setname("'ali");
        studentObject.setaddress("padang");
        employee employeeObject = new employee();
        employeeObject.setname("deni");
        employeeObject.setaddress("padang panjang");
        
   /*     ref = studentObject;
        System.out.println("nama        :"+ref.getname());
        System.out.println("alamat      :"+ref.getaddress());
        
        ref = employeeObject;
        System.out.println("nama        :"+ref.getname());
        System.out.println("alamat      :"+ref.getaddress());
        */
        printInformation(studentObject);
        printInformation(employeeObject);
    }
    
}

