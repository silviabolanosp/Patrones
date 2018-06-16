package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ac.cr.cenfotec.IExamen.*;

public class NaipeTest {

	Naipe naipe;
	
	@Before
	public void unit() {
		naipe = new Naipe();
	}
	
	// T
	
	@Test
	public void testTamanoDelNaipe() {	
		assertEquals(52, naipe.getNaipe().length);
	}

}
