//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosDecisao;

import java.util.Scanner;

public class ex01 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaração de vetor
		int numero[] = new int[3];
		int maiorNumero=-2147483648;
		
		for (int x = 0; x<3; x++) {
			
			System.out.println("Defina um valor positivo para o n°"+(x+1));
			numero[x] = sc.nextInt();
			
			if(numero[x]>maiorNumero) {
				maiorNumero=numero[x];
			}
			
		}
		System.out.println("O maior numero é: "+ maiorNumero);
		
	}

}
