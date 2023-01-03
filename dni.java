//Escribe un programa que pida el número de DNI y muestre por pantalla la letra asociada.

import java.util.Scanner;

public class dni {

//Haremos una funcion de tipo de variable char.
//Introducimos la varibale String.
//Introducimos los caracteres, del DNI. 

	static char dni(int dni) {
	String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";

//Introducimos la varibale de tipo int resto.
//Devuelva los caracteres del String como char y el resto que quede de la division.

        int resto = dni%23;
	return caracteres.charAt(resto);
	}

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

//Pedimos al usuario la variable n, tipo int.
//La variable n, ira en la posicion del dni. Es decir los numeros que introduzcamos dividira entre 23.

        	System.out.println("Introduce los numeros: ");
       	        int n = sc.nextInt();

//Imprimeros la letra n, con la funcion dni.
	
         	System.out.println("La letra de su DNI es: " + dni (n));
       }

}
 


