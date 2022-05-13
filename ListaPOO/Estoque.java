package ListaPOO;

public class Estoque {
	
	public double preco;
	public String nome;
	public int quantidade;
	
	
	
	//METODOS
	
	public double totalValorStock() {
		return quantidade*preco;
	}
	
	//somar int quantidade  em quantidade
	//this.variavel -> acessa o atributo da classe
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String stats () {
		return nome + ", $ " + String.format ("%.2f", preco) + ",  " + quantidade+" unidades, "+"TOTAL($): "+String.format ("%.2f", totalValorStock());
		
	}

}
