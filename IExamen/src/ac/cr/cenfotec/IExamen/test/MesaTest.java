package ac.cr.cenfotec.IExamen.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.IExamen.Carta;
import ac.cr.cenfotec.IExamen.Jugador;
import ac.cr.cenfotec.IExamen.Mesa;
import ac.cr.cenfotec.IExamen.TipoNombre;
import ac.cr.cenfotec.IExamen.TipoPalo;

public class MesaTest {

	Mesa mesa;	
	
	@Before
	public void unit() {
		mesa = new Mesa();
	}
	
	// A
	
	@Test
	public void testAdivinarGanador() {
		Carta c1 = new Carta(TipoNombre.KA,TipoPalo.FLORES);
		Carta c2 = new Carta(TipoNombre.JOTA,TipoPalo.FLORES);
		Carta c3 = new Carta(TipoNombre.AS,TipoPalo.ESCUDOS);
		Carta c4 = new Carta(TipoNombre.DOS,TipoPalo.ESCUDOS);
		Carta c5 = new Carta(TipoNombre.NUEVE,TipoPalo.ESTRELLAS);
		Carta c6 = new Carta(TipoNombre.TRES,TipoPalo.ESTRELLAS);		
		
		ArrayList <Carta> mano1 = new ArrayList<>(); 
		ArrayList <Carta> mano2 = new ArrayList<>();
		ArrayList <Carta> mano3 = new ArrayList<>(); 
		
		mano1.add(c1);
		mano1.add(c2);
		mano2.add(c3);
		mano2.add(c4);
		mano3.add(c5);
		mano3.add(c6);
		
		Jugador j1 = new Jugador("jugaodor 1 ", mano1);
		Jugador j2 = new Jugador("jugaodor 2 ", mano2);
		Jugador j3 = new Jugador("jugaodor 3 ", mano3);
		
		Jugador jugadores[] = {j1, j2, j3};
		
		assertEquals(j1, mesa.compararJugadores(jugadores));
	}
	
	@Test
	public void testAgarrarUnaCarta() throws Exception {
		Jugador j = new Jugador ("Jugador 1");
		assertEquals(1, mesa.agarrarCarta(j));
	}
	
	@Test
	public void testAgregarJugadores() throws Exception {
		assertEquals(false, mesa.agregarJugador(5));
	}
	
	// C
	
	@Test
	public void testCambiarCartas() {
		Carta c1 = new Carta(TipoNombre.AS,TipoPalo.FLORES);
		assertEquals(true, mesa.comodin(c1));
	}
	
	@Test
	public void testComodin() {
		Carta c1 = new Carta(TipoNombre.AS,TipoPalo.FLORES);
		assertEquals(true, mesa.comodin(c1));
	}
	
	// D
	
	@Test
	public void testDarDosCartas() {
		assertEquals(2, mesa.darDosCartas());
	}
	
	@Test
	public void testDarSieteCartas() {
		assertEquals(7, mesa.darSieteCartas());
	}
	
	@Test
	public void testDesecharUnaCarta() {
		Carta c1 = new Carta(TipoNombre.SIETE,TipoPalo.FLORES);
		Carta c2 = new Carta(TipoNombre.OCHO,TipoPalo.FLORES);
		Carta c3 = new Carta(TipoNombre.KA,TipoPalo.ESCUDOS);
		Carta c4 = new Carta(TipoNombre.CINCO,TipoPalo.ESCUDOS);
		
		
		ArrayList <Carta> mano1 = new ArrayList<>(); 
		
		mano1.add(c1);
		mano1.add(c2);
		mano1.add(c3);
		mano1.add(c4);

		
		Jugador j = new Jugador("jugaodor 1 ", mano1);

		assertEquals(3, mesa.desecharCarta(j).getMano().size());
	}
	
	// E
	
	@Test
	public void testEmpate() {
		Carta c1 = new Carta(TipoNombre.SIETE,TipoPalo.FLORES);
		Carta c2 = new Carta(TipoNombre.OCHO,TipoPalo.FLORES);
		Carta c3 = new Carta(TipoNombre.KA,TipoPalo.ESCUDOS);
		Carta c4 = new Carta(TipoNombre.CINCO,TipoPalo.ESCUDOS);
		
		
		ArrayList <Carta> mano1 = new ArrayList<>(); 
		ArrayList <Carta> mano2 = new ArrayList<>();
		
		mano1.add(c1);
		mano1.add(c2);
		mano2.add(c3);
		mano2.add(c4);

		
		Jugador j1 = new Jugador("jugaodor 1 ", mano1);
		Jugador j2 = new Jugador("jugaodor 2 ", mano2);
		
		Jugador jugadores[] = {j1, j2};
		
		assertEquals(true, mesa.empate(jugadores));
	}
	
	// R
	
	@Test
	public void testResetJugadores() {
		Mesa m = new Mesa();
		assertEquals(0, mesa.resetJugadores(m));
	}
	
	@Test
	public void testResetNaipe() {
		Mesa m = new Mesa();
		assertEquals(0, mesa.resetNaipe(m));
	}
	
	
	// V
	
	@Test
	public void testVeintiUnoYMedio() {
		Carta c1 = new Carta(TipoNombre.DIEZ,TipoPalo.FLORES);
		Carta c2 = new Carta(TipoNombre.DOS,TipoPalo.ESCUDOS);
		assertEquals(true, mesa.VeintiUnoYMedio(c1, c2));
	}
	
	@Test
	public void verificarCambioDeManoTest()throws Exception{
		Carta carta1 = new Carta(); carta1.setNombre(TipoNombre.QUINA); 
		Carta carta2 = new Carta(); carta2.setNombre(TipoNombre.AS);
		
		ArrayList<Carta> manoAct = new ArrayList<Carta>(); manoAct.addAll(Arrays.asList(carta1,carta2));
		
		ArrayList<Carta> nueMano = mesa.verificarCambioDeMano(manoAct);
		
		Carta nueCart1 = nueMano.get(0);
		Carta nueCart2 = nueMano.get(1);
		
		assertFalse(carta1.getNombre() == nueCart1.getNombre());
		assertTrue(carta2.getNombre() == nueCart2.getNombre());
	}

	
	
	
	
	

}
