package cadenaDeCaracteres;
import java.util.Scanner;
//Pedir al usuario que ingrese su nombre y luego imprimirlo en pantalla.

public class ej1 {
	public static void main(String[] args) {
		System.out.print("Hola, ingresá tu nombre: ");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		System.out.print("Hola, " + nombre);
	}

}
