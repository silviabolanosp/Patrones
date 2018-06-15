package ac.cr.cenfotec.primerExamen;

public class Carta{

    public final static int ESCUDOS = 0, FLORES = 1, ESTRELLAS = 2, GOTAS = 3;
    public final static int AS = 1, JOTA = 10, QUINA = 10, KA = 10;
    private final int palo;
    private final int valor; 
    
 
             
	public Carta (int valor, int palo) { // throws Exception
		
		if (valor > 11 || valor <= 0) {
			throw new IllegalArgumentException("El valor debe estar en un rango del 1 al 10");
		}
		this.valor = valor;
		this.palo = palo;
	}


	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Carta)) {
			return false;
		}
			
		Carta carta = (Carta) obj;
		return this.valor == carta.valor;
	}
	
	
	
	
	
}
