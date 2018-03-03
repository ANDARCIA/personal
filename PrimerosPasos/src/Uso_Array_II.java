/**
 * 
 */

/**
 * @author jioazhi
 *
 */
public class Uso_Array_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paises [] ={"España","México","Colombia","Perú","Chile","Argentina","Ecuador","venezuela"};
		
		for (int i=0;i<paises.length;i++) {
			
			System.out.println("País " + (i+1) + " " + paises[i]);
		}
	
		int [] matriz_aleatorio= new int [150];
		
		for (int i=0; i<matriz_aleatorio.length; i++) {
			matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int numeros:matriz_aleatorio) {
			
			System.out.println(numeros);
			
		}
	}

}
