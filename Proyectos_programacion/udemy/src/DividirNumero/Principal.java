package DividirNumero;

import java.util.Scanner;

public class Principal {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		
		int numero, num1,num2,num3,num4,num5;
		
		System.out.println("ingresar numero");
		
		numero = input.nextInt();
		
		num1 =  (numero % 10);
		
		
		numero =  (numero/10);
		num2 = (numero %10);
		
		numero =  (numero/10);
		num3 = (numero %10);
		
		numero =  (numero/10);
		num4 = (numero %10);
		
		numero =  (numero/10);
		num5 = (numero %10);
		
		System.out.println("Posicion numero 1° es : "+ num1+"\n");
	
		System.out.println("Posicion numero 2° es : "+num2+ "\n");
	
		System.out.println("Posicion numero 3° es : "+num3+ "\n");
	
		System.out.println("Posicion numero 4° es : "+num4+ "\n");
		
		System.out.println("Posicion numero 5° es : "+num5+ "\n");
		
	


	}

}
