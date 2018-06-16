package ac.cr.cenfotec.IExamen;

public enum TipoPalo {
	ESCUDOS(0), FLORES(1), ESTRELLAS(2), GOTAS(3);
	
	private final int palo;
	
	TipoPalo(int palo){
		this.palo = palo;
	}
	
	private int palo() { return palo; }
	
}
