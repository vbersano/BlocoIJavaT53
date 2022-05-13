package ListaHerancaPolimorfismo;

public class Cavalo extends Animal{

	public Cavalo(String especie, String genero) {
		super(especie,genero);
		
	}
	
	@Override
	public void movimento() {
		System.out.println("\nCORRENDO\nPULANDO\nCORRENDO");
	}
	
	@Override
	public void som() {
		System.out.println("IHIHIHIHI !");
	}
	
}
