package elTrabajoGranja;

import java.util.ArrayList;

public class Granjero {

	int miLeche;
	ArrayList<Vaca> misVacas = new ArrayList<Vaca>();
	Mantequera miMantequera = new Mantequera();
	Yogurtera miYogurtera = new Yogurtera();
	int tambo = 0;
	int manteca = 0;
	int yogurt = 0;

	public Granjero() {

		int i;

		for (i = 0; i < 5; i++) {
			int j = i+1;
			misVacas.add(new Vaca("vaca" + j));
			System.out.println("Ordeño leche de " + misVacas.get(i).getNombre());
		}
	}

	public void obtenerLeche() {
		int i;
		for (i = 0; i < 5; i++) {
			tambo = tambo + misVacas.get(i).darLeche();
		}
		System.out.println("Ya tengo " + tambo + " litros de leche");
	}

	public void obtenerManteca() {
		tambo = tambo - 200;
		manteca = miMantequera.darManteca(200);
		System.out.println("Ya tengo " + manteca + " kg de manteca");
	}

	public void obtenerYogurt() {
		tambo = tambo - (3 / 4 * tambo);
		yogurt = miYogurtera.hacerYogurt(200);
		System.out.println("Ya tengo " + yogurt + " litros de yogurt");
	}
}
	

