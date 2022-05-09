//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

import java.util.Scanner;

public class ex03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0, contadorMenor21=0, contadorMaior50=0;
		
		while (idade!= -99) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if (idade < 21 && idade>0) {
				contadorMenor21++;
			} else if (idade > 50) {
				contadorMaior50++;
			}
			
		}
		
		System.out.println("\nNumero de Pessoas mais de 50 anos de idade: "+contadorMaior50+"\n");
		System.out.println("Numero de Pessoas com menos de 21 anos de idade: "+contadorMenor21+"\n");
		
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("\n    Programa Finalizado!");
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	}

}
