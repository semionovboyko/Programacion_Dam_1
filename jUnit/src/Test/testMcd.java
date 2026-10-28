package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Prueba.Cuenta;

public class testMcd {
	
	private Cuenta origen = new Cuenta();
	private Cuenta destino = new Cuenta();

	@Test
	public void test() {
		origen.deposito(200.00F);
		destino.deposito(150.00F);
		origen.transferencia(destino,100.00F);
		
		assertEquals(250.00F, destino.balance);
		assertEquals(100.00F, origen.balance);
	}
}


