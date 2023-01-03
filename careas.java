//Función que calcula la area del rectangulo
//Función que calcula la area del circulo
//Función que calcula la area del cuadrado

import java.util.Scanner;

public class careas {


	static float suma (int n1, int n2){
	return n1+n2;
	}

	static float resta (int n1, int n2){
	return n1-n2;
	}
        
	static float multiplicacion (int n1, int n2){
	return n1*n2;
	}

	static float division (int n1, int n2){
	return n1/n2;
	}

	

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa primer numero:");

		int n1= sc.nextFloat;
		
		System.out.println("Ingresa segundo numero:");

		int n2= sc.nextFloat;
	

	 System.out.println(suma(n1, n2));
         System.out.println(resta(n2));
         System.out.println(multiplicacion(n1));
         System.out.println(division(n1, n2));
		
	}
}
