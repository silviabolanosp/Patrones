package prototipo.patrones;

public class Empresa {

	private String nombre = "Desarrollo Electronicos SA";
	private String cedulaJuridica;
	
	public Empresa(String cedulaJuridica) {
		super();
		this.cedulaJuridica = cedulaJuridica;
	}

	public String getCedulaJuridica() {
		return cedulaJuridica;
	}

	public void setCedulaJuridica(String cedulaJuridica) {
		this.cedulaJuridica = cedulaJuridica;
	}

	public String getNombre() {
		return nombre;
	}
		
	
}
