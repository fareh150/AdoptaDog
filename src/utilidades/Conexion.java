package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public Connection conectar(){
		Connection con = null;
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://localhost/id5077647_adoptadog";
			String user = "id5077647_luca";
			String password = "luca1234";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
		} catch (Exception e) {
			//Aqui hay que devolver un pop up
		}
		return con;
	}
	public ResultSet sentenciaSQL(Connection con){
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			String query = "SELECT * FROM PERRO";
			try {
				rs = st.executeQuery(query);
			} catch (SQLException e) {
				//"Te has equivocado en la query";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rs;
	}
}
