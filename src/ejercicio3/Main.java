package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/*PRUEBAS
	 * op1:
	 * Entrada:			| ResEsperado				| ResObtenido
	 * 6				| 6 numeros aleatorios		| 6 numeros aleatorios
	 * -2				| vuelve a pedir el numero	| vuelve a pedir el numero
	 * 0				| vuelve a pedir el	numero	| vuelve a pedir el numero
	 * 
	 * op2:
	 * Entrada:			| ResEsperado				| ResObtenido
	 * nums:6 max:4		| 6 numeros entre 1 y 4		| 4 2 2 1 1 2 3
	 * nums: -1 max: 8	| finaliza el programa		| finaliza el programa
	 * nums: 0 max 6	| vuelve a preguntar		| vuelve a preguntar
	 * 
	 * op3: 
	 * Entrada:					| ResEsperado						| ResObtenido
	 * nums: 5 max: 6 min: 1	| 5 numeros aleatorios entre 1 y 6	| 5 numeros aleatorios entre 1 y 6
	 * nums: 8 max: 1 min: 8	| IllegalArgumentException			| IllegalArgumentException
	 * nums: 0 max: 3 min: 1	| vuelve a preguntar				| vuelve a preguntar
	 * nums: -5 max: 8 min: 2	| finaliza el programa				| finaliza el programa
	 * */
	static Scanner sc = new Scanner(System.in);
	
	// muestra ciertas opciones y devuelve el número de la opción que ha elegido el usuario
	static int menu() {
		int opcion = 0;
		System.out.println("OPCIONES: ");
		System.out.println("1. Introducir un número de números aleatorios a generar.");
		System.out.println("2. Introducir un número de números aleatorios a generar y su valor máximo.");
		System.out.println("3. Introducir un número de números aleatorios a generar, el valor mínimo de estos y el máximo.");
		System.out.println("0. Salir");
		do {
			try {
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Dato incorrecto.");
				sc.nextLine();
			}
		}while(opcion > 3 || opcion < 0);
		return opcion;
	}

	public static void main(String[] args) {
		switch(menu()) {
			case 0: {
				System.out.println("¡Hasta la próxima!");
				break;
				}
			case 1: {
				int cantidadNumeros = 0;
				do {
					try {
						System.out.printf(">>> ");
						cantidadNumeros = sc.nextInt();
						NumerosAleatorios.numerosAleatorios(cantidadNumeros);
					}catch(InputMismatchException e) {
						System.err.println("Dato incorrecto.");
						sc.nextLine();
					}
				}while(cantidadNumeros <= 0);
				break;
			}
			case 2: {
				int cantidadNumeros = 0;
				int numeroMaximo = 0;
				
				do {
					try {
						System.out.println("Cantidad de números a generar: ");
						cantidadNumeros = sc.nextInt();
						sc.nextLine();
						System.out.println("Número máximo: ");
						numeroMaximo = sc.nextInt();
						NumerosAleatorios.numerosAleatorios(cantidadNumeros, numeroMaximo);
					}catch(InputMismatchException e) {
						System.err.println("Dato incorrecto.");
						sc.nextLine();
					}
				}while(cantidadNumeros == 0);
				break;
			}
			case 3: {
				int cantidadNumeros = 0;
				int numeroMaximo = 0;
				int numeroMinimo = 0;
				
				do {
					try {
						System.out.println("Cantidad de números a generar: ");
						cantidadNumeros = sc.nextInt();
						sc.nextLine();
						System.out.println("Número máximo: ");
						numeroMaximo = sc.nextInt();
						sc.nextLine();
						System.out.println("Número mínimo: ");
						numeroMinimo = sc.nextInt();
						NumerosAleatorios.numerosAleatorios(cantidadNumeros, numeroMinimo, numeroMaximo);
					}catch(InputMismatchException e) {
						System.err.println("Dato incorrecto.");
						sc.nextLine();
					}
				}while(cantidadNumeros == 0);
				break;
			}
		}
		sc.close();
	}

}
