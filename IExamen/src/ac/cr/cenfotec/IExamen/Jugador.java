package ac.cr.cenfotec.IExamen;

import java.util.ArrayList;

public class Jugador {
	
	// ATRIBUTOS 
	
	private ArrayList <Carta> mano = new ArrayList<>(); 
	private String nombre;
	
	//CONSTRUCTORES
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Jugador(String nombre, ArrayList<Carta> mano) {
		super();
		this.mano = mano;
		this.nombre = nombre;
	}

	// METODOS
	
	// G
	
	public ArrayList<Carta> getMano() {
		return mano;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	// S
	
	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	

	


	
	
	
	
	
	
}
