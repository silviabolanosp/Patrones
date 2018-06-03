package prototipo.patrones;

import java.util.Date;

public class Historial {
	
	private int idhistorial;
	private int idEmpleado;
	private Date fecha;
	private int idTramite;
	
	
	public Historial(int idhistorial, int idEmpleado, Date fecha, int idTramite) {
		super();
		this.idhistorial = idhistorial;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
		this.idTramite = idTramite;
	}


	public int getIdhistorial() {
		return idhistorial;
	}


	public void setIdhistorial(int idhistorial) {
		this.idhistorial = idhistorial;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getIdTramite() {
		return idTramite;
	}


	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}
	
	
	
	
}
