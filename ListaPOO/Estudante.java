package ListaPOO;

public class Estudante {
	
	//ATTS
	public String nome;
	public int RA;
	public double nota1;
	public double nota2;
	public double nota3;

	//METODO
	public double notaFinal() {
		return (nota1 + nota2 + nota3)/3;
	}
	
	//METODO
	public double notaFaltante () {
		if(notaFinal() < 60) {
			return 60 - notaFinal();
		} else {
			return 0;
		}
		
	}
	

}