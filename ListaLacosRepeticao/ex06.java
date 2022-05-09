//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

import java.util.Scanner;

public class ex06 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, soma = 0, contador=0;
		float media;
		
		do {
			
			System.out.println("\n\nDigite um valor n ");
			System.out.println("Ou digite 0 para terminar o programa");
			System.out.print("n: ");
			n = ler.nextInt();
			
			if (n%3==0 && n!=0) {
				contador++;
				soma = soma + n;
				media = (float) soma/(contador);
				System.out.println("\nA media atual dos numeros digitados é: " + media);
			}

			
		} while (n != 0);
		
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		System.out.println("\nPrograma Finalizado!");
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}

}
