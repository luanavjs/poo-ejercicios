package ejercicios.deControl;

public class Ejercicio4 {
	
	/* 4. Se ingresa por teclado un conjunto de valores num�ricos enteros positivos, 
	 * se pide informar, por cada uno, si el valor ingresado es par o impar. 
	 * Para indicar el final se ingresar� un valor cero o negativo.   * */
	
	public static boolean esPar(int numero) {
		return (numero % 2 == 0);
	}

	public static void main(String[] args) {
		
		System.out.println(esPar(47));
		System.out.println(esPar(22));
		
	}
	
	//ATAJOS
	//syso + ctrl + espacio -> System.out.println()
	//main + ctrl + espacio -> 
	//ctrl + shift + F -> formatea el c�digo

}
