package ListaPOO;

import java.util.Scanner;
import java.util.Random;

public class EstudantePrograma {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Random Aleatorio = new Random();
	
	
	Estudante estudante1 = new Estudante();
	System.out.println("Dados do Estudante");
	estudante1.nome = "Antedeguemon Joojson";
	estudante1.RA = Aleatorio.nextInt(10000,100000);
	System.out.print("Aluno: " + estudante1.nome + "\nRA: "+estudante1.RA);
	System.out.println();
	
	System.out.println("\nInforme a nota do primeiro semestre");
	estudante1.nota1 = sc.nextDouble();
	System.out.println("\nInforme a nota do segundo semestre");
	estudante1.nota2 = sc.nextDouble();
	System.out.println("\nInforme a nota do terceiro semestre");
	estudante1.nota3 = sc.nextDouble();

	if (estudante1.notaFinal()<60) {
		System.out.println("REPROVADO");
		System.out.printf("NOTA FALTANTE %.2f%n", estudante1.notaFaltante());
	} else {
		System.out.println("APROVADO");
	}
	
		
	}

}
