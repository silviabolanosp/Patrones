package ac.cr.cenfotec.foobarqix.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.foobarqix.Foobarqix;

public class FoobarqixTest {

	Foobarqix fbq;	
	
	@Before
	public void unit() {
		fbq = new Foobarqix();
	}
	
	@Test
	public void testEnteroAString() {

		assertEquals("3", fbq.enteroAString(3));
	}
	
	@Test
	public void testDivisible3() {
		assertEquals("FOO", fbq.metodoFBQ(3));
	}
	
	@Test
	public void testDivisible5() {
		assertEquals("BAR", fbq.metodoFBQ(5));
	}
	
	@Test
	public void testDivisible7() {
		assertEquals("QIX", fbq.metodoFBQ(7));
	}
	
	@Test
	public void testDivisibleVarios() {
		assertEquals("BARQIX", fbq.metodoFBQ(35));
	}
	
	

}
