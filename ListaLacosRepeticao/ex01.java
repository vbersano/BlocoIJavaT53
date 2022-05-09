//Feito por: Vinicius Bersano. T53 Java Web Generation Brasil
package ListaLacosRepeticao;

public class ex01 {
	public static void main(String[] args) {
		
		System.out.println("Numeros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5");
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
		
		for (int x = 1000; x <=1999; x++) {
			if (x%11==5) {
				System.out.println(x);
			}
			
		}
		
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");
		System.out.println("Programa Finalizado!");
		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
	}

}
