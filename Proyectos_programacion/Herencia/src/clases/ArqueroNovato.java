package clases;

public class ArqueroNovato extends Arquero{
	
	int numeroDeMedallas;
	
	
	public void entrenarArquero() {
		System.out.println("El arquero novato empezo a entrenar ! ");
	}

	public void terminarEntrenamientoAquero() {
		System.out.println("El arquero termino de entrenar ! ");
	}
	
	public void mostrarMedallas() {
		System.out.println("La cantidad de medallas es: " + numeroDeMedallas);
	}
	
}
