package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ac.cr.cenfotec.IExamen.*;

public class CartaTest {

	// E
	
	@Test
	public void testEqualsCarta() throws Exception{
		Carta c1 = new Carta(TipoNombre.AS,TipoPalo.ESCUDOS);
		Carta c2 = new Carta(TipoNombre.AS,TipoPalo.ESTRELLAS);
		Carta c3 = new Carta(TipoNombre.CINCO,TipoPalo.ESCUDOS);
		assertEquals(true, c1.equals(c2));
		assertEquals(false, c1.equals(c3));
		
	}

}
