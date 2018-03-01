/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;



/**
 *
 * @author jiaozhi
 */
public class Calculos_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double raiz=Math.sqrt(9);
        double num1=5.85;
        int resultado=(int)Math.round(num1);
        double base=3;
        double exponente=4;       
        int total=(int)Math.pow(base, exponente);        
        
        System.out.println("Método:");
        System.out.println("sqrt " + raiz);
        System.out.println("round " + resultado);
        System.out.println("pow " + total);
    }
    
}
