package ListaHerancaPolimorfismo;

public class Preguica extends Animal{

	public Preguica(String especie, String genero) {
		super(especie,genero);
		
	}
	
	@Override
	public void movimento() {
		System.out.println("\nESCALANDO\nESCALANDO\nESCALANDO");
	}
	
	@Override
	public void som() {
		System.out.println("zzzZZZZZZzzz");
	}
	
}
