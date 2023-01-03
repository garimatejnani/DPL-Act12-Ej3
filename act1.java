import java.util.Scanner;

public class act1 {

//Creamos 4 funciones de tipo float.
//Usaremos dos varibles.
//Estas fnciones deben de calcular la suma, resta, division, y multiplicacion.
//El return devuelve el resultado.
    
       static float suma(float n1, float n2){
       return n1+n2;
       }

       static float resta(float n1, float n2){
       return n1-n2;
       }  
	
       static float multiplicacion(float n1, float n2){
       return n1*n2;
       }

       static float division(float n1, float n2){
       return n1/n2;
       }

//Pediremos las varibales al usuario.
//En sytem.out.println escribiremos el nombre de la dicha funcion. Por ejemplo: suma. Y en parentesis iran las variable que pidamos al usuario, esto hara que vaya en la posicion que esta.

      		  public static void main(String[] args){
        		 Scanner sc = new Scanner(System.in);

        	 		System.out.println("Introduce el primer numero:");
        	 		float n1=sc.nextFloat();
         			System.out.println("Introduce el segundo numero:");
         			float n2= sc.nextFloat();

         				System.out.println("El resultado de la suma es: " + suma(n1, n2));
        				System.out.println("El resultado de la resta es: " + resta(n1, n2));
         				System.out.println("El resultado de la multiplicacion es: " + multiplicacion(n1, n2));
         				System.out.println("El resultado de la division es: " + division(n1, n2));

       		 }

}