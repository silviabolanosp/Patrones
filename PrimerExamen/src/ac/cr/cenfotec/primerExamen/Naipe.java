package ac.cr.cenfotec.primerExamen;

import java.util.*;

public class Naipe {
	private Carta[] naipe;
	private int cartasUsadas; 
	    
	public Naipe() { // constructor con cartas en orden
	           
		naipe = new Carta[52];
		int contCartasCreadas = 0; 
	       
		for ( int palo = 0; palo < 4; palo++ ) { // hay 4 tipos de palos
	    	   
			for ( int valor = 1; valor <= 13; valor++ ) { 
				if(valor == 1)
					naipe[contCartasCreadas] = new Carta(Carta.AS,palo);
				else
				if(valor > 10) {
					if(valor == 11)
					naipe[contCartasCreadas] = new Carta(Carta.JOTA,palo);
					if(valor == 12)
						naipe[contCartasCreadas] = new Carta(Carta.QUINA,palo);
					if(valor == 11)
						naipe[contCartasCreadas] = new Carta(Carta.KA,palo);
				}else {
					naipe[contCartasCreadas] = new Carta(valor,palo);
				}
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
