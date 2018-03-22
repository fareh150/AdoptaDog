package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 
 * @author David Claro 
 */
public class Conexion {

	public Connection conectar(){
		Connection con = null;
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.13/adoptadog";
			String user = "usuario";
			String password = "";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
		} catch (Exception e) {
			//Aqui hay que devolver un pop up
			e.printStackTrace();
		}
		return con;
	}
	public ResultSet consultaSQL(Connection con, String query){
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();			
			try {
				rs = st.executeQuery(query);
			} catch (SQLException e) {
				//"Te has equivocado en la query";
			}
		} catch (Exception e) {
			//Aqui hay que devolver un pop up
		}
		return rs;
	}
	public void insertarSQL(Connection con, String query){
		Statement st = null;
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
