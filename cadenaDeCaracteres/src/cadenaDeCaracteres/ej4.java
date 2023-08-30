package cadenaDeCaracteres;
import java.util.Scanner;
/*Realiza un programa que reemplace todas las apariciones 
 * de un carácter en una cadena de caracteres ingresada*/

public class ej4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresá una o más palabras que te gusten: ");
		String cadena = scanner.nextLine();
		System.out.print("Ingresá el caracter que querés reemplazar: ");
		char letraReemplazada = scanner.nextLine().charAt(0);
		System.out.print("Ingresá el caracter de reemplazo: ");
		char letraReemplazo = scanner.nextLine().charAt(0);
		
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == letraReemplazada) {
				StringBuilder nuevaCadena = new StringBuilder(cadena);
				nuevaCadena.setCharAt(i, letraReemplazo);
				cadena = nuevaCadena.toString();
			}
		}
		
		System.out.print(cadena);

	}
}
