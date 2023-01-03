import java.util.Scanner;

public class billetes{

	public static void main (String [] args){

//Declaramos dos variables de tipo int.
//Utilizaremos el if.

	int  din=0, cant=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad del dinero");
		din = sc.nextInt();

//Si el dinero (din) introducido es mayor o igual, que divida el dinero entre los numeros de los billetes y  si sobra el resto pues que divida de nuevo hasta que llege tener el resto 0.
		
		if (din >=500) {
                    cant = din / 500;
                    System.out.println("Has introducido " + cant + " billetes de 500.");
                    din = din % 500;
                }
                    
                if (din >=200) { 
                    cant = din / 200;
                    System.out.println("Has introducido " + cant + " billetes de 200.");
                     din = din % 200;
                }
                if (din >=100) {
                    cant = din / 100;
                    System.out.println("Has introducido " + cant + " billetes de 100.");
                    din = din % 100;
                }
                    
               if (din >=50) {
                    cant = din / 50;
                    System.out.println("Has introducido " + cant + " billetes de 50.");
                    din = din % 50;
               }
                    
               if (din >=20) {
                    cant = din / 20;
                    System.out.println("Has introducido " + cant + " billetes de 20.");
                    din = din % 20;
               }
                    
               if (din >=10) {
                    cant = din / 10;
                    System.out.println("Has introducido " + cant + " billetes de 10.");
                    din = din % 10;
               }
                    
               if (din >=5) {
                    cant = din / 5;
                    System.out.println("Has introducido " + cant + " billetes de 5.");
                    din = din % 5;
               }	
             
	}
}