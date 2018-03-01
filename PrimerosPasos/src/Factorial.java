/**
 * 
 */
import javax.swing.JOptionPane;
/**
 * @author jiaozhi
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		long resultado=1l;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
	
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
		}
	
		System.out.println("El factorial de " + numero + " es " + resultado);
		
	}

}
