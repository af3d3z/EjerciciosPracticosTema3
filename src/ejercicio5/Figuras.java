package ejercicio5;

public class Figuras {
	private int lado;
	private char caracter;
	
	public Figuras () {}
	
	public Figuras(int lado, char caracter) {
		this.lado = lado;
		this.caracter = caracter;
	}
	
	// devuelve el lado de la figura
	public int getLado() {
		return lado;
	}
	
	// devuelve el carácter de la figura
	public char getCaracter() {
		return caracter;
	}
	
	// le asigna un lado la figura
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	// asigna un carácter a la figura
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	// imprime un triángulo con el lado de la figura y con el carácter de la figura
	public void triangulo() {
		int ladoTriangulo = lado;
		int espacios;
		
		for(int i = 0; i <= lado; i++) {
			espacios = lado -i - 1;
			for(int k = 0; k <= espacios; k++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= ladoTriangulo && j < i; j++) {
				System.out.print(caracter + " ");
			}
			System.out.println();
		}
	}
	
	// imprime un cuadrado con el lado de la figura y con el carácter de la figura
	public void cuadrado() {		
		for(int i = 1; i <= lado; i++) {
			for(int j = 1; j <= lado; j++) {
				System.out.print(caracter + " ");
			}
			System.out.println();
		}
	}
	
	// imprime un hexagono con el lado de la figura y con el carácter de la figura
	public void hexagono() {
		int ladoHexagono = lado;
		int espacios = lado;
		
		for(int i = -lado; i <= lado; i++) {
			if(i < 0) {
				espacios -= 1;
				for(int j = 0; j<= espacios; j++) {
					System.out.print(' ');
				}
				for(int k = 0; k < ladoHexagono; k++) {
					System.out.print(caracter);
				}
				ladoHexagono += 2;
				System.out.println();
			}else {
				for(int j = 0; j< espacios; j++) {
					System.out.print(' ');
				}
				espacios += 1;
				for(int k = 0; k < ladoHexagono; k++) {
					System.out.print(caracter);
				}
				ladoHexagono -= 2;
				System.out.println();

			}
		}
	}
}
