package ejercicio2;

public class Esfera {
	// atributo que almacena el radio de la esfera
	private double radio;
	
	public Esfera() {}
	
	public Esfera(double radio) {
		this.radio = radio;
	}
	
	// función que devuelve el radio de la esfera
	public double getRadio() {
		return this.radio;
	}
	
	// función que devuelve la superficie de la esfera
	public double superficie () {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}
	
	// función que devuelve el volumen de la esfera
	public double volumen () {
		double volumen = ((4*Math.PI)/3) * Math.pow(radio, 3);
		return volumen;
	}
	
}
