package ac.cr.cenfotec.IExamen;

import java.util.*;

public class Naipe {
	
	// ATRIBUTOS
	
	private Carta[] naipe;
	private int cartasUsadas; 
	
	//CONSTRUCTORES
	
	public Naipe() {
	           
		naipe = new Carta[52];
		int contCartasCreadas = 0; 
	       
		for (TipoPalo palo : TipoPalo.values()) {
	    	   
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
    
    // METODOS
    
    // C
    
    public int cartasQueQuedan() {
        return 52 - cartasUsadas;
    }
    
    // G
    public Carta[] getNaipe() {
		return naipe;
	}

    // T
	
	@Override
	public String toString() {
		return "Naipe [naipe=" + Arrays.toString(naipe) + "]";
	}
}
