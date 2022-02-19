package CuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void creoCuentaTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		
		//Saber si se creó un objeto y ese objeto no es nulo 
		assertNotNull(ca1);
	}
	
	@Test
	public void obtenerTitularTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		
		String esperado = "Luana Vallejos";
		String obtenido = ca1.obtenerTitular();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	public void consultarSaldoTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		
		double esperado = 0;
		double obtenido = ca1.consultarSaldo();
		assertEquals(esperado,obtenido, 0.001);
	}
	
	@Test
	public void depositarTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(500);;
		
		double esperado = 500;
		double obtenido = ca1.consultarSaldo();
		assertEquals(esperado,obtenido, 0.001);
	}
	
	@Test(expected = Error.class)
	public void depositarCeroTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(0);
	}
	
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(-500);
	}
	
	@Test
	public void extraerTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(100.50);
		ca1.extraer(50);
		
		double esperado = 50.50;
		double obtenido = ca1.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
		assertTrue(ca1.extraer(obtenido));
	}

	@Test
	public void extraerYNoMeAlcanzaTest() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(1000);
		ca1.extraer(1500);
		
		double esperado = 1000;
		double obtenido = ca1.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
		assertFalse(ca1.extraer(1500));
	}
	
	@Test(expected = Error.class)
	public void extraerNegativo() {
		CajaDeAhorro ca1 = new CajaDeAhorro("Luana Vallejos");
		ca1.depositar(1000);
		ca1.extraer(-500);
	}
}
