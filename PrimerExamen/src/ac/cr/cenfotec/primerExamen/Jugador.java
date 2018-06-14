package ac.cr.cenfotec.primerExamen;

import java.util.ArrayList;

public class Jugador {
	private ArrayList <Carta> mano = new ArrayList<>(); 
	private String nombre;

	public Jugador() {}
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Jugador(ArrayList<Carta> mano, String nombre) {
		super();
		this.mano = mano;
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
