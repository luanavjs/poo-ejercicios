package ar.edu.uno.poo1.clases;

public class Dinero {
	
	private String codigoISO;
	private String nombre;
	private double monto;
	
	public Dinero(String codigoISO, String nombre, double monto) {
		this.codigoISO = codigoISO;
		this.nombre = nombre;
		this.monto = monto;
		
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

}
