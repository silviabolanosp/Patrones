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
				System.out.println("cantidad de cartas " + jugadores[i].getMano().size());
				
			}
		}
	}

}
