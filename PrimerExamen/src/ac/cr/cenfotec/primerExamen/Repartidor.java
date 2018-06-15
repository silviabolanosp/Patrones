package ac.cr.cenfotec.primerExamen;

public class Repartidor {
	Naipe cartas = new Naipe();// ordenado
	private int cartasUsadas; 
	
    public Carta darCarta() {
        cartasUsadas++;
        
        return cartas.getNaipe()[cartasUsadas - 1];
    }
    
	
	
}
