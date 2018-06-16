package ac.cr.cenfotec.IExamen;

public class Repartidor {
	Naipe cartas = new Naipe();
	private int cartasUsadas; 
	
    public Carta darCarta() {
        cartasUsadas++;
        return cartas.getNaipe()[cartasUsadas - 1];
    }
    
	
	
}
