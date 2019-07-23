package TrabajoPracticoDespuesdeVacaiones;

import java.util.Scanner;

public class Ejercicio_2 {
	
	Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A=0;
		int B=0;
		int C=0;
		int aux2;
		int aux3;
		int aux1;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		System.out.println("El valor de A es:"+ A);
		System.out.println("El valor de C es:"+ C);
		System.out.println("El valor de B es:"+ B);
		
		aux1 = A;
		A = C;
		C = aux1;
		
		System.out.println("El nuevo valor de A es el valor de C:"+ A);
		System.out.println("El nuevo valor de C es el valor de A:"+ C);
		System.out.println("El valor de B sigue siendo el mismo:" + B);
	}

}