package cadenaDeCaracteres;
import java.util.Scanner;
//Realiza un programa que cuente cu�ntas vocales tiene una cadena de caracteres ingresada por el usuario.

public class ej2 {
	public static void main(String[] args) {
		System.out.print("Ingres� una palabra para conocer su cantidad de vocales: ");
	
		Scanner scanner = new Scanner(System.in);
		String palabra = scanner.nextLine();
		int cantVocales = 0;
		for(int i = 0; i < palabra.length(); i++) {
			char caracter = Character.toLowerCase(palabra.charAt(i));
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == '�' || caracter == '�' || caracter == '�' || caracter == '�' || caracter == '�') {
				cantVocales++;
			}
		}
		System.out.print("Tu palabra '" + palabra + "' tiene " + cantVocales + " vocales");

	}

}
