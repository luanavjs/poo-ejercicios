package ar.edu.uno.poo1.tragamonedas;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;

		
	/*
	 * post: los 3 Tambores del Tragamonedas estan
	 *
	 * en la posición 1.
	 */
	public Tragamonedas() {
		tambor1 = new Tambor();
		tambor2 = new Tambor();
		tambor3 = new Tambor();
	}
	
	public String toString() {
		return 	"[" + tambor1.obtenerPosicion()+"]" +
				"[" + tambor2.obtenerPosicion()+"]" + 
				"[" + tambor3.obtenerPosicion()+"]"; 
	}
	

	/*
	 * post: activa el Tragamonedas haciendo girar
	 *
	 * sus 3 Tambores.
	 */
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}

	/*
	 * post: indica si el Tragamonedas entrega un premio
	 *
	 * a partir de la posición de sus 3 Tambores.
	 */
	public boolean entregaPremio() {
		return this.tambor1.obtenerPosicion() == tambor2.obtenerPosicion()
				&& tambor2.obtenerPosicion() == tambor3.obtenerPosicion();
	}
}

