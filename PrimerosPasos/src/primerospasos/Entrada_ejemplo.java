/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jiaozhi
 */
public class Entrada_ejemplo {

    private static String JJOptionPane(String introduce_tu_nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre_usuario=entrada.nextLine();
        System.out.println("Introduce tu edad");
        
        int edad=entrada.nextInt();
        
        System.out.println("Hola " + nombre_usuario + ".El año que viene tendrás "
        + (edad+1) + " años");
        
        
        String nombre_usuario2=JOptionPane.showInputDialog("Introduce tu nombre");
        
        String edad2=JOptionPane.showInputDialog("Introduce tu edad");
        
        int edad_usuario=Integer.parseInt(edad2);
        
        System.out.println("Hola " + nombre_usuario2 + ".El año que viene tendrás "
        + (edad_usuario +1) + " años");
    }
    
}
