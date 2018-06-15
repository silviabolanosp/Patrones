package ac.cr.cenfotec.primerExamen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ac.cr.cenfotec.primerExamen.Carta;

class CartaTest {	
	
	//@Test (expected=Exception.class)
	//public void testSetValor()  throws Exception{
	//	assertEquals(1, new Carta(33, Carta.FLORES));
	//}	
	
	@Test
	public void testEqualsCarta() throws Exception{
		Carta c1 = new Carta(8, Carta.ESCUDOS);
		Carta c2 = new Carta(8,Carta.ESTRELLAS);
		assertEquals(true, c1.equals(c2));
		
	}

}
