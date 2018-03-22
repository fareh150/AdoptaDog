package datos;

import java.sql.Connection;

import utilidades.Conexion;

public class PersonaDao {
	
	/**
	 * Se crea una persona en BBDD con sus parametros
	 * 
	 * @param nombre
	 * @param apellido
	 * @param correo
	 * @param telefono
	 * @param direccion
	 * @param perfil
	 * @param foto
	 * @param login
	 * @param password
	 * 
	 * @author David Claro
	 *
	 */
	public void crearPersona(String nombre, String apellido, String correo, String telefono, String direccion, String perfil, String foto, String login, String password){
		Conexion con = new Conexion();
		Connection conexion = con.conectar();
		String query = "INSERT INTO PERRO (PerroID, Nombre, Apellido, Correo, Telefono, Direccion, Perfil, Foto, Login, Password)VALUES(NULL, '" + nombre + "', '" + apellido + "', '" + correo + "', '" + telefono + "', '" + direccion + "', '" + perfil + "', '" + foto + "', '" + login + "', '" + password + "')";
		con.insertarSQL(conexion, query);
	}
	/**
	 * Se modifica una persona en BBDD con sus parametros
	 * 
	 * @param personaID
	 * @param nombre
	 * @param apellido
	 * @param correo
	 * @param telefono
	 * @param direccion
	 * @param perfil
	 * @param foto
	 * @param login
	 * @param password
	 * 
	 * @author David Claro
	 *
	 */
	public void modificarPersona(int personaID, String nombre, String apellido, String correo, String telefono, String direccion, String perfil, String foto, String login, String password){
		Conexion con = new Conexion();
		Connection conexion = con.conectar();
		String query = "UPDATE PERRO SET Nombre = '" + nombre + "', Apellido = '" + apellido + "', Correo = '" + correo + "', Telefono = '" + telefono + "', Direccion = '" + direccion + "', Perfil = '" + perfil + "', Foto = '" + foto + "', Login = '" + login + "', Password = '" + password + "' WHERE PersonaID = '" + personaID + "'";
		con.insertarSQL(conexion, query);
	}
	/**
	 * Se da de baja una persona en BBDD con sus parametros
	 * 
	 * @param personaID
	 *  
	 * @author David Claro
	 *
	 */
	public void darBajaPersona(int personaID){
		Conexion con = new Conexion();
		Connection conexion = con.conectar();
		String perfil = "Baja";
		String query = "UPDATE PERRO SET Perfil = '" + perfil + "' WHERE PersonaID = '" + personaID + "'";
		con.insertarSQL(conexion, query);
	}
}
