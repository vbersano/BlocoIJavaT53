package ListaHerancaPolimorfismo;

public class Cachorro extends Animal {
	
	
	public Cachorro(String especie, String genero) {
		super(especie,genero);
		
	}
	
	@Override
	public void movimento() {
		System.out.println("\nCORRENDO\nPULANDO\nCORRENDO");
	}
	
	@Override
	public void som() {
		System.out.println("ROOF ROOF !");
	}
	
}
