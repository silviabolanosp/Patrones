package calculadoracomidabuilder;

import calculadoracomida.Medida;

public class InformacionComida {
	
	
	private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
	
    
	
	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}



	public static class InformacionComidaBuilder {
		   
	    private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;   
	    
	    public InformacionComidaBuilder(final String nombre, final Medida g) {
	    	this.nestedNombre = nombre;
	    	this.nestedUnidadDeMedida = g;
	    }
		
		public InformacionComida calculadoraComida() {
			return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones, nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
		}

	    public InformacionComidaBuilder cantidadPorcion(int cantidadPorcion) {
	        this.nestedCantidadPorcion = cantidadPorcion;
	        return this;
	    }

	    public InformacionComidaBuilder unidadDeMedida(Medida mg) {
	        this.nestedUnidadDeMedida = mg;
	        return this;
	    }


	    public InformacionComidaBuilder porciones(int porciones) {
	        this.nestedPorciones = porciones;
	        return this;
	    }

	    public InformacionComidaBuilder calorias(int calorias) {
	        this.nestedCalorias = calorias;
	        return this;
	    }


	    public InformacionComidaBuilder grasa(int grasa) {
	        this.nestedGrasa = grasa;
	        return this;
	    }

	    public InformacionComidaBuilder sodio(int sodio) {
	        this.nestedSodio = sodio;
	        return this;
	    }

	    public InformacionComidaBuilder carbohidratos(int carbohidratos) {
	        this.nestedCarbohidratos = carbohidratos;
	        return this;
	    }
		
	    
	    
	
	} 
}
