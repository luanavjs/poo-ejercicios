package ejercicios.deControl;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*2. Leer tres valores numéricos enteros, indicar cual es el mayor, cuál es el del medio 
	 * y cuál el menor. Considerar que los tres valores son diferentes.**/

	

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		int a = read.nextInt();
		System.out.println("Ingrese un valor: ");
		int b = read.nextInt();
		System.out.println("Ingrese un valor: ");
		int c = read.nextInt();
		
		int mayor = 0, menor = 0;
		
		//cálculo del mayor
		
		if(a>b && a>c)
			mayor = a;
		else if(c>a && c>b)
			mayor = c;
		else if(b>a && b>c)
			mayor = b;
		
		//calculo del menor
		if(a<b && a<c)
			menor = a;
		else if(b<a && b<c)
			menor = b;
		else if(c<a && c<b)
			menor = c;
		
		//calculo del medio  
		int medio = (a+b+c) - (mayor+menor);
		
		
		System.out.println("el mayor es: "+ mayor);
		System.out.println("el medio es: "+ medio);
		System.out.println("el menor es: "+ menor);
	}
	

}


