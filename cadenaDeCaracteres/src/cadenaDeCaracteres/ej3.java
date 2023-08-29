package cadenaDeCaracteres;
import java.util.Scanner;
/*Realiza un programa que determine si una cadena de caracteres ingresada por el usuario 
es pal�ndromo (se lee igual de izquierda a derecha que de derecha a izquierda).*/

public class ej3 {
	public static void main(String[] args) {
		System.out.print("Ingres� una palabra que quieras para ver si es pal�ndromo: ");
		Scanner scanner = new Scanner(System.in);
		String palindromo = scanner.nextLine();
		for(int i = 0; i < palindromo.length(); i++) {
			char letra1 = Character.toLowerCase(palindromo.charAt(i));
			char letra2 = Character.toLowerCase(palindromo.charAt(palindromo.length()-1-i));
			if(letra1 != letra2) {
				System.out.print("Tu palabra '" + palindromo + "' no es un pal�ndromo");
				return;
			}
		}
		System.out.print("Tu palabra '" + palindromo + "' es un pal�ndromo");
	}

}
