package Capa.logica;

import java.io.*;
import java.sql.SQLException;
import java.util.Vector;

import prototipo.patrones.*;

public class Main {

	static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	public static void main(String[] args) throws SQLException, Exception {
		
		boolean continuar = true;
		int opcion = -1;
		
		while (continuar == true){
			Gestor gestor = new Gestor ();
			
			
			try {						

				out.println("Ingrese:\n"
						+ "1) Si ya es un empleado y desea ingresar al sistema.\n"
						+ "2) Si desea aplicar para un empleo.\n"
						+ "3) Si es aplicante y desea seguir con el proceso.\n"
						+ "4) Si desea salir del programa.\n");
				opcion = (Integer.parseInt(in.readLine ()));
				
			}catch (NumberFormatException a){
				out.println("Ingrese solo numeros disponibles\n");
			}
			
	
			
			switch (opcion){
				
				case 1: // sign in
					logIn(gestor);

					break;
				case 2: // contratar nuevo usuario
					reclutamiento(gestor);
					
					break;
					
				case 3:
					// progreso del aplicante
					
					procesoAplicante(gestor);
					break;
					
				case 4:
					continuar = false;
					
					break;
					
				default:
					out.println("Seleccione una de las opciones\n");
					break;
			}	
		}
		out.println("Gracias por utilizar el programa");	
	}

	
	// case 1
	
	public static void logIn(Gestor gestor) throws NumberFormatException, SQLException, Exception {
		int opcion = -1;
		
		out.println("Ingrese el usuario");
		String usuario = (in.readLine ());
		
		out.println("Ingrese la clave");
		String clave = (in.readLine ());
				
		
		if (gestor.validarEmpleado(usuario)) {
			
			if(gestor.validarEmpleadoClave(usuario, clave)) {
				
				Empleado emp = gestor.informacionEmpleado(usuario);
				boolean proceso = true;
				
				while(proceso) {
				
					try {						
					out.println("Ingrese:\n"
							+ "1) Si desea ver los aplicantes.\n"
							+ "2) Si desea autorizar a que pase a la siguiente fase.\n"
							+ "3) Regresar al inicio del programa");
					opcion = (Integer.parseInt(in.readLine ()));
					
					}catch (NumberFormatException a){
						out.println("Ingrese solo numeros disponibles\n");
					}	
	
					switch(opcion) {
					
					case 1:
						// ver aplicantes
						
						Vector historial = gestor.verHistorial("pendiente");
						//cambiar arraylist
						
	
						System.out.println(historial);
						
						break;	
					
					case 2:								
						// autorizar a siguiente paso
						
						out.println("Ingrese el usuario del aplicante");
						String aplicante = (in.readLine ());
						
						String autorizacion = "autorizado";
						gestor.cambiarAutorizacion(aplicante, autorizacion);
						
						break;
						
					case 3:
						proceso = false;
						break;
	
					default:
						
						out.println("Seleccione una de las opciones\n");
						break;
							
					}
				}
				
			}else {
				out.println("Clave incorrecta!\n");
			}
			
		}else {
			out.println("Usuario no encontrado!\n");
		}
	} 
	
	// case 2
	
	public static void reclutamiento(Gestor gestor) throws SQLException, Exception {
		String usuario = "";
		int cedula = -1;
		
		out.println("Ingrese el nombre");
		String nombre = (in.readLine ());
		
		out.println("Ingrese el apellido");
		String apellido = (in.readLine ());
		
		boolean negativo = true;
		
		while (negativo) {
			out.println("Ingrese la cedula");
			cedula = (Integer.parseInt(in.readLine ()));
			
			if(cedula >0) {
				negativo = false;
			}else {
				out.println("La cedula solo puede tener numeros positivos!");
			}
		}
		
		boolean existeUsuario = true;
		
		while(existeUsuario) {
		
			out.println("Ingrese el usuario");
			usuario = (in.readLine ());
		
			if (gestor.validarEmpleado(usuario)) {
				out.println("Usuario elegido ya existe. Intentelo de nuevo!");
			}else {
				existeUsuario = false;
			}
		}
		
		out.println("Ingrese la clave");
		String clave = (in.readLine ());
		
		out.println("Ingrese:\n"
				+ "1) Si desea pertenecer al departamento de reclutamiento.\n"
				+ "2) Si desea pertenecer al departamento de negociacion.\n"
				+ "3) Si desea pertenecer al departamento de firma de contratos.\n"
				+ "4) Si desea salir del programa.\n");
		int departamento = (Integer.parseInt(in.readLine ()));
		
		String estado = "reclutado";
		String autorizacion = "autorizado";
		
		Empleado emp = null;
		
		if(nombre != "" && apellido != "" && cedula >0 && usuario!= "" && clave != "" && estado!= "") {
			gestor.crearEmpleado(nombre, apellido, cedula, usuario, clave, estado, autorizacion);
		}
		
		out.println("Aplicacion al empleo terminada.");
		
			
	}
	
	// case 3
	
	public static void procesoAplicante(Gestor gestor) throws SQLException, Exception {
		String estado = "";
		
		out.println("Ingrese el usuario");
		String usuario = (in.readLine ());
		
		out.println("Ingrese el password");
		String password = (in.readLine ());
				
		
		if (gestor.validarEmpleado(usuario)) {
			
			if(gestor.validarEmpleadoClave(usuario, password)) {
			
				Empleado emp = gestor.informacionEmpleado(usuario);
				
				System.out.println(emp.getEstado() +"  "+ emp.getAutorizacion());
				
				//reclutado
				if (emp.getEstado().equals("reclutado") && emp.getAutorizacion().equals("autorizado")) {
					
					
					out.println("Es mayor de edad? (responda 'si' o 'no')");
					String edad = (in.readLine ());
					
					out.println("Tiene al menos un anno de experiencia? (responda 'si' o 'no')");
					String experiencia = (in.readLine ());
					
					if(edad == "si" && experiencia == "si") {
						estado = "negociacion";

						
					}else {
						out.println("Lo lamentamos pero no cumple con los requisitos deseados.");
						estado = "descartado";
					}
				}
				
				
				//negociacion
				if (emp.getEstado() == "negociacion" && emp.getAutorizacion() == "autorizado") {
					out.println("Acepta el salario propuesto? (responda 'si' o 'no')");
					String salario = (in.readLine ());
					
					if(salario == "si") {
						estado = "firma contrato";

						
					}else {
						out.println("Lo lamentamos pero no cumple con los requisitos deseados.");
						estado = "descartado";
					}
				}
				
				//firma de contrato				
				if (emp.getEstado() == "firma contrato" && emp.getAutorizacion() == "autorizado") {
					out.println("Acepta el trabajo? (responda 'si' o 'no')");
					String trabajo = (in.readLine ());
					
					if(trabajo == "si") {
						estado = "contratado";

						
					}else {
						out.println("Lo lamentamos pero no cumple con los requisitos deseados.");
						estado = "descartado";
						
					}
							
					
				}
				
				
				//contratado		
				if (emp.getEstado() == "contratado" && emp.getAutorizacion() == "autorizado") {
					out.println("Felicidades ha sido contratado");				
					
				}else {		
					String autorizacion = "pendiente";
					gestor.cambiarEstado(usuario, estado);
					gestor.cambiarAutorizacion(usuario, autorizacion);
				}
				
			}else {
				out.println("Clave incorrecta!");
			}
			
		}else {
			out.println("Usuario ya existe! Elija otro");
		}
	}
	
	
}
