package ListaPOO;

import java.util.Scanner;

public class FuncionarioPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario(5000);
		System.out.print("Insira o Nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Insira o Sobrenome do funcion�rio: ");
		funcionario.sobrenome = sc.nextLine();
		
		System.out.println("\n"+funcionario.data());
		
		System.out.println("\nAtribua uma porcentagem de aumento para o sal�rio de "+funcionario.nome);
		funcionario.aumentoPct = sc.nextDouble();
		
		System.out.println("\n"+funcionario.data());
		
	}

}
