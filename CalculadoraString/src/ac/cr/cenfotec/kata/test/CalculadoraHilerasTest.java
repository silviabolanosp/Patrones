package ac.cr.cenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ac.cr.cenfotec.kata.CalculadoraHileras;

public class CalculadoraHilerasTest {

	CalculadoraHileras cal = new CalculadoraHileras();
	
	@Test
	public void stringVacio() throws Exception {
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void testSumaSimple() throws Exception {
		assertEquals(1, cal.add("0,1"));
		assertEquals(3, cal.add("0,1,2"));
	}
	
	@Test (expected=Exception.class)
	public void testErrorNumeroParamero() throws Exception {
		assertEquals(4,cal.add("1,1,1,1"));
		
	}
	
	@Test
	public void testUnNumero() throws Exception {
		assertEquals(1, cal.add("1"));
		assertEquals(2, cal.add("2"));

	}
	
	@Test (expected=NumberFormatException.class)
	public void testSeparadores() throws Exception {
		assertEquals(1, cal.add("0-1"));

	}

	@Test
	public void testNParametros() throws Exception {
		String s[] = {"1,2,3,4"};
		assertEquals(10, cal.addNParametros(s));

	}
	
	@Test
	public void testMasSeparadores() throws Exception {
		assertEquals(6, cal.add("1;2:3"));

	}
	

	

}
