package ejercicio3;

import java.util.Random;

public class NumerosAleatorios {
	// imprime por pantalla tantos números como se especifiquen
	public static void numerosAleatorios(int cantidad){
		if(cantidad > 0) {
			for(int i = 1; i <= cantidad; i++) {
	            System.out.println(Math.random());
	        }
		}
    }

	// imprime por pantalla tantos números aleatorios como se especifiquen y teniendo como máximo valMax
    public static void numerosAleatorios (int cantidad, int valMax) {
        Random rand = new Random();
        for(int i = 1; i <= cantidad; i++){
            System.out.println(rand.nextInt(valMax));
        }
    }
    
    // imprime por pantalla tantos números aleatorios entre el valor mínimo y valor máximo tantas veces como se especifiquen
    public static void numerosAleatorios (int cantidad, int valMin, int valMax) {
        Random rand = new Random();
        for(int i = 1; i <= cantidad; i++){
            System.out.println(rand.nextInt(valMin, valMax));
        }
    }

}
