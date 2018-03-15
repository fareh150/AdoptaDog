package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

	public void conectar(){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://es.000webhost.com/id5077647_adoptadog";
			String user = "id5077647_luca";
			String password = "luca1234";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();
		} catch (Exception e) {
			
		}
		
	}
}
