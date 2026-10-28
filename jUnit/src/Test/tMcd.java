package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Prueba.Cuenta;

class tMcd {
	
	private Cuenta origen = new Cuenta();
	private Cuenta destino = new Cuenta();

	@Test
	void testCuenta() {
		origen.deposito(200.00F);
		destino.deposito(150.00F);
		origen.transferencia(destino,100.00F);
		
		assertEquals(250.00F, destino.balance);
		assertEquals(100.00F, origen.balance);
	}



	

}
