package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Perro;
import utilidades.Conexion;
/**
 * Se realiza la busqueda de todos los perros en BBDD
 * @author DavidClaro
 *
 */
public class PerroDao {
	public List<Perro> listarPerro(){
		
		List<Perro> perros= new ArrayList<>();
		Conexion con = new Conexion();
    	Connection conexion = con.conectar();
    	String query = "SELECT * FROM PERRO";
    	ResultSet rs = con.consultaSQL(conexion, query);
    	try {
    		while (rs.next()) {
    			Perro perrito = new Perro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
        		perros.add(perrito);    			
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return perros;
	}
	
	/**
	 * Realiza la consulta de perros por los siguientes campos:
	 * <ul>
	 * <li>edad</li>
	 * <li>tamanno</li>
	 * <li>genero</li>
	 * </ul>
	 * @param edad
	 * @param tamanno
	 * @param genero
	 * @return
	 * @author AnaSolorzano
	 */
	public List<Perro> buscarPerros(String edad, String tamanno, String genero)
	{
		Conexion con = new Conexion();
    	Connection conexion = con.conectar();
    	
    	//Sentencia SQL principal
    	StringBuffer sql =  new StringBuffer("SELECT * FROM PERRO WHERE 1=1");
    	
    	//Agregar filtros.
    	agregarFiltro(edad, " AND EDAD = ", sql);
    	agregarFiltro(genero, " AND GENERO = ", sql);
    	agregarFiltro(tamanno, " AND TAMANNO = ", sql);

    	//Se ejecuta la sentencia SQL y devuelve los resultados en un objeto ResultSet
    	ResultSet rs = con.consultaSQL(conexion, sql.toString());
    	
    	List<Perro> perros= new ArrayList<>();
    	
    	try {
    		while (rs.next()) {
    			Perro perrito = new Perro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),  rs.getString(6));
        		perros.add(perrito);    			
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return perros;
	}
	
	/**
	 * Agrega los filtros de busqueda a la sentencia SQL principal.
	 * @param campo
	 * @param andSql
	 * @param sql
	 */
	private void agregarFiltro(String campo , String andSql , StringBuffer sql)
	{
		if(campo != null && !campo.isEmpty())
    	{
			//sql.append(" AND GENERO = ").append("'").append("MACHO").append("'");
    		sql.append(andSql).append("'").append(campo).append("'");
    	}
	}
}
