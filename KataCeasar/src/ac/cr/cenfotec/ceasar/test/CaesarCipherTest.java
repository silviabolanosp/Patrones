package ac.cr.cenfotec.ceasar.test;

import static org.junit.Assert.*;
import org.junit.Test;

import ac.cr.cenfotec.ceasar.CaesarCipher;

public class CaesarCipherTest {
	
	@Test
	public void ceasarEncriptaValor0() {
		CaesarCipher ceasar = new CaesarCipher(0);
		assertEquals('A', ceasar.encryptLetter('A'));
	}
	
	@Test
	public void ceasarEncriptaValor2() {
		CaesarCipher ceasar = new CaesarCipher(2);
		assertEquals('C', ceasar.encryptLetter('A'));
	}
	
	@Test
	public void ceasarEncripta() {
		CaesarCipher ceasar = new CaesarCipher(2);
		assertEquals("CDEF", ceasar.encrypt("ABCD"));
	}
	
	@Test
	public void ceasarDecriptaValor2() {
		CaesarCipher ceasar = new CaesarCipher(2);
		assertEquals('A', ceasar.decryptLetter('C'));
	}
	
	@Test
	public void ceasarDecripta() {
		CaesarCipher ceasar = new CaesarCipher(2);
		assertEquals("ABCD", ceasar.decrypt("CDEF"));
	}
	

}
