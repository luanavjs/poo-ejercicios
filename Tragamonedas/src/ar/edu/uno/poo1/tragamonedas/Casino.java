package ar.edu.uno.poo1.tragamonedas;

public class Casino {
	
	private static final double VALOR_FICHIN = 5;
	private static final double PREMIO = 100;

	public static void main(String[] args) {
		
		Tragamonedas partida = new Tragamonedas();
		System.out.println(partida);
		partida.activar();
		
		int contadorDeFichines = 1;
		
		while(!partida.entregaPremio()) {
			partida.activar();
			contadorDeFichines ++;
		}
		
		System.out.println("Display: " + partida);
		System.out.println("Con " + contadorDeFichines + " fichines.");
		double inversion = VALOR_FICHIN * contadorDeFichines;
		System.out.println("Inversión: " + inversion);
		if(inversion < PREMIO)
			System.out.println("Ganaste: $" + (PREMIO - inversion));
		else
			System.out.println("Perdiste: $" + (inversion - PREMIO));
	}

}
