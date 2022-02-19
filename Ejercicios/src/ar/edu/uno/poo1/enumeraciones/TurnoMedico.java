package ar.edu.uno.poo1.enumeraciones;

public class TurnoMedico {
/*
 * 1)
 *  Implementar la clase TurnoMedico, sabiendo que los turnos se definen por el nombre del profesional,
 *  su especialidad (puede ser Medico Clinico, Odontólogo u Oftalmólogo), el nombre del paciente y el día
 *  de la semana en el que el turno se asignó. Además los turnos contienen un atributo de estado, de manera
 *  que un turno puede estar en estado Activo, haber sido dado de Baja o bien haberse Cumplido.
 */
	public static void main(String[] args) {
		
		DiaDeLaSemana diaElegido;
		
		diaElegido = DiaDeLaSemana.LUNES;
		System.out.println("Dia elegido: " + diaElegido.getDiaElegido());
		diaElegido = DiaDeLaSemana.MARTES;
		System.out.println("Dia elegido: " + diaElegido.getDiaElegido());
		
		//for-each
		for(DiaDeLaSemana dia : diaElegido.values()) {
			System.out.println(dia.getDiaElegido());
		}
	}
	
}
