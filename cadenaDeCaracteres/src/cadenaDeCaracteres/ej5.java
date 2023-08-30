package cadenaDeCaracteres;
import java.util.Scanner;
/*Realiza un programa que determine si una cadena de caracteres 
 * ingresada por el usuario es un anagrama de otra cadena también 
 * ingresada por el usuario. Un anagrama es una palabra o frase 
 * formada por las mismas letras de otra palabra o frase, pero en un 
 * orden diferente, como por ejemplo "roma" y "amor".*/

public class ej5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresá una o más palabras que te gusten: ");
		String palabra = scanner.nextLine();
		System.out.print("Ingresá otra palabra o palabras que te gusten: ");
		String anagrama = scanner.nextLine();
		
		if(palabra.length() != anagrama.length()) {
			System.out.print("'" + anagrama + "' no es una anagrama de '" + palabra + "'");
			return;
		}
		
		for(int i = 0; i < palabra.length(); i++) {
			boolean verificador = false;
			for(int j = 0; j < anagrama.length(); j++) {
				if(palabra.charAt(i) == anagrama.charAt(j)) {
					verificador = true;
					break;
				}
			}
			if(!verificador){
				System.out.print("'" + anagrama + "' no es una anagrama de '" + palabra + "'");
				return;
			}
		}
		
		System.out.print("'" + anagrama + "' es una anagrama de '" + palabra + "'");

	}
}
