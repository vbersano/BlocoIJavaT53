//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaVetoresMatrizes;

import java.util.Random;

public class ex04 {
	public static void main(String[] args) {
		Random nAleatorio = new Random();
		
		int n[][] = new int[3][3];
		int somaDiagonal = 0, somaTotal=0;
		
		System.out.println("\nMatriz:\n");
		
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				n[l][c]= nAleatorio.nextInt(10);
				System.out.print("["+n[l][c]+"]");
				
				somaTotal+=n[l][c];
				
				if (l==c) {
					somaDiagonal+=n[l][c];
				}
			
			}
			System.out.println();
		}//fim criação N1
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\n                Resultados:");
		System.out.println("\nSoma dos Elementos na Diagonal da Matriz: "+somaDiagonal);	
		System.out.println("\nSoma de todos os Elementos da Matriz: "+somaTotal);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}//fim programa
}
