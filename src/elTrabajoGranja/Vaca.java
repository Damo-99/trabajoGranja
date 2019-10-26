package elTrabajoGranja;

public class Vaca extends Animal {

	private int leche = 80;
	private String nombre;
	
	public Vaca(String nombre) {
		this.nombre = nombre;
	}

	public int getLeche() {
		return leche;
	}
	
	public void setLeche( int leche) {
		this.leche = leche;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int darLeche() {
		int laLeche;
		laLeche = getLeche();
		return laLeche;
	}
	
}
