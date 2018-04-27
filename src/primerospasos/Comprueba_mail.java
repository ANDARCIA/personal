package primerospasos;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author jiaozhi
 */
public class Comprueba_mail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean punto=false;
		int arroba=0;
        
        String mail=JOptionPane.showInputDialog("Introduzca mail");
        
        for (int i = 0; i < mail.length(); i++) {
            
            if (mail.charAt(i)=='@') {
                
                arroba++;
            }
            
            if (mail.charAt(i)=='.') {
            	
            	punto=true;
            	
            }
            if (arroba==1 && punto==true) {
                
                System.out.println("Es correcto");
                
            } else {
                
                System.out.println("No es correcto");
            }
            
        }
    }
    
}
