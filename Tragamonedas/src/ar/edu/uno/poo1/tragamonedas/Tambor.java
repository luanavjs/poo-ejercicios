package ar.edu.uno.poo1.tragamonedas;

public class Tambor {
	
	private int posicion;
	
	public Tambor() {
		this.posicion = 1;
	}
	
	public int obtenerPosicion() {
		return this.posicion;
	}
	
	public void girar() {
		double aleatorio = Math.random();
		
		posicion = (int) (aleatorio * 8) + 1;
	}

}
