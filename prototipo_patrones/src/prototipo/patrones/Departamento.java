package prototipo.patrones;

import java.util.ArrayList;

public class Departamento {
	private String nombreDepartamento; // rrhh, negociacion, firmaContrato
	private int idDepartamento; // 1, 2, 3
	
	
	public Departamento(String nombreDepartamento, int idDepartamento) {
		super();
		this.nombreDepartamento = nombreDepartamento;
		this.idDepartamento = idDepartamento;
	}


	public String getNombreDepartamento() {
		return nombreDepartamento;
	}


	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}


	public int getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	
	
	
	
}
