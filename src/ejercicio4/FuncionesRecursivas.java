package ejercicio4;

public class FuncionesRecursivas {
	public static int sumatorio(int n) {
		int resultado = 0;

		if(n <= 1) {
			resultado = n;
		}else {
			resultado = n + sumatorio(n-1);
		}
		
		return resultado;
	}
	
	public static double potencia(double a, int n) {
		double resultado = 0;
		
		if(n <= 1) {
			resultado = a;
		}else {
			resultado = a * potencia(a, n-1);
		}
		
		return resultado;
	}
	
	public static int serieFibonacci(int numero) {
		int resultado = 0;
		
		if(numero <= 1) {
			resultado = numero;
		}else {
			resultado = (serieFibonacci(numero-1) + serieFibonacci(numero-2));
		}
		return resultado;
	}
	
}
