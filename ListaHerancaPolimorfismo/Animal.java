package ListaHerancaPolimorfismo;

public abstract class Animal {
	

	//ATTS
	public String nome;
	public String especie;
	public String genero;
	public int idade;
	
	
	public Animal(String especie, String genero) {
		this.especie = especie;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void som() {
		System.out.print("ONOMATOPEIA");;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void movimento() {
		System.out.println("movimento");
	}
	
	
	public String data () {
		return
		"DADOS DO " + especie
		+ "\nNOME DO ANIMAL: " + getNome()
		+ "\nSEXO DO ANIMAL: " + genero
		+ "\nIDADE ANIMAL: " + getIdade() + " ANOS"
		;
	}
	
	
}
