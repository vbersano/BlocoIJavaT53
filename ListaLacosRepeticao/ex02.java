//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

import java.util.Scanner;

public class ex02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n;
		int contadorImpar = 0, contadorPar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\nDigite um valor n ");
			System.out.println("Ou digite 0 para terminar o programa");
			System.out.print("n: ");
			n = ler.nextFloat();
			
			if (n%2!=0) {
				contadorImpar++;
				System.out.println("\n"+n+" é um numero impar");
			} else {
				contadorPar++;
				System.out.println("\n"+n+" é um numero Par");
			}
			
			
		}
		System.out.println("\n"+contadorImpar+" numeros Impares");
		System.out.println("\n"+contadorPar+" numeros Pares");
			

		
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("\n    Programa Finalizado!");
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		
	}

}
