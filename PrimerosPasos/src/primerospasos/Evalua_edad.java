package primerospasos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaozhi
 */
public class Evalua_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce tu edad por favor");
        
        int edad=entrada.nextInt();
        
        if (edad < 18){
            System.out.println("Eres un adolescente");
        }
        
        else if(edad < 40){
            
            System.out.println("Eres joven");
            
        }
        
        else if(edad < 65){
            
            System.out.println("Eres mayor");
            
           
        }
        else {
            System.out.println("Cuidate");
        }        
        
    }
    
}
