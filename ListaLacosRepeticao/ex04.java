//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

import java.util.Scanner;

public class ex04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//contadores
		int nFemNervo=0, totalCalmo=0, nMaleAgro=0, nOutroCalmo=0, nCalmoMenor18=0, nNervosoMais40=0, nPessoa=0;
		//variaveis
		int idade, psico, genero;
		
		while (nPessoa<150) {
			System.out.println("Informe seu genero: \n\n[1] Feminino\n[2] Masculino\n[3] Outro\n");
			genero = ler.nextInt();
			System.out.println("\nInforme sua idade\n");
			idade = ler.nextInt();
			System.out.println("Informe seu estado emocional: \n\n[1] Calmo\n[2] Nervoso\n[3] Agressivo\n");
			psico = ler.nextInt();
			
			if (idade>0 && genero>=1 && genero<=3 && psico>=1 && psico<=3) {
				nPessoa++;
				
				if (psico==1) {
					totalCalmo++;
				}
				
				
				if (idade<18 && psico==1) {
					nCalmoMenor18++;
				}
				
				if (idade>40 && psico == 2) {
					nNervosoMais40++;
				}
				
				if (genero == 3 && psico ==1) {
					nOutroCalmo++;
				}
				
				if  (genero ==1 && psico ==2) {
					nFemNervo++;
				}
				
				if  (genero ==2 && psico ==3) {
					nMaleAgro++;
				}
				
			} else {
				System.out.println("\n\nInsira Dados Válidos!!!!!!!\n");
				}
			
			
		} //fim while
		
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		
		System.out.println("\n\nNúmero de pessoas entrevistadas: "+nPessoa);
		System.out.println("\nNúmero de pessoas calmas: "+totalCalmo);
		System.out.println("Número de Mulheres nervosas: "+nFemNervo);
		System.out.println("Número de Homens agressivos: "+nMaleAgro);
		System.out.println("Número de Outros calmos: "+nOutroCalmo);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+nNervosoMais40);
		System.out.println("Número de pessoas Calmas com menos de 18 anos: "+nCalmoMenor18++);
		
		
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("\n    Programa Finalizado!");
		System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	}//fim programa

}
