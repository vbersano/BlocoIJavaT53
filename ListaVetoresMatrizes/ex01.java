//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaVetoresMatrizes;

import java.util.Scanner;

public class ex01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[5], maior=0;
		
		for (int x=0; x<5; x++) {
			System.out.println("Digite um valor para o "+(x+1)+"° numero\n");
			n[x] = sc.nextInt();
			if (n[x]>maior) {
				maior = n[x];
			}
			
		}
		
		System.out.println("\nO maior número digitado é: "+maior);
	}

}
