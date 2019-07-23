package CreacionDeObjeto;

import java.io.InputStream;

public class Humano {

	String nombre;
	int peso;
	int altura;
	int edad;

	public Humano(InputStream in) {
		// TODO Apéndice de constructor generado automáticamente
	}


	public void avanzar() {
		System.out.println("El humano recorrio 10 Km");
	}


	public int kilometrosrecorridos(int kilometros) {

		return kilometros;
	}
	// Inicio del metodo main
	public static void main(String[] args) {

		System.out.println("Hola, damos a conocer los datos del humano.");

		Humano objeto = new Humano(null);

		objeto.nombre = "Jonatan San Roman";

		System.out.println("El nombre del humano es: "+objeto.nombre);

		objeto.peso = 91;

		System.out.println("El peso es :"+objeto.peso);

		objeto.altura = 185;

		System.out.println("La altura es :"+objeto.altura);

		objeto.edad = 25;

		System.out.println("La edad es en centimetros :"+objeto.edad);

		objeto.avanzar();
		
		

	}//fin del metodo main

}
