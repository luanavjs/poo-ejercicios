package ejercicios.deIntroduccion;

public class CirculoTest {

	public static void main(String[] args) {
		
		Circulo circulo1 = new Circulo(32);
		
		System.out.println(circulo1.obtenerRadio());
		
		circulo1.cambiarRadio(30);
		
		System.out.println(circulo1.obtenerRadio());
		System.out.println(circulo1.obtenerDiametro());
		System.out.println(circulo1.obtenerArea());
		System.out.println(circulo1.obtenerPerimetro());
		double pi = Math.PI;
		System.out.println(pi);
	}

}
