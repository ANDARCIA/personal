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
public class Adivina_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int aleatorio=(int)(Math.random()*10);
        
        
        Scanner entrada=new Scanner (System.in);
        
        int numero=0; 
        int intentos=0;
        
        while (numero != aleatorio) {
            intentos++;
            System.out.println("Introduce un número");
            numero=entrada.nextInt();
        
            if (aleatorio<numero) {
                
                System.out.println("Mas bajo");
                
            }
            else if (aleatorio>numero){
                
                System.out.println("Mas alto");
                
            }
            
        }
       
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
    }
    
}
