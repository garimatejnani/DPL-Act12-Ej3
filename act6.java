//Se introduce un número entero y se devuelve el carácter que representa en el código ASCII.

import java.util.Scanner;

public class act6 {

//Pediremos una varible al usuario.
//El tipo de varible que utilzaremos es char.

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un numero");
		char c;
		c = (char) sc.nextInt();

//Introducimos un numero entre el 1-255.
//En el caso que introduzca otro numero, saldra "?" por la pantalla

		System.out.println("El codigo ASCII es: " + c);

	}

}

		
