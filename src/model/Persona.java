package model;
/**
 * La clase persona, tiene sus atributos, que pueden ser insertados, modificados o eliminados en BBDD.
 * @author Ana
 */
public class Persona {

	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, apellidos=%s, correo=%s, telefono=%s, direccion=%s]", nombre,
				apellidos, correo, telefono, direccion);
	}
	private String nombre;
	private String apellidos;
	private String correo;
	private int telefono;
	private String direccion;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param correo
	 * @param telefono
	 * @param direccion
	 */
	public Persona(){
		
	}
	
	public Persona(String nombre, String apellidos, String correo, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
