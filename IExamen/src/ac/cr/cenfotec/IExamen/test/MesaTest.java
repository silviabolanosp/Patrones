package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.IExamen.Carta;
import ac.cr.cenfotec.IExamen.Mesa;
import ac.cr.cenfotec.IExamen.TipoNombre;
import ac.cr.cenfotec.IExamen.TipoPalo;

public class MesaTest {

	Mesa mesa;	
	
	@Before
	public void unit() {
		mesa = new Mesa();
	}
	
	@Test
	public void testAgregarJugadores() throws Exception {
		assertEquals(false, mesa.agregarJugador(5));
	}
	
	@Test
	public void testComodin() {
		Carta c1 = new Carta(TipoNombre.AS,TipoPalo.FLORES);
		assertEquals(true, mesa.comodin(c1));
	}
	
	@Test
	public void testVeintiUnoYMedio() {
		Carta c1 = new Carta(TipoNombre.DIEZ,TipoPalo.FLORES);
		Carta c2 = new Carta(TipoNombre.DOS,TipoPalo.ESCUDOS);
		assertEquals(true, mesa.VeintiUnoYMedio(c1, c2));
	}

}
