//El programa debe solicitar el peso y la estatura de la persona, calcular el IMC e indicar el tipo de obesidad y la categoría. Se hará el diagnóstico a tantas personas que lo soliciten //hasta que se introduzcan en el peso o estatura algún número negativo o cero

import java.util.Scanner;

//Haremos una funcion para el peso y altura.

public class peso{


		 public static void main(String[] args) {

//Definimos 3 variables, dos para pedir datos y una para que calcule.
//El tipo de variable es float, dicho numero de peso introducido y altura puede se decimal.

		 float a=0, p=0, imc=0;

			Scanner sc= new Scanner (System.in);

//Haremos un do while, para que le usuario vaya pidiendo el peso y la altura de la persona hasta que teclee un numero negativo o cero.

			 do{
				System.out.println("Introduce el peso de la persona:");
				p = sc.nextFloat();

				System.out.println("Introduce la altura de la persona:");
				a = sc.nextFloat();
	
	

//Calculara el peso dividivo entre la altura de la persona.
//Llameremos el imc.
				imc = p/(a*a);
	
//Dentro del mismo bucle, haremos varios if, por que no queremos otra opcion, siempre queremos que se cumpla esta opcion.
//Para que se cumpla la condicion, una opcion u otra.
//Indicaremos a dicha persona la categoria y el tipo.
//Usaremos && para que se cumplan las dos opciones.

		
					if (imc >= 0 && imc <= 18.49) {
						System.out.println("Peso bajo");
					}	 
                         
					if (imc >= 18.5 && imc <= 24.9) {
						System.out.println("Peso normal");
					} 

                       	 		if (imc >= 25 && imc <= 29.9) {
						System.out.println("Sobre Peso");
					}

                        		if (imc >= 30 && imc <= 34.9) {
						System.out.println("Obesidad Leve");
						System.out.println("Tipo 1");
					}

                       			if (imc >= 35 && imc <= 39.9) {
						System.out.println("Obesidad Media");
						System.out.println("Tipo 2");
					} 

                        		if (imc >= 40) {
						System.out.println("Obesidad Morbida");
  						System.out.println("Tipo 3");
					}

//Aqui terminariamos con el bucle do while.
//La altura y el peso sea mayor o igual a 0.

			}while (a >= 0 && p >= 0); 
	
		}

}