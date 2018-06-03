package prototipo.patrones;

/*


import static com.sistemacompras.gestorbd.Conector.getConector;
import java.util.ArrayList;
import com.sistemacompras.objects.Departamento;
import com.sistemacompras.objects.Empleado;

public class MDepartamento {
    
    public Departamento buscarDepartamentoPorId(int idDepartamento) throws java.sql.SQLException,Exception{
        Departamento departamento;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
        "FROM tDepartamento "+
        "WHERE idDepartamento='"+idDepartamento+"';";
        rs = getConector().ejecutarSQL(sql,true);

        if (rs.next()){
        	departamento = new Departamento(
                rs.getInt("idDepartamento"),
                rs.getString("NombreDepartamento"),
                buscarEmpleadosPorDepartamento(idDepartamento)
            );
        } else {
            throw new Exception ("Departamento no encontrado intentelo de nuevo.");
            }

        rs.close();
        return departamento;
    }
    
    public ArrayList<Departamento> buscarDepartamentos() throws java.sql.SQLException,Exception{
        java.sql.ResultSet rs;
        String sql;
        Departamento departamento;
        ArrayList<Departamento> Departamentos = new ArrayList<Departamento>();
        sql="SELECT * "+
        "FROM tDepartamento; ";
        getConector().ejecutarSQL(sql);
        rs = getConector().ejecutarSQL(sql,true);
        
        if (rs.next()) {
            do {
            	departamento = new Departamento(
                        rs.getInt("idDepartamento"),
                        rs.getString("NombreDepartamento"),
                        buscarEmpleadosPorDepartamento(rs.getInt("idDepartamento"))
                    );
		Departamentos.add(departamento);
		} while (rs.next());
	} else {
            throw new Exception ("No hay Departamentos disponibles.");
        }

        rs.close();
        return Departamentos;
    }
    
    public ArrayList<Empleado> buscarEmpleadosPorDepartamento(int idDepartamento)
    		throws java.sql.SQLException,Exception{
        java.sql.ResultSet rs;
        String sql;
        Empleado empleado;
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        sql="SELECT * "+
        "FROM tEmpleado" + 
        "WHERE idDepartamento='"+idDepartamento+"';";
        getConector().ejecutarSQL(sql);
        rs = getConector().ejecutarSQL(sql,true);
        
        if (rs.next()) {
            do {
            	empleado = new Empleado(
	                rs.getInt("idEmpleado"),
	                rs.getString("nombreEmpleado"),
	                rs.getString("RolEmpleado")
                );
		empleados.add(empleado);
		} while (rs.next());
	} else {
            throw new Exception ("No hay Departamentos disponibles.");
        }

        rs.close();
        return empleados;
    }

    public void borrar(Departamento departamento) throws
        java.sql.SQLException,Exception{
        String sql;
        sql= "DELETE FROM tDepartamento "+
        "WHERE idDepartamento='"+departamento.getId()+"';";
        
            try {
                getConector().ejecutarSQL(sql);
            }
            catch (Exception e) {
                throw new Exception ("Departamento no registrado.");
            }
            
    }
	
    public String buscarLlavePublica(int idDepartamento) throws java.sql.SQLException,Exception{
        String llavePublica;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
        "FROM tDepartamento "+
        "WHERE Departamento='"+idDepartamento+"';";
        rs = getConector().ejecutarSQL(sql,true);

        if (rs.next()){
        	llavePublica = rs.getString("LlavePublica");
        } else {
            throw new Exception ("Llave Publica no encontrada intentelo de nuevo.");
            }

        rs.close();
        return llavePublica;
    }
    
}





*/
