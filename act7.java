// Dado el salario mínimo interprofesional de un año. Si se planifica una subida para el próximo año y se le pide esa subida al usuario en porcentaje ¿cuál sería el nuevo salario mínimo?

import java.util.Scanner;

public class act7{

	public static void main(String[] args){

//Necesitamos 5 variables.
//Las varibles seran de tipo double.
//Pediremos al usuario dos variables.

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el salario del trabajador");
		double n = sc.nextDouble();
	
		System.out.println("Introduce el porcentaje que desea subir");
		double p = sc.nextDouble();
		
//Para calcular el el salario.
//Pediremos el porcentaje y lo sumaremos a 100.

		double suma = p + 100;

//Al sumar el dicho porcentaje, multplicaremos por el salrio introducido.

		double porcentaje = n*suma;

//Finalmente el calulo de la multiplicacion dividira entre 100.

		double salario = porcentaje/100;

		System.out.println("El nuevo salario del trabajador es: " + salario);

	}


}
		
		
		
