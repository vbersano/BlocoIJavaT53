package ListaPOO;

public class AumentoSalario {
	String nome, sobrenome;
	double salario;
	double aumentoPct=0;
	
	//METODO CONSTRUTOR
	public AumentoSalario (double salario) {
		this.salario = salario;
	}
	
	public double aumentoCalculo () {
		double pct = 1 + (aumentoPct/100);
		return pct*salario;
	}
	
	public String data () {
		return
		"NOME DO FUNCIONÁRIO: "
		+ nome + " " + sobrenome
		+ System.out.printf("\nSALÁRIO ATUAL R$: %.2f%\n", aumentoCalculo());
	}
	
}
