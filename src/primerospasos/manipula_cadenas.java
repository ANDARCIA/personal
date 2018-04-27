package primerospasos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaozhi
 */
public class manipula_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre="Eduardo";
        int ultima_letra;
        ultima_letra=nombre.length();
        
        
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("Y la última letra es " + nombre.charAt(ultima_letra-1));
        
        System.out.println("");
        
        String frase="Hoy es un estupendo día para aprender a programar en JAVA";
        String frase_resumen=frase.substring(0 , 29) + "irnos a la playa y olvidarnos de todo...." + 
                "\n y " + frase.substring(29, 57);
        
        System.out.println(frase);
        System.out.println(frase_resumen);
        
        System.out.println();
        
        String alumno1,alumno2;
        
        alumno1="David";
        alumno2="david";
        
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
    }
}
