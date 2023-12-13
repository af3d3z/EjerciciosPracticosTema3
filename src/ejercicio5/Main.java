package ejercicio5;

import java.util.Scanner;

public class Main {
	/*PRUEBAS:
	 * Entrada:			| ResEsperado											| ResObtenido
	 * 5 a				| todas las figuras hechas con a y con un lado de 5		| todas las figuras hechas con a y con un lado de 5
	 * 0 y				| no hace nada											| no hace nada	
	 * -9 #				| no hace nada											| no hace nada
	 */
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		char caracter;
		
		System.out.println("Introduce la longitud del lado de la figura: ");
		lado = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce un carácter: ");
		caracter = sc.nextLine().charAt(0);
		
		 Figuras fig = new Figuras(lado, caracter);
		 System.out.println();
		 System.out.println("Triangulo: ");
		 fig.triangulo();
		 System.out.println();
		 System.out.println("Cuadrado: ");
		 fig.cuadrado();
		 System.out.println();
		 System.out.println("Hexágono: ");
		 fig.hexagono();
		 
		 sc.close();
	}
}
