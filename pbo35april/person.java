/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo35april;

/**
 *
 * @author Vika
 */
public class person {
    protected String name; //protected bisa dipakai oleh subclassnya saja
    protected String address;
    
    public person(){
        System.out.println("Person:Constructor");
        name = "";
        address = "";
         
    }
        public person (String name, String address){
            this.name= name;
            this.address=address;
    }
        public String getname(){
            System.out.println("person getname");
            return name;
        }
        public String getaddress(){
            return address;
        }
        public void setname(String name){
            this.name = name;
        }
        public void setaddress(String address){
            this.address = address;
        }
        
}
