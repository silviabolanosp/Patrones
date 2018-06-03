package prototipo.patrones;

public class Tramite {
	
	private int idTramite;
	private String origen;
	private String destino;
	private String tipo;
	private String estado;
	
	
	public Tramite(int idTramite, String origen, String destino, String tipo, String estado) {
		super();
		this.idTramite = idTramite;
		this.origen = origen;
		this.destino = destino;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	
	public int getIdTramite() {
		return idTramite;
	}
	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

	
	
	
	
	
}
