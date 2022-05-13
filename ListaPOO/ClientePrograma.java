package ListaPOO;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ClientePrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random nAleatorio = new Random();
		Locale.setDefault(Locale.US);
		
		ClienteModelo cliente1 = new ClienteModelo(22, "M");
		System.out.print("Insira o Nome do Cliente: ");
		cliente1.nome = sc.nextLine();
		System.out.print("Insira o Sobrenome do Cliente: ");
		cliente1.sobrenome = sc.nextLine();
		cliente1.nCPF = nAleatorio.nextInt(100000000,999999999);
		
		cliente1.nPedido = nAleatorio.nextInt(0, 500);
		
		System.out.print("Defina a Quantidade de Créditos do Cliente: ");
		cliente1.nCredito = sc.nextDouble();
		System.out.println("DADOS DO CLIENTE: "+cliente1.dataCliente());

		//Atualização Crédito
		
		int decisao;
		System.out.printf("\nAtualizar os Dados de %s", cliente1.nome);
		System.out.println("\n[0]Finalizar Operação\n[1]Adicionar Crédito\n[2]Remover Crédito");
		decisao = sc.nextInt();
		
		switch(decisao) {
		
		case 0:
			System.out.println("ATUALIZAÇÃO DADOS DO CLIENTE: "+cliente1.dataCliente());
			break;
		
		case 1:
			System.out.println();
			System.out.println("Informe o n° de Créditos a serem adicionado à conta");
			int credito = sc.nextInt();
			cliente1.adicionarCredito(credito);
			System.out.println("ATUALIZAÇÃO DADOS DO CLIENTE: "+cliente1.dataCliente());
			break;
			
		case 2:
			System.out.println();
			System.out.println("Informe o n° de Créditos a serem removidos à conta");
			credito = sc.nextInt();
			cliente1.removerCredito(credito);
			System.out.println("ATUALIZAÇÃO DADOS DO CLIENTE: "+cliente1.dataCliente());
			break;
		}
			

	}//fim programa

}
