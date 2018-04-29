/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;


import javax.swing.JOptionPane;

/**
 *
 * @author jiaozhi
 */
public class Acceso_Aplicacion {

    
    /**
     * @param args the command line arguments
     * @param INFORMATION_MESSAGE
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave="Eduardo";
        String pass="";
        
        while (clave.equals(pass)==false){
        
            pass=JOptionPane.showInputDialog("Introduce la contraseña");
            
            
            if (clave.equals(pass)==false){
                
                JOptionPane.showMessageDialog(null,"Intente de nuevo."
                        + " Contrseña Incorrecta. ");
                
            }
            
            JOptionPane.showMessageDialog(null," Contrseña Correcta. "
                        + "Acceso Permitido");
        
         }
    }
    

    
}
