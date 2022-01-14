package ejercicios.deIntroduccion;

/* FizzBuzz: Imprimir por pantalla los números del 1 al 100 pero considerando lo siguiente:
Si el número es divisible por 3 se debe imprimir “Fizz”.
Si el número es divisible por 5 se debe imprimir “Buzz”.
Si el número es divisible por 3 y por 5 se debe imprimir “FizzBuzz”.  */


public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i<= 20; i++) {
			
			if(i % 3 == 0 && i % 5 != 0)
				System.out.println("fizz");
			else if (i % 5 == 0 && i % 3 != 0)
				System.out.println("buzz");
			else
				if (i % 5 == 0 && i % 3 == 0)
					System.out.println("fizzbuzz");
				else
					System.out.println(i);
		}
		
	}

}
