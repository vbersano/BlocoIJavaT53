package ListaLacosDecisao;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		int maiorNumero=0, menorNumero=0, meioNumero=0;
		
		System.out.println("\nDigite o primeiro numero\n");
		n1 = sc.nextInt();
		System.out.println("\nDigite o segundo numero\n");
		n2 = sc.nextInt();
		System.out.println("\nDigite o terceiro numero\n");
		n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			maiorNumero=n1;
		} 
		if (n2>n3 && n2>n1) {
			maiorNumero=n2;
		} 
		if (n3>n1 && n3>n2) {
			maiorNumero=n3;
		} 
		
		//
		
		if (n1<n2 && n1<n3) {
			menorNumero=n1;
		} 
		if (n2<n3 && n2<n1) {
			menorNumero=n2;
		} 
		if (n3<n1 && n3<n2) {
			menorNumero=n3;
		} 
		
		//
		
		if (n1>menorNumero && n1<maiorNumero) {
			meioNumero=n1;
		}
		
		if (n2>menorNumero && n2<maiorNumero) {
			meioNumero=n2;
		}
		
		if (n3>menorNumero && n3<maiorNumero) {
			meioNumero=n3;
		}
		
		System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println("\n"+menorNumero);
		System.out.println("\n"+meioNumero);
		System.out.println("\n"+maiorNumero);
		System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		//fim do programa
	}

}
