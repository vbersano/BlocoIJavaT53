package ListaPOO;

public class ClienteModelo {
	
	//ATTS
	String nome;
	String sobrenome;
	String genero;
	int idade;
	int nCPF;
	//ATTS
	int nCliente;
	int nPedido;
	double nCredito;
	double nCredAtt=0;
	
	//METODO CONSTRUTIVO
	public ClienteModelo(int idade, String genero) {
		this.idade = idade;
		this.genero = genero;
	}
	
	public String CPF () {
		return nCPF+"-XX";
	}
	
	//METODO
	public void removerCredito(int credito) {
		this.nCredito -= credito;
	}
	
	public void adicionarCredito(int credito) {
		this.nCredito += credito;
	}
	
	public double sistCredito () {
		return nCredito - nCredAtt;
		
	}
	
	//METODO
	public String dataCliente() {
		return 
		"\n\nPEDIDO N°: " + nPedido
		+"\nNOME DO CLIENTE: " + nome + " " + sobrenome
		+ "\nIDADE: " + idade
		+ "\nGENERO: " + genero
		+ "\nCPF: " + CPF()
		+ "\nTotal de Créditos: " + sistCredito()
		;
	}
	
	

}
