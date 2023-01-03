// Realizar una función para conversión de euros a dolares (1€=1,17$) . Pedir al usuario la cantidad de euros o dolares a convertir y usando la función mostrar el resultado por pantalla en //el cambio correcto, es decir, si el usuario introduce euros el conversor devuelve dólares pero si el usuario introduce dolares el conversor introduce euros.

import java.util.Scanner;

public class act2 {

//Haremos dos funciones de tipo double.
//Vamos a pedir dos variables euros y dolares.
//Euros: Al introducir un euro multiplicara por dolar.
//Dolares: Al introducir dolar se dividira en dolar.

		public static double euros (double euro){
		return euro*1.17;
		}

		public static double dolares (double dolar){
		return dolar/1.17;
		}


			public static void main (String[] args) {
			
				Scanner sc=new Scanner(System.in);

				System.out.println("Introduce los euros:");
				double n1 = sc.nextDouble();
		
				System.out.println("Introduce los dolares:");
				double n2 = sc.nextDouble();

//Haremos conversor con el if. 
//Si introducimos euros, tendremos que dar a los dolares el valor 0 y viceversa.
//La varibles n1 y n2, calcularan en la misma posicion que esta euros y dolares.

		double conversor= sc.nextDouble();

			if(conversor==0){

			System.out.println("La cantidad conevertida en dolares es: " + euros (n1));
			}
				
			if (conversor==0){
		
			System.out.println("La cantidad conevertida en euros es: " + dolares (n2));
			}
	}

}

