package ListaHerancaPolimorfismo;

import java.util.Scanner;

public class VeterinarioExHerancaEPolimorfismo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cachorro dog1 = new Cachorro("Canis lupus familiaris", "FÊMEA");
		Cavalo horse1 = new Cavalo("Equus caballus", "MACHO");
		Preguica sloth1 = new Preguica ("Bradypus torquatus", "FÊMEA");
		
		//CACHORRO
		System.out.printf("Insira o nome do %s", dog1.especie + ": ");
		dog1.nome = sc.nextLine();
		dog1.setNome(dog1.nome);
		
		System.out.printf("Insira a idade de %s", dog1.nome + ": ");
		dog1.idade = sc.nextInt();
		dog1.setIdade(dog1.idade);
		
		System.out.println();
		System.out.println(dog1.data());
		
		System.out.printf("\n%s: ",dog1.nome);
		dog1.som();
		dog1.movimento();
		
		System.out.println();
		
		//CAVALO
		System.out.printf("Insira os dados do %s", horse1.especie + ": ");
		horse1.nome = "POCOTÓ";
		horse1.setNome(horse1.nome);
		System.out.println();
		
		System.out.printf("Insira a idade de %s", horse1.nome + ": ");
		horse1.idade = sc.nextInt();
		horse1.setIdade(horse1.idade);
		
		System.out.println();
		System.out.println(horse1.data());
		
		System.out.printf("\n%s: ",horse1.nome);
		horse1.som();
		horse1.movimento();
		
		System.out.println();
		
		//PREGUIÇA
		System.out.printf("Insira os dados do %s", sloth1.especie + ": ");
		sloth1.nome = "XIMBINHA";
		sloth1.setNome(sloth1.nome);
		System.out.println();
		
		System.out.printf("Insira a idade de %s", sloth1.nome + ": ");
		sloth1.idade = 11;
		sloth1.setIdade(sloth1.idade);
		
		System.out.println();
		System.out.println(sloth1.data());
		
		System.out.printf("\n%s: ",sloth1.nome);
		sloth1.som();
		sloth1.movimento();
		
	}

}
