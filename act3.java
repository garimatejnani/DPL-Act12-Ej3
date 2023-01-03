//Crear un función que dados cinco caracteres devuelva una palabra. Se le pide al s 5 caracteres y se muestra por pantalla la palabra resultado.

import java.io.IOException;

public class act3 {

	//static char caracteres (char n1, char n2, char n3, char n4, char n5) {
	//return n1 + n2 + n3 + n4 + n5;
	//}

	public static void main(String[] args) throws IOException {
	char c1, c2, c3, c4, c5;

		//Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer caracter: ");
		c1 = (char) System.in.read();
		
		System.out.print("Escribe el segundo caracter: ");
		c2 = (char) System.in.read();
		
		System.out.print("Escribe el tercero caracter: ");
		c3 = (char) System.in.read();
		
		System.out.print("Escribe el cuarto caracter: ");
		c4 = (char) System.in.read();
		
		System.out.print("Escribe el quinto caracter: ");
		c5 = (char) System.in.read();

		System.out.println("La palabra es: " + c1 + c2 + c3 + c4 + c5);
			
				
	}
}

