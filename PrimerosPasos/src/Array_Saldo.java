/**
 *
 */

/**
 * @author jiaozhi
 *
 */
public class Array_Saldo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  acumulado;
		double  interes=10;
		
		double [][] saldo=new double [6][5];


		for (int i=0;i<6;i++) {
		
				saldo[i][0]=1000;
				acumulado=100;
			
			for (int j=1;j<5;j++ ) {
				
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
			
			interes=interes+01;
		}
		double intereses=10;
		for (int z=0;z<6;z++) {
			
			System.out.println();
			System.out.println();
			
			for (int h=0;h<5;h++) {
			
			
			System.out.print("Interes del " + intereses + "% "); 
			System.out.printf("%1.2f", saldo[z][h]);
			System.out.print(" US " + " ");
			System.out.println();
			
			}
			
			intereses=intereses+1;
		}

	}

}
