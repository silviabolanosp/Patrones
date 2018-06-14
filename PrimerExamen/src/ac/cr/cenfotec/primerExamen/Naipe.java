package ac.cr.cenfotec.primerExamen;

public class Naipe {
	private Carta[] naipe;
	private int cartasUsadas; 
	    
	public Naipe() { // constructor con cartas en orden
	           
		naipe = new Carta[52];
		int contCartasCreadas = 0; 
	       
		for ( int palo = 0; palo < 4; palo++ ) { // hay 4 tipos de palos
	    	   
			for ( int valor = 1; valor <= 13; valor++ ) { ////////// MODIFICAR
				naipe[contCartasCreadas] = new Carta(valor,palo);
				contCartasCreadas++;
			}
		}
		cartasUsadas = 0;
	}
	    
	    public void shuffle() {
	        for ( int i = 51; i > 0; i-- ) {
	            int rand = (int)(Math.random()*(i+1));
	            Carta temp = naipe[i];
	            naipe[i] = naipe[rand];
	            naipe[rand] = temp;
	        }
	        cartasUsadas = 0;
	    }
	    
	    public int CartasQueQuedan() {
	        return 52 - cartasUsadas;
	    }
	    
	    public Carta DarCarta() {
	        if (cartasUsadas == 52)
	           shuffle();
	        cartasUsadas++;
	        return naipe[cartasUsadas - 1];
	    }

}
