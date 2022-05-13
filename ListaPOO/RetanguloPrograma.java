package ListaPOO;

import java.util.Scanner;
import java.util.Locale;

public class RetanguloPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Retangulo retangulo1 = new Retangulo();
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Insira a base do Retangulo: ");
		retangulo1.base = sc.nextDouble();
		
		System.out.println();
		System.out.print("Insira a altura do Retangulo: ");
		retangulo1.altura = sc.nextDouble();
		
		System.out.println();
		System.out.println(retangulo1.stats());

	}

}
