//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosDecisao;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int idade;
		
		System.out.println("Escreva a idade do participante da competi��o:\n");
		
		idade = sc.nextInt();
		
		if (idade >= 10 && idade < 14) {
			System.out.println("\nO participante concorrer� na categoria infantil\n");
			
		} else if (idade >= 14 && idade < 17 ) {
			System.out.println("\nO participante concorrer� na categoria adolescente\n");
			
		} else if (idade >= 17 && idade <=25) {
			System.out.println("\nO participante concorrer� na categoria jovem adulto\n");
			
		} else if (idade < 10 || idade > 25) {
			System.out.println("\nO participante n�o possui a idade apropriada para essa competi��o\n");
			
		}
		
	}

}
