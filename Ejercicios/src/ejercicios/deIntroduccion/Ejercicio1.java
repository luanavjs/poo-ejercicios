package ejercicios.deIntroduccion;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*1. Leer dos valores enteros e informar la suma.*/

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n1,n2, suma;
		
		System.out.println("Ingrese un valor: ");
		n1 = read.nextInt();
		System.out.println("Ingrese otro valor: ");
		n2 = read.nextInt();
		
		suma = n1 + n2;
		
		System.out.println("La suma de ambos numeros es: " + suma);
	}

}
