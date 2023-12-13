package ejercicio4;

import java.util.Scanner;

public class Main {
	/* PRUEBAS:
	 * sumatorio:
	 * Entrada:			| ResEsperado:				| ResObtenido:
	 * 4, 5				| 10						| 10
	 * 0, 3				| 0							| 0
	 * -1				| -1						| -1
	 * 
	 * potencia:
	 * Entrada:			| ResEsperado				| ResObtenido:
	 * 5, 4				| 625						| 625
	 * 0, 8				| 0							| 0
	 * -3, 2			| 9 						| 9
	 * 
	 * fibonacci:
	 * Entrada:			| ResEsperado				| ResObtenido:
	 * 6				| 8							| 8
	 * 32				| 2178309					| 2178309
	 * -12				| -12						| -12
	 * */
	
	public static void main(String[]args) {
		// perdona si los mains no estan muy currados pero es que no voy muy sobrado de tiempo ahora mismo
		Scanner sc = new Scanner(System.in);
		// guardara un numero que nos va a servir a probar las funciones desarrolladas
		int nBase;
		// guardara un numero que nos va a servir para probar la funcion de potencia
		int exponente;
		
		System.out.println("Introduce un número:");
		nBase = sc.nextInt();
		System.out.printf("Sumatorio de %d: %d\n", nBase, FuncionesRecursivas.sumatorio(nBase));
		
		System.out.println("Introduce un exponente:");
		exponente = sc.nextInt();
		System.out.printf("%d^%d: %f\n", nBase, exponente, FuncionesRecursivas.potencia(nBase, exponente));
		
		System.out.printf("El numero %d de la secuencia de fibonacci es: %d", nBase, FuncionesRecursivas.serieFibonacci(nBase));
		
		sc.close();
	}
}
