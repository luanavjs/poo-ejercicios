package ar.edu.uno.poo1.clases;

public class Monedero {

	/*
	 * Atributos
	 * 
	 * -> privado : visible dentro de la clase donde se lo definió.
	 * -> principio de ocultamiento(poo): los valores que los atributos de los objetos tienen en un momento dado,
	 *  								  es lo  que se conoce como el estado del objeto.
	 * 
	 */
	
	private double dinero;
	
	/*
	 * Constructor
	 * -> se ejecuta al instanciar la clase
	 * -> se usa para inicializar los atributos
	 * 
	 */
	
	//Constructor parametrizado
	
	public Monedero(double dineroInicial) {
		this.dinero = dineroInicial;
	}
	
	//Constructor por defecto/predeterminado 
	
	public Monedero() {
		this.dinero = 0.0;
	}
	
	
	public double consultarDinero() {
		return this.dinero;
	}
	
	public void sacarDinero(double monto) {
		if(monto > 0 && monto <= this.dinero)
			this.dinero -= monto;
	}
	
	public void ponerdinero(double monto) {
		if(monto > 0)
			this.dinero += monto;
	}
}

