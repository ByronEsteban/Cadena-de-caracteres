package cadenaDeCaracteres;
import java.util.Scanner;
/*Realiza un programa que reemplace todas las apariciones 
 * de un car�cter en una cadena de caracteres ingresada*/

public class ej4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingres� una o m�s palabras que te gusten: ");
		String cadena = scanner.nextLine();
		System.out.print("Ingres� el caracter que quer�s reemplazar: ");
		char letraReemplazada = scanner.nextLine().charAt(0);
		System.out.print("Ingres� el caracter de reemplazo: ");
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
