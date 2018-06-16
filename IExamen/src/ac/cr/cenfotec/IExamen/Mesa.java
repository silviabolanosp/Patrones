package ac.cr.cenfotec.IExamen;

import java.util.ArrayList;
import java.util.List;

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
				System.out.println("El jugador " + (i+1) + " tiene un " + carta1.getNombre() +" de " + carta1.getPaloString() + " y un " + carta2.getNombre() + " de " + carta2.getPaloString());
			}
		}
		adivinarGanador();
	}
	
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

}
