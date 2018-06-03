package prototipo.patrones;

public class Empleado extends Persona{

	private String usuario;
	private String clave;
	private String estado;
	private String autorizacion;
	
	public Empleado(String nombre, String apellido, int cedula, String usuario, String clave, String estado, String autorizacion) {
		super(nombre, apellido, cedula);
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
		this.autorizacion = autorizacion;
	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getAutorizacion() {
		return autorizacion;
	}


	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	
	
}
