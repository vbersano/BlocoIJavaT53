package ListaPOO;

public class Funcionario {
	String nome, sobrenome;
	double salario;
	double aumentoPct=0;
	
	//METODO CONSTRUTOR
	public Funcionario (double salario) {
		this.salario = salario;
	}
	
	public double aumentoCalculo () {
		double pct = 1 + (aumentoPct/100);
		return pct*salario;
	}
	
	public String data () {
		return
		"NOME DO FUNCION�RIO: "
		+ nome + " " + sobrenome
		+ System.out.printf("\nSAL�RIO ATUAL R$: %.2f%n", aumentoCalculo());
	}
	
}
