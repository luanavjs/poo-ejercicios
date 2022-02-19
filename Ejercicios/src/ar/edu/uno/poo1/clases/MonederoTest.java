package ar.edu.uno.poo1.clases;

public class MonederoTest {

	public static void main(String[] args) {
		
		Dinero d = new Dinero("ARS","Peso argentino", 500);
		
		Monedero cuenta1 = new Monedero(d);
		
		System.out.println("El mondero tiene: $" + cuenta1.consultarDinero());
		
		cuenta1.sacarDinero(0.5);
		
		System.out.println("El mondero tiene: $" + cuenta1.consultarDinero());
		
		cuenta1.ponerdinero(50);
		
		System.out.println("El mondero tiene: $" + cuenta1.consultarDinero());
	}

}
