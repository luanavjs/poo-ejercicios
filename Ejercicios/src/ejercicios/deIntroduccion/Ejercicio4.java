package ejercicios.deIntroduccion;

public class Ejercicio4 {
	
	/* 4. Se ingresa un valor num�rico de  8 d�gitos que representa una fecha con el siguiente 
	 * formato aaaammdd. Se pide informar por separado el d�a, el mes y el a�o de la fecha 
	 * ingresada.* */
	
	
	public static void darVueltaLaFecha(int fecha) {
		int dia;
		int mes;
		int anio;
		
		anio = fecha / 10000;
		dia = fecha % 100;
		mes = fecha / 100 % 100;
		System.out.println("dia " + dia + " mes " + mes + " a�o " + anio );
	}
	public static void main(String[] args) {
		
		darVueltaLaFecha(20220109);

	}
 
}
