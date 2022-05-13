package ListaPOO;

public class Retangulo {
	
	public double altura;
	public double base;
	
	//METODO
	public double areaCalc() {
		return altura*base;
	}
	
	public double perimetroCalc() {
		return 2*(altura+base);
	}
	
	public double hipotenusaCalc() {
		double i = Math.pow(altura, 2) + Math.pow(base, 2);
		return Math.sqrt(i);
	}
	
	public String stats() {
		return "AREA: "
		+ areaCalc()
		+ "\nPERIMETRO: "
		+ perimetroCalc()
		+ System.out.printf("\nCOMPRIMENTO DIAGONAL: %.2f%n", hipotenusaCalc());
		
	}
	
}
