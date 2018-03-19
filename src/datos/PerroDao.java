package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Perro;
import utilidades.Conexion;

public class PerroDao {
	public List<Perro> listarPerro(){
		List<Perro> perros= new ArrayList<>();
		Conexion con = new Conexion();
    	Connection conexion = con.conectar();
    	String query = "SELECT * FROM PERRO";
    	ResultSet rs = con.consultaSQL(conexion, query);
    	try {
    		while (rs.next()) {
    			Perro perrito = new Perro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        		perros.add(perrito);    			
    		}
		} catch (SQLException e) {
			// TODO: handle exception
		}
    	return perros;
	}
}
