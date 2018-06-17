package ac.cr.cenfotec.IExamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mesa {
	
	// ATRIBUTOS
	
	private Repartidor repartidor; 
	private Jugador[] jugadores;
	private Naipe deck;
	private int cartasUsadas; 
	
	//CONSTRUCTORES
	
	public Mesa() {
		repartidor = new Repartidor();
		jugadores = new Jugador[4];
		deck = repartidor.getCartas();
		cartasUsadas = repartidor.getCartasUsadas();
	}
	
	// METODOS

	// A
	
	public void adivinarGanador() { 
		ArrayList <Integer> manosJugadores = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {	
	
			if(jugadores[i] != null) {

				ArrayList <Carta> cartas = jugadores[i].getMano();
				int valor;
				
				if((cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) == 10 && cartas.get(1).getValueAsInt(cartas.get(1).getNombre()) == 2) || (cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) == 2 && cartas.get(1).getValueAsInt(cartas.get(1).getNombre()) == 10)) {
					valor = 21;
					System.out.println("El jugador "+ (i+1) +" saco un 21 y medio ");
				}else {
					
					if(cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) == 1 && cartas.get(0).getPaloString() == "FLORES") { // COMODIN
						System.out.println("El jugador "+ (i+1) +" saco el comodin AS de FLORES ");
						valor = 21;
					}else {
						valor = cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) + cartas.get(1).getValueAsInt(cartas.get(1).getNombre());
					}
				}
				manosJugadores.add(valor);
			}
		}
		
		
		int ganador = -1;
		String ganadorString = "";
		int indiceGanador = -1;
		boolean empate = false;
		
		if(manosJugadores.size() == 1) {
			System.out.println("El ganador es el jugador 1");
		}else {	
			
			for(int x = 0; x < manosJugadores.size(); x++) {
				
				if(manosJugadores.get(x) > ganador) {
					ganador = manosJugadores.get(x);
					ganadorString = "jugador " + (x+1);
					indiceGanador = x;
				}
			}
			
			for(int j = 0; j < manosJugadores.size(); j++) {
				if((manosJugadores.get(j) == ganador) && (j != indiceGanador)) {
					System.out.println("Hay un empate entre el " + ganadorString + " y el jugador " + (j+1));
					empate = true;
				}
			}
			if(empate == false) {
				System.out.println("\nEl ganador es el " + ganadorString + " con un valor de " + ganador + ".\n");
			}
		}
	}
	
    public int agarrarCarta(Jugador j) {
        cartasUsadas++;
        j.getMano().add(deck.getNaipe()[cartasUsadas - 1]);
        return j.getMano().size();
    }
	
	public boolean agregarJugador(int cantJugadores) throws Exception{
		if(cantJugadores > 4 || cantJugadores <= 0) {
			return false;
		}else{
			for(int i = 0; i < cantJugadores; i++) {
				String nombre = "Jugador " + (i + 1);
				jugadores[i] = new Jugador(nombre);
			}
		}
		return true;
	}
	
	// C
	
	public boolean comodin(Carta c) {
		if(c.getValueAsInt(c.getNombre()) == 1 && c.getPaloString() == "FLORES") { // COMODIN
			return true;
		}else {
			return false;
		}
	}
	
	public Jugador compararJugadores(Jugador[] jss) {
		ArrayList <Integer> manosJugadores = new ArrayList<>();
		
		for(int i = 0; i < jss.length; i++) {	
			
			ArrayList <Carta> cartas = jss[i].getMano();
			int valor;
			
			valor = cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) + cartas.get(1).getValueAsInt(cartas.get(1).getNombre());
				
			
			manosJugadores.add(valor);
		}
		
		
		
		int ganador = -1;
		int indiceGanador = -1;
		
		if(manosJugadores.size() == 1) {
			return jss[0];
		}else {	
			
			for(int x = 0; x < manosJugadores.size(); x++) {
				
				if(manosJugadores.get(x) > ganador) {
					ganador = manosJugadores.get(x);

					indiceGanador = x;
				}
			}
			return jss[indiceGanador];
		}
	}
	
	// D
	
	public int darDosCartas () {
		
	
		Jugador j = new Jugador("Mario");
				
		for (int x = 0; x < 2; x++) {
			Carta carta1 = repartidor.darCarta();
			j.getMano().add(carta1);
		}
		return j.getMano().size();
		
	}
	
	public int darSieteCartas () {
		
		
		Jugador j = new Jugador("Mario");
				
		for (int x = 0; x < 7; x++) {
			Carta carta1 = repartidor.darCarta();
			j.getMano().add(carta1);
		}
		return j.getMano().size();
		
	}
		
	public Jugador desecharCarta(Jugador j) {
		Random rand = new Random(); 
		int value = rand.nextInt(6); 
		j.getMano().remove(value);
		return j;
	}
	
	// E
	
	public boolean empate(Jugador[] jss) {
		
		ArrayList <Integer> manosJugadores = new ArrayList<>();
		
		for(int i = 0; i < jss.length; i++) {	
			
			ArrayList <Carta> cartas = jss[i].getMano();
			int valor;
			
			valor = cartas.get(0).getValueAsInt(cartas.get(0).getNombre()) + cartas.get(1).getValueAsInt(cartas.get(1).getNombre());
				
			
			manosJugadores.add(valor);
		}
		
		int ganador = -1;
		int indiceGanador = -1;
		
		if(manosJugadores.size() == 1) {
			return false;
		}else {	
			
			for(int x = 0; x < manosJugadores.size(); x++) {
				
				if(manosJugadores.get(x) > ganador) {
					ganador = manosJugadores.get(x);

					indiceGanador = x;
				}
			}
			
			for(int j = 0; j < manosJugadores.size(); j++) {
				if((manosJugadores.get(j) == ganador) && (j != indiceGanador)) {
					return true;
				}
			}
			return false;
		}
	
	}
	
	public void EmpezarAJugar21 () {
		
		for(int i = 0; i < 4; i++) {	
			Carta carta;
			if(jugadores[i] != null) {
				
				for (int x = 0; x < 2; x++) {
					carta = repartidor.darCarta();
					jugadores[i].getMano().add(carta);
					System.out.println("El jugador " + (i+1) + " tiene un " + carta.getNombre() +" de " + carta.getPaloString());
				}
			}
		}
		
		adivinarGanador();
	}

	public void empezarPartidaDeRon () {
		
		for(int i = 0; i < jugadores.length; i++) {	
			Carta carta;
			if(jugadores[i] != null) {
				
				for (int x = 0; x < 7; x++) {
					carta = repartidor.darCarta();
					jugadores[i].getMano().add(carta);
				}
			}
		}
	}
	
	// G
	
	public Jugador[] getJugadores() {
		return jugadores;
	}

	public int getCartasUsadas() {
		return cartasUsadas;
	}
	
	// R
	public int resetJugadores(Mesa m) {
		for(int i = 0; i<4;i++) {
		jugadores[i] = null;
		}
		
		jugadores = null;
		
		if(jugadores == null) {
			return 0;
		}
		
		return 1;
	}
	
	public int resetNaipe(Mesa m) {
		m.setCartasUsadas(0);
		return m.getCartasUsadas();
	}
	
	// S
	
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public void setCartasUsadas(int cartasUsadas) {
		this.cartasUsadas = cartasUsadas;
	}
	
	
	// V
	
	public boolean VeintiUnoYMedio(Carta c1, Carta c2) {
		if(((c1.getValueAsInt(c1.getNombre()) == 10 && c2.getValueAsInt(c2.getNombre()) == 2)) || (c1.getValueAsInt(c1.getNombre()) == 2 && c2.getValueAsInt(c2.getNombre()) == 10)) {
			return true;
		}else {
			return false;
		}
	}

	public ArrayList<Carta> verificarCambioDeMano(ArrayList<Carta> pMano)throws Exception{
		Carta cartaAct;
		Carta nueCart;
		ArrayList<Carta> nueMano = new ArrayList<Carta>();
		
		for(int i = 0; i < pMano.size(); i++) {
			cartaAct = pMano.get(i);
			switch(cartaAct.getNombre()) {
			case JOTA:
			case QUINA:
			case KA:
			case TRES:
				nueCart = repartidor.darCarta();
				nueMano.add(nueCart);
				break;
			default:
				nueMano.add(cartaAct);
				break;
			}
		}
		
		return nueMano;
	}
}
