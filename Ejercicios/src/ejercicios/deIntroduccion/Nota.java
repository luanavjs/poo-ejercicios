package ejercicios.deIntroduccion;

public class Nota {
	
	private int valor;
	
	Nota(int valor){
		this.valor = valor;
	}
	
	 boolean aprobado() {
		return (valor >= 4 && valor <= 10);
	}
	 
	 boolean desaprobado() {
		 return !aprobado();
	 }
	 
	 int obtenerValor() {
		 return valor;
	 }
	 
	 void recuperar(int nuevoValor) {
		 if(nuevoValor > valor)
			 valor = nuevoValor;
	 }
	 
	 boolean promociona() {
		return (valor >= 7);
	 }

	public static void main(String[] args) {
		
		Nota parcial1 = new Nota(3);
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.desaprobado());
		System.out.println(parcial1.obtenerValor());
		
		parcial1.recuperar(6);
		
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.obtenerValor());
		System.out.println(parcial1.promociona());


	}

}
