package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/*
	 * PRUEBAS:
	 * Entrada				| ResEsperado												| ResObtenido
	 * 56					| El número 56 no es capicua. El número 56 no es primo.		| El número 56 no es capicua. El número 56 no es primo.
	 * 12221				| El número 12221 es capicua. El número 12221 no es primo.  | El número 12221 es capicua. El número 12221 no es primo.
	 * 101					| El número 101 es capicua. El número 101 es primo.			| El número 101 es capicua. El número 101 es primo. 
	 * -65					| El número -65 no es capicua. El número -65 no es primo.	| El número -65 no es capicua. El número -65 no es primo.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entradaUsuario;
		String capicua = "";
		String primo = "";
		char continuar;
		Numeros numero;
		
		while(true) {
			try {
				// pedimos un número al usuario
				System.out.println("Introduce un número: ");
				entradaUsuario = sc.nextInt();
				sc.nextLine(); // vaciamos el buffer del scanner
				// a numeros le asignamos un objeto Numeros con el número introducido por el usuario como parámetro
				numero = new Numeros(entradaUsuario);
				// calculamos si el número es primo y capicúa o si no lo es creamos un mensaje para por si el número es capicua o no y otro por si es primo o no
				capicua = numero.esCapicua() ? "El número " + numero.getNumero() + " es capicua." : "El número " + numero.getNumero() + " no es capicua.";
				primo = numero.esPrimo() ? "El número " + numero.getNumero() + " es primo." : "El número " + numero.getNumero() + " no es primo.";
				System.out.println(capicua + "\n" + primo);
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
