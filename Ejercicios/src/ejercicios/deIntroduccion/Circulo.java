package ejercicios.deIntroduccion;

public class Circulo {
	
	private double radio;
	
	Circulo(double radio){
		this.radio = radio;
	}
	
	double obtenerRadio() {
		return radio;
	}
	
	void cambiarRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}
	
	double obtenerPerimetro() {
		return (2 * Math.PI * radio);
	}
	
	public double obtenerArea() {
		return Math.PI * radio * radio;
	}
	
	public double obtenerDiametro() {
		return radio * 2;
		
	}
	

	}


