//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaVetoresMatrizes;

import java.util.Random;

public class ex03 {
	public static void main(String[] args) {
		
		Random nAleatorio = new Random();
		
		int N1 [][] = new int[4][6];
		int N2 [][] = new int[4][6];
		int M1 [][] = new int[4][6];
		int M2 [][] = new int[4][6];
		
		System.out.println("\nGeração das Matrizes:\n\n\nN1:\n");
		
		
		for (int l=0; l<4; l++) {
			for (int c=0; c<6; c++) {
				N1[l][c]= nAleatorio.nextInt(5);
				System.out.print("["+N1[l][c]+"]");
			}
			System.out.println();
		}//fim criação N1
		
		System.out.println("\nN2:\n");
		
		
		for (int l=0; l<4; l++) {
			for (int c=0; c<6; c++) {
				N2[l][c]= nAleatorio.nextInt(5);
				System.out.print("["+N2[l][c]+"]");
			}
			System.out.println();
		}//fim criação N2
		
		System.out.println("\nM1 = N1 + N2\n");
		
		for (int l=0; l<4; l++) {
			for (int c=0; c<6; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				System.out.print("["+M1[l][c]+"]");
			}
			System.out.println();
		}//fim criação M1
		
		System.out.println("\nM2 = N1 - N2:\n");
		
		for (int l=0; l<4; l++) {
			for (int c=0; c<6; c++) {
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.print("["+M2[l][c]+"]");
			}
			System.out.println();
		}//fim criação M2
		
		
		
	}//fim programa

}
