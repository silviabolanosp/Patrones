package ac.cr.cenfotec.primerExamen;

import java.util.ArrayList;

public class Mesa {
	
	Repartidor repartidor; 
	Jugador[] jugadores;
	
	
	public Mesa() {
		repartidor = new Repartidor();
		jugadores = new Jugador[4];
	}


	public void agregarJugador(int cantJugadores) {
		for(int i = 0; i < cantJugadores; i++) {
			String nombre = "Jugador " + (i + 1);
			jugadores[i] = new Jugador(nombre);
		}
	}
	
	public void EmpezarAJugar21 () {
		
		for(int i = 0; i < 4; i++) {	
			
			if(jugadores[i] != null) {
				
				Carta carta1 = repartidor.darCarta();
				Carta carta2 = repartidor.darCarta(); 
				jugadores[i].getMano().add(carta1);
				jugadores[i].getMano().add(carta2);
				System.out.println("El jugador " + (i+1) + " tiene un " + carta1.getValor() + " de " + carta1.getPaloString() + " y un " + carta2.getValor() + " de " + carta2.getPaloString());
			}
		}
	}
	
	public void adivinarGanador() {
		int[] manosJugadores = new int[4]; 
		
		for(int i = 0; i < 4; i++) {	
	
			if(jugadores[i] != null) {

				ArrayList <Carta> cartas = jugadores[i].getMano();
				int valor;
				
				if((cartas.get(0).getValor() == 10 && cartas.get(1).getValor() == 2) || (cartas.get(0).getValor() == 2 && cartas.get(1).getValor() == 10)) {
					valor = 0;
				}else {
					if(cartas.get(0).getValor() == 1 && cartas.get(1).getValor() == Carta.FLORES) { // COMODIN
						valor = 0;
					}else {
						valor = 21 - cartas.get(0).getValor() + cartas.get(1).getValor();
					}
				}
				
				manosJugadores[i] = valor;
			}
		}
		
		int ganador = -1;
		if(manosJugadores.length == 1) {
			System.out.println("El ganador es el jugador 1");
		}else {	
			for(int x = 0; x < manosJugadores.length; x++) {
				ganador = Math.min(manosJugadores[x], manosJugadores[x+1]);
			}
		}
		
	}

}
