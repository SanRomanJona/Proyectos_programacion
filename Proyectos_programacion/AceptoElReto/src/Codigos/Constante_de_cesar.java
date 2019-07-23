package Codigos;
import java.io.IOException;
import java.util.Scanner;

public class Constante_de_cesar {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		
		String texto;
		int codigo;
		char opcion = 0;
		
		//Introducir un texto
		do {
			System.out.print("Introduce un texto: ");
			
			texto = input.nextLine();
			
		} while (texto.isEmpty());
		//Introducir el valor del desplazamiento
		do {
			System.out.print("Introduce el código: ");
			codigo = input.nextInt();
		} while (codigo < 1);
		//Introducir la operación a realizar: cifrar o descifrar
		do {
			input.nextLine();
			System.out.print("(C) cifrar o (D) descifrar?: ");
			try {
				opcion = (char)  System.in.read();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
				System.out.println("Error de ejecucion");
			}
		} while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
		if (Character.toUpperCase(opcion) == 'C') {
			System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
		} else {
			System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
		}
	}
//método para cifrar el texto
public static String cifradoCesar(String texto, int codigo) {
	StringBuilder cifrado = new StringBuilder();
	codigo = codigo % 26;
	for (int i = 0; i < texto.length(); i++) {
		if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
			if ((texto.charAt(i) + codigo) > 'z') {
				cifrado.append((char) (texto.charAt(i) + codigo - 26));
			} else {
				cifrado.append((char) (texto.charAt(i) + codigo));
			}
		} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
			if ((texto.charAt(i) + codigo) > 'Z') {
				cifrado.append((char) (texto.charAt(i) + codigo - 26));
			} else {
				cifrado.append((char) (texto.charAt(i) + codigo));
			}
		}
	}
	return cifrado.toString();
}
//método para descifrar el texto

public static String descifradoCesar(String texto, int codigo) {
	StringBuilder cifrado = new StringBuilder();
	codigo = codigo % 26;
	for (int i = 0; i < texto.length(); i++) {
		if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
			if ((texto.charAt(i) - codigo) < 'a') {
				cifrado.append((char) (texto.charAt(i) - codigo + 26));
			} else {
				cifrado.append((char) (texto.charAt(i) - codigo));
			}
		} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
			if ((texto.charAt(i) - codigo) < 'A') {
				cifrado.append((char) (texto.charAt(i) - codigo + 26));
			} else {
				cifrado.append((char) (texto.charAt(i) - codigo));
			}
		}
	}
	return cifrado.toString();
}
} 

//Fin cifrado Cesar

