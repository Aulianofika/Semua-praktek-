/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulia_14maret2024;

/**
 *
 * @author Vika
 */
public class contohFor {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        
        for (int i=0;i<10;i++){
            if(i==5){
                break;
                
            }
            System.out.println(i);
        }
        for (int i=0;i<10;i++){
            if(i==5){
                continue;
                
            }
            System.out.println(i);
        }
    }
    
}
