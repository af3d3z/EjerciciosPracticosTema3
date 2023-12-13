package ejercicio1;

public class Numeros {
	private int numero;
	
	public Numeros(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// devuelve true si el número es primo
	public boolean esPrimo() {
		// la variable primo indica si el atributo numero de la clase es primo o no, de serlo, no se modificará su valor a lo largo de la funcion
		boolean primo = true;
		
		// comprobamos que no sea ni negativo ni 0 ni 1
		if(this.numero <=1) {
			primo = false;
		}else {
			// si tiene algún divisor la variable primo tendrá como valor false
			for(int i = 2; i < this.numero; i++) {
				if(this.numero % i == 0) 
					primo = false;
			}
		}
		
		return primo;
	}
	
	// devuelve true si el número es capicua o no
	public boolean esCapicua() {
		// copiamos el atributo número a esta variable porque vamos a modificar su contenido
		int numero = this.numero;
		int ultimoDigito = 0;
		int numeroCapicua = 0;
		boolean esCapicua = false;
		
		/* mientras que numero sea distinto a 0 sacaremos el último digito, se lo quitaremos a numero y 
		 * lo añadiremos a numeroCapicua para que el número original esté alreves y podamos compararlo con el original*/
		while(numero != 0) {
			ultimoDigito = numero % 10;
			numero /= 10;
			numeroCapicua = numeroCapicua * 10 + ultimoDigito;
		}
		
		// comparamos si son iguales y en caso de serlo lo reflejaremos en la variable esCapicua
		if(this.numero == numeroCapicua)
			esCapicua = true;	
		
		return esCapicua;
	}
}
