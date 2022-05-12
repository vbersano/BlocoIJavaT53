//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
//link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1046
package ListaLacosRepeticao;

import java.util.Scanner;

public class desafioExtra {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] hora = new int[25];
		int x, y, dif, horario=1;
		
		for (int i=1; i<=24; i++) {
			hora[i]=horario;
			horario++;
			
		}
		
		System.out.println("Inputs:\n[0] = Terminar o programa\n\nAlcance:\n[1] = 01:00am até [24]=00:00am\n\n");
		
		//x = Hora de Inicio
		System.out.println("Em qual hora você começou a jogar?\n");
		x = sc.nextInt();
		
		//y = hora de Término do jogo
		System.out.println("Em qual hora você terminou de jogar?\n");
		y = sc.nextInt();
		
		dif = hora[x] - hora[y];
		
		if (dif<0) {
			dif = dif*(-1);
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
			System.out.println("Total horas de jogo: "+dif);
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
		} else if (dif==0 && x!=0 && y!=0) {
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
			System.out.println("Total de horas de jogo: 24");
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
		} else if (dif>0){
			int correcao = (24-hora[x])+hora[y];
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
			System.out.println("\n\nTotal horas de jogo: "+ correcao);
			System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
		} 
	
		System.out.println("\n\n   Programa Finalizado!");
		
	}//fim do programa

}
