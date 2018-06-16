package ac.cr.cenfotec.IExamen;

import java.util.ArrayList;

public class Jugador {
	private ArrayList <Carta> mano = new ArrayList<>(); 
	private String nombre;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}


	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	

	


	
	
	
	
	
	
}
