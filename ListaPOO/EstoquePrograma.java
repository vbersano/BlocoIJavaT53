package ListaPOO;

import java.util.Scanner;

public class EstoquePrograma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estoque produto = new Estoque();
		
		System.out.println("Informe Dados do Produto");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço do Produto: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.print("DADOS DO PRODUTO: "+produto.stats());
		
		int decisao;
		System.out.println("\nAtualizar o estoque?");
		System.out.println("[0]Finalizar Operação\n[1]Adicionar Produtos\n[2]Remover Produtos");
		decisao = sc.nextInt();
		
		switch(decisao) {
		
		case 0:
			System.out.println("ATUALIZAÇÃO DADOS DO PRODUTO: "+produto.stats());
			break;
		
		case 1:
			System.out.println();
			System.out.println("Informe o n° de produtos a serem adicionados no estoque");
			int quantidade = sc.nextInt();
			produto.adicionarProduto(quantidade);
			System.out.println("ATUALIZAÇÃO DADOS DO PRODUTO: "+produto.stats());
			break;
			
		case 2:
			System.out.println();
			System.out.println("Informe o n° de produtos a serem removidos do estoque");
			quantidade = sc.nextInt();
			produto.removerProduto(quantidade);
			System.out.println("ATUALIZAÇÃO DADOS DO PRODUTO: "+produto.stats());
			break;
		}
		
		
	}

}
