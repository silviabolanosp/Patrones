package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.IExamen.*;


public class RepartidorTest {

	Repartidor repartidor;
	
	@Before
	public void unit() {
		repartidor = new Repartidor();
	}
	
	// S
	
	@Test
	public void testShuffle() {	
		assertEquals(false, repartidor.darCarta(0));
	}

}
