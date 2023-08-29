package cadenaDeCaracteres;
import java.util.Scanner;
//Realiza un programa que cuente cuántas vocales tiene una cadena de caracteres ingresada por el usuario.

public class ej2 {
	public static void main(String[] args) {
		System.out.print("Ingresá una palabra para conocer su cantidad de vocales: ");
	
		Scanner scanner = new Scanner(System.in);
		String palabra = scanner.nextLine();
		int cantVocales = 0;
		for(int i = 0; i < palabra.length(); i++) {
			char caracter = Character.toLowerCase(palabra.charAt(i));
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
				cantVocales++;
			}
		}
		System.out.print("Tu palabra '" + palabra + "' tiene " + cantVocales + " vocales");

	}

}
