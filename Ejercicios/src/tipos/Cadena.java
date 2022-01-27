package tipos;

public class Cadena {

	public static void main(String[] args) {
		
		String nombre = "Luana";
		String apellido = "Vallejos";
		
		System.out.println(nombre.length());		// 5
		System.out.println(nombre.toUpperCase());	// LUANA
		System.out.println(nombre.toLowerCase());	// luana
		
		System.out.println(nombre.startsWith("L")); // true
		System.out.println(nombre.endsWith("s"));   // false
		
		System.out.println(apellido.charAt(0));	 	// V
		
		/* Implementar método startsWith con charAt */
		System.out.println(apellido.charAt(0) == 'V'); // true
		
		/* Implementar método endsWith con charAt */
		System.out.println(apellido.charAt(apellido.length() - 1) == 's'); // true
		
	}

}
