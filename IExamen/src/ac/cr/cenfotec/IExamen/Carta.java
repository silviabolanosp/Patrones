package ac.cr.cenfotec.IExamen;  
    
public class Carta {
	
	// ATRIBUTOS
	
	private TipoNombre nombre;
	private TipoPalo palo;
	private int valor;

	
	//CONSTRUCTORES
	
	public Carta() {
		super();

	}
	
	public Carta(TipoNombre nombre, TipoPalo palo) {
		super();
		this.nombre = nombre;
		this.palo = palo;
	}	
	
	public Carta(TipoNombre nombre, TipoPalo palo, int valor) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.valor = valor;
	}
	
	// METODOS
	
	// E
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Carta)) {
			return false;
		}
			
		Carta carta = (Carta) obj;
		return this.getValueAsInt(this.getNombre()) == carta.getValueAsInt(carta.getNombre());
	}
	
	// G
	
	public TipoNombre getNombre() {
		return nombre;
	}
	
	public TipoPalo getPalo() {
		return palo;
	}
	
	public String getPaloString() {
	    switch ( palo ) {
	       case ESCUDOS:   return "ESCUDOS";
	       case FLORES:   return "FLORES";
	       case ESTRELLAS: return "ESTRELLAS";
	       case GOTAS:    return "GOTAS";
	       default:       return "??";
	    }
	}
	
	public int getValueAsInt(TipoNombre tp) {
		switch (tp) {
		   case AS:   return 1;
		   case DOS:   return 2;
		   case TRES:   return 3;
		   case CUATRO:   return 4;
		   case CINCO:   return 5;
		   case SEIS:   return 6;
		   case SIETE:   return 7;
		   case OCHO:   return 8;
		   case NUEVE:   return 9;
		   case DIEZ:  return 10;
		   case JOTA:  return 10;
		   case QUINA:  return 10;
		   case KA:  return 10;
		   default:  return -1;
		}
	}
	
	public String getValueAsString() {
	switch (valor) {
	   case 1:   return "As";
	   case 2:   return "2";
	   case 3:   return "3";
	   case 4:   return "4";
	   case 5:   return "5";
	   case 6:   return "6";
	   case 7:   return "7";
	   case 8:   return "8";
	   case 9:   return "9";
	   case 10:  return "10";
	   case 11:  return "Jota";
	   case 12:  return "Quina";
	   case 13:  return "Ka";
	   default:  return "??";
	}
}


	// S
	
	public void setNombre(TipoNombre nombre) {
		this.nombre = nombre;
	}

}
