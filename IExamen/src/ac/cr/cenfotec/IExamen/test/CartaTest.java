package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ac.cr.cenfotec.IExamen.*;

public class CartaTest {

	
	@Test
	public void testEqualsCarta() throws Exception{
		Carta c1 = new Carta(TipoNombre.AS,TipoPalo.ESCUDOS, 1);
		Carta c2 = new Carta(TipoNombre.AS,TipoPalo.ESTRELLAS, 1);
		assertEquals(true, c1.equals(c2));
		
	}

}
