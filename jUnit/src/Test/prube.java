package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnit.Mcd;

class prube {
	Mcd Division1 = new Mcd(72,16);

	@Test
	void test() {
		Division1.calculoMcd();
		assertEquals(8,Division1.calculoMcd());
	}

}
