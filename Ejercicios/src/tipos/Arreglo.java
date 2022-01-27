package tipos;

public class Arreglo {

	public static void main(String[] args) {

		//Declaro un arreglo de 5 enteros
		
		int[] enteros = new int[5];
		enteros[0] = 55;
		System.out.println(enteros[0]);
		
		//Declaro e inicializo un vector de tres números enteros
		
		int[] otroVector = {1,-2,3};
		System.out.println(otroVector[0]);
		
		//Declaro una matriz de números reales
		
		int filas = 4;
		int columnas = 4;
		double[][] matrizReal = new double[filas][columnas];
		System.out.println(matrizReal[0][1]);
		matrizReal[1][1] = 1.1;
		matrizReal[2][2] = 2.2;
		
		for(int f = 0; f < filas; f++) {
			for(int c = 0; c < columnas; c++)
				System.out.println(matrizReal[f][c]);
		}
		
		//Declaro un arreglo de strings
		
		String[] nombres = new String[4];
		nombres[0] = "Luana";
		nombres[1] = "2";
		System.out.println(Integer.parseInt(nombres[1]));
		nombres[2] = "3.14";
		System.out.println(Double.parseDouble(nombres[2]));

	}
}
