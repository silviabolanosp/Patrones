package prototipo.patrones;

import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author silviabolanos
 */
public class Gestor {
    
    // C
	
	public void cambiarAutorizacion(String usuario, String autorizacion) throws Exception {
		(new MultiEmpleado()).cambiarAutorizacion(usuario, autorizacion);
	}
	
	public void cambiarEstado(String usuario, String estado) throws Exception{
		(new MultiEmpleado()).cambiarEstado(usuario, estado);
	}
	
	
	/**
	* Metodo que crea nuevo aplicante
	* @param nombre nombre del empleado     
	* @param apellido apellido del empleado
	* @param cedula cedula empleado  
	* @param usuario usuario del empleado     
	* @param clave clave del empleado
	* @param estado estado del empleado
	*/
		
	public void crearEmpleado(String nombre, String apellido, int cedula, String usuario, String clave, String estado, String autorizacion) throws Exception{
		(new MultiEmpleado()).crearEmpleado(nombre, apellido, cedula, usuario, clave, estado, autorizacion);
		
	}
	
	// H
	
    /** Metodo que envia datos al metodo que muestra el historial de los empleados pendientes
 * @param autorizacion variable para que escoja solo los casos de empleados cuya autorizacion es "pendiente"
 * 
 */
       public Vector verHistorial(String autorizacion)throws java.sql.SQLException,Exception{
        
        Vector empleados=null;
        Vector historial=null;
        Empleado emp = null;
        
        empleados = (new MultiEmpleado().historialEmpleadosPendientes(autorizacion));
        historial = new Vector();
        
            for (int i=0; i<empleados.size(); i++) {
            emp = ((Empleado) empleados.get(i));
            TreeMap datosEmpleados = new TreeMap();
            datosEmpleados.put("nombre", emp.getNombre());
            datosEmpleados.put("apellido", emp.getApellido());
            datosEmpleados.put("cedula", emp.getCedula());
            datosEmpleados.put("usuario", emp.getUsuario());
            datosEmpleados.put("estado", emp.getEstado());
            datosEmpleados.put("autorizacion", emp.getAutorizacion());
            historial.add(datosEmpleados);          
        }

        return historial;
    }
	
	// I
	
	
	/**
	 * Metodo que envia datos al main sobre el empleado
	 * @param usuario usuario del empleado
	 */
	    
    public Empleado informacionEmpleado(String usuario)throws java.sql.SQLException,Exception{
        
        Empleado existe = (new MultiEmpleado().informacionEmpleado(usuario));
        
        return existe;
    }
	
    
    // V
	
	/**
	 * Metodo que envia datos al metodo que revisa que el usuario del empleado exista en la base de datos 
	 * @param usuario usuario del empleado
	 */
	    
    public boolean validarEmpleado(String usuario)throws java.sql.SQLException,Exception{
        
        boolean existe = (new MultiEmpleado()).validarEmpleado(usuario);
        
        return existe;
    }
    
    
    /** Metodo que envia datos al metodo que revisa que sea la correcta contrasena del empleado
     * @param usuario usuario del empleado asignado por el usuario
     * @param clave contrasena del empleado asignado por el usuario
     */  
        
    public boolean validarEmpleadoClave (String usuario,String password)throws java.sql.SQLException,Exception{
        
        boolean claveCorrecta = (new MultiEmpleado()).validarEmpleadoClave(usuario, password);
        
        return claveCorrecta;
    }
    
    /** Metodo que envia datos al metodo que revisa que sea la correcta contrasena del empleado
     * @param usuario usuario del empleado asignado por el usuario
     * @param clave contrasena del empleado asignado por el usuario
     */  
        
    public int validarEmpleadoDepartamento (String usuario, int id_departamento)throws java.sql.SQLException,Exception{
        
        int dep = (new MultiEmpleado()).validarEmpleadoDepartamento(usuario, id_departamento);
        return dep;
    }
    
 
}
