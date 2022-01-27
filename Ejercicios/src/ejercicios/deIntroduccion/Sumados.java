package ejercicios.deIntroduccion;

public class Sumados {

	/*
	 * 2) Sumados: Sumar los 1000 primeros números naturales (1 + 2 + 3 + 4 + … +
	 * 1000), imprimiendo por cada suma el resultado parcial obtenido.
	 */

	public static void main(String[] args) {

		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			suma += i;
			System.out.println(suma);
		}

	}

}
