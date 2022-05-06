//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosDecisao;

import java.util.Scanner;

public class ex04 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		double raiz, quadrado;
		
		System.out.println("\nDigite um número inteiro qualquer");
		
		n1 = sc.nextInt();
		
		if (n1%2==0) {
			raiz = Math.sqrt(n1);
			System.out.print("\n\nO numero " + n1 + " é par, e sua raiz quadrada é: " + raiz);
			
		} else {
			
			quadrado = Math.pow(n1, 2);
			System.out.println("\nO numero " + n1 + " é impar, e seu quadrado é: " + quadrado);
		}
		
		//fim do programa
	}

}
