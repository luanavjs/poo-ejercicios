package ejercicios.deIntroduccion;

import java.util.Scanner;

public class Ejercicio2 {

	/*2. Leer dos valores numéricos enteros e informar su cociente.*/
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int cociente;
		
		System.out.println("Ingrese un valor");
		int n1 =  read.nextInt();
		System.out.println("Ingrese otro valor");
		int n2 = read.nextInt();
		
		cociente = n1/n2;
		System.out.println("El cociente es: " + cociente);
		
	}

}
