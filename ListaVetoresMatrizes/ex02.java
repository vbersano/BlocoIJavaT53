//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaVetoresMatrizes;

import java.util.Random;

public class ex02 {
	public static void main(String[] args) {
		int n[] = new int[10], nFreqMaior = 0, maiorNumero=0;
		float media, soma=0;
		
		Random Random = new Random();
		
		System.out.println("Lan�amentos:\n");
		
		for (int x=0; x<10; x++) {
			//gera numeros entre 0 e 6
			n[x] = Random.nextInt(7);
			
			//estrutura de la�o que impede que o numero 0 seja lan�ado
			//se n=0, entao gerar outro numero
			if (n[x]==0) {
				n[x] = Random.nextInt(7);
			}
			
			System.out.println(n[x]);
			
			if (n[x]>maiorNumero) {
				maiorNumero = n[x];
			}
			
		}
		
		//la�o que conta quantos n[x] = maior numero
		for(int x=0; x<10; x++) {
			if (n[x]==maiorNumero) {
				nFreqMaior++;	
			}
			soma = soma +n[x];			
		}
		
		media = soma/10;
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\n             Resultados:");
		System.out.println("\nM�dia aritm�tica dos lan�amentos: "+media);
		System.out.println("\nN� de ocorr�ncias da maior pontua��o: "+nFreqMaior);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}

}
