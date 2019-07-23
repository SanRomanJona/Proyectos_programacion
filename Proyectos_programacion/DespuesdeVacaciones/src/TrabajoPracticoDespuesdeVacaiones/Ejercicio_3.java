package TrabajoPracticoDespuesdeVacaiones;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int suma=0;

		System.out.println("Hola, ingrese 10 numero:");

		for(int x=0;x>9;x++){

			System.out.println("Ingrese el numero "+ x + ": ");

			int numero = input.nextInt();

			suma =+ numero;
		}

		System.out.println("La suma de los 10 numero es: "+suma+".");
	}

}
