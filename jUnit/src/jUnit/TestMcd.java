package jUnit;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestMcd {
	
	Mcd Division1 = new Mcd(72,16);
	
	@Test
	public void TestMcd() {
		
		Division1.calculoMcd();
		assertEquals(8,Division1.calculoMcd());
		
	}

}
