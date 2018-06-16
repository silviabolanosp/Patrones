package ac.cr.cenfotec.IExamen;

import java.util.*;

public class Naipe {
	private Carta[] naipe;
	private int cartasUsadas; 
	    
	public Naipe() { // constructor con cartas en orden
	           
		naipe = new Carta[52];
		int contCartasCreadas = 0; 
	       
		for (TipoPalo palo : TipoPalo.values()) { // hay 4 tipos de palos
	    	   
			for (TipoNombre nombre : TipoNombre.values()) { 
				
				naipe[contCartasCreadas] = new Carta(nombre,palo);				
				
				contCartasCreadas++;
			}
		}		
		cartasUsadas = 0;
		List<Carta> rev = shuffle(naipe);
		
		Carta[] naipesShuffle = new Carta[rev.size()];
		naipesShuffle = rev.toArray(naipesShuffle);
	}
    
    public List<Carta> shuffle(Carta[] n) {
    	List<Carta> revuelto =  Arrays.asList(n);
    	Collections.shuffle(revuelto);
    	return revuelto;
    }
    
    
    public Carta[] getNaipe() {
		return naipe;
	}


	public int cartasQueQuedan() {
        return 52 - cartasUsadas;
    }

	@Override
	public String toString() {
		return "Naipe [naipe=" + Arrays.toString(naipe) + "]";
	}
}
