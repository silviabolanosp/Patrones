package ac.cr.cenfotec.IExamen;

public class Repartidor {
	Naipe cartas = new Naipe();
	private int cartasUsadas; 
	
    public Carta darCarta() {
        cartasUsadas++;
        return cartas.getNaipe()[cartasUsadas - 1];
    }
    
    public boolean darCarta(int i) {
    	i = 0;
    	Carta c1 = new Carta(TipoNombre.AS,TipoPalo.ESCUDOS);
    	if(cartas.getNaipe()[i] != c1) {
    		return false;
    	}else {
    		return true;
    	}
    }
	
	
}
