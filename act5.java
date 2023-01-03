//Dadas dos variables a y b de tipo entero, debes intercambiar los datos.

import java.util.Scanner;

public class act5 {

	public static void main (String [] args) {

//Vamos a necesitar tres varibale al usurario de tipo int.
//Incializamos la varaible c y pedimos al usuario 2.

	int c=01;

		Scanner sc= new Scanner(System.in);

//Introducimos las variables.

		System.out.println("Introduce la primera varible:");
		int a= sc.nextInt();

		System.out.println("Introduce la segunda varible:");
		int b= sc.nextInt();

//Cambiarian de posicion, introducimos la variable c, que es una condicion mentira.

		a=b;

		b=c;
		
		c=a;

		System.out.println("La variable a es: " + a + " y la variable b es: " + b);

		
	 }
		
}
