package ar.edu.uno.poo1.enumeraciones;

public enum DiaDeLaSemana {
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miercoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	//Tipo enumerado. No es un atributo
	private String diaElegido;
	
	//Constructor privado
	private DiaDeLaSemana(String dia) {
		this.diaElegido = dia;
	}
	
	public String getDiaElegido() {
		return this.diaElegido;
	}
}
