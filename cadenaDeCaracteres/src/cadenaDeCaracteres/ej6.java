package cadenaDeCaracteres;
import java.util.Scanner;
//Realizar un programa que ingrese 5 palabras y devuelva la cadena m�s larga entre ellas

public class ej6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] palabras = {"", "", "", "", ""};
		String palabraMasLarga = "";
		System.out.print("Ingres� 5 palabras que te gusten: ");
		for(int i = 0; i < 5; i++) {
			palabras[i] = scanner.next();
			if(palabras[i].length() > palabraMasLarga.length()) {
				palabraMasLarga = palabras[i];
			}
		}
		System.out.print("La palabra m�s larga de las que ingresaste es: '" + palabraMasLarga + "'");
	}
}
