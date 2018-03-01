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
public class Array_bidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matrix=new int [4][5];
		
		matrix[0][0]=12;
		matrix[0][1]=46;
		matrix[0][2]=42;
		matrix[0][3]=756;
		matrix[0][4]=756;
		
		matrix[1][0]=76;
		matrix[1][1]=67;
		matrix[1][2]=132;
		matrix[1][3]=412;
		matrix[1][4]=756;
		
		matrix[2][0]=12;
		matrix[2][1]=46;
		matrix[2][2]=42;
		matrix[2][3]=756;
		matrix[2][4]=756;
		
		matrix[3][0]=76;
		matrix[3][1]=67;
		matrix[3][2]=132;
		matrix[3][3]=412;
		matrix[3][4]=756;
		
		for (int i=0;i<4;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
		}
    }
    
}
