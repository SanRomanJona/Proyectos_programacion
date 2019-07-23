package TrabajoPracticoDespuesdeVacaiones;

import java.util.Scanner;

public class Ejercicio_1 {

	Scanner input;
	private static Scanner input2;

	public static void main(String[] args) {
		input2 = new Scanner(System.in);


		int numero1;
		int numero2;
		int aux=0;

		numero1 = input2.nextInt();
		numero2 = input2.nextInt();

		if(numero2>numero1) {
			aux=numero1;
			numero1= numero2;
		}
		System.out.println("La suma de los 2 numeros es: "+ (numero1+numero2));
		System.out.println("La resta de los 2 numeros es: "+ (numero1-numero2));
		System.out.println("La division de los 2 numeros es: "+ (numero1/numero2));
		System.out.println("La multiplicacion de los 2 numeros es: "+ (numero1*numero2));


	}

}
