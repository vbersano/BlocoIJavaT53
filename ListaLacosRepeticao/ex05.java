//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

import java.util.Scanner;

public class ex05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n, soma = 0;
		
		do {
			
			System.out.println("\n\nDigite um valor n ");
			System.out.println("Ou digite 0 para terminar o programa");
			System.out.print("n: ");
			n = ler.nextFloat();
			
			if (n!=0) {
				soma = soma + n;
				System.out.println("\nA soma atual dos numeros digitados é: " + soma);
			}

			
		} while (n != 0);
		
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		System.out.println("\nPrograma Finalizado!");
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}

}
