package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/* PRUEBAS:
	 * Entrada:				| ResEsperado:						  		| ResObtenido:
	 * 56					| Volumen: 735618.581 Area: 39408.138 		| Volumen: 735618.581 Area: 39408.138
	 * 95.2					| Volumen: 3614094.087 Area: 113889.520		| Volumen: 3614094.087 Area: 113889.520
	 * 0.36					| Volumen: 0.195 Area: 1.629				| Volumen: 0.195 Area: 1.629
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Esfera esfera;
		double radioEsfera;
		double superficieEsfera, volumenEsfera;
		char continuar;
		
		while(true) {
			try {
				// pedimos un número al usuario
				System.out.println("Introduce el radio de la esfera: ");
				radioEsfera = sc.nextDouble();
				sc.nextLine(); // vaciamos el buffer del scanner
				// creamos un objeto Esfera con el radio de la esfera y calculamos su volumen y superficie 
				esfera = new Esfera(radioEsfera);
				superficieEsfera = esfera.superficie();
				volumenEsfera = esfera.volumen();
				System.out.printf("Radio de la esfera: %.3f\n" + "Superficie: %.3f\n" + "Volumen: %.3f\n", radioEsfera, superficieEsfera, volumenEsfera);
				
				// le preguntamos al usuario si quiere seguir metiendo números y si mete alguna cadena cuya primera letra sea 'n' o 'N' saldrá del bucle
				System.out.println("¿Quieres seguir? S/N");
				continuar = sc.nextLine().toLowerCase().charAt(0);
				if(continuar == 'n')
					break;
 			}catch(InputMismatchException e) {
				System.err.println("Dato incorrecto.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
