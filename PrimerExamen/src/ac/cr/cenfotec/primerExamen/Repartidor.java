package ac.cr.cenfotec.primerExamen;

public class Repartidor {
	Naipe cartas = new Naipe();
	private int cartasUsadas; 
	
    public Carta darCarta() {
        cartasUsadas++;
        return cartas.getNaipe()[cartasUsadas - 1];
    }
    
	
	
}
