package model;

/**
 * La clase Perro, tiene sus atributos, que pueden ser modificados por el voluntario.
 * @author Ana Solorzano
 *
 */
public class Perro {
	
	@Override
	public String toString() {
		return String.format("Perrito [ID=%s, nombre=%s, edad=%s, genero=%s, tamano=%s, imagen=%s, raza=%s, estado=%s, descripcion=%s]",
				                         perroID, nombre, edad, genero, tamano, imagen, raza, estado, descripcion);
	}
	private int perroID;
	private String nombre;
	private String edad;
	private String tamano;
	private String genero;
	private String raza;
	private String imagen;
	private String estado;
	private String descripcion;
	
	public Perro(){
		super();
	}
	
	/**
	 * @param iD
	 * @param nombre
	 * @param edad
	 * @param tamano
	 * @param genero
	 * @param raza
	 * @param imagen
	 * @param estado
	 * @param descripcion
	 */
	public Perro(int iD, String nombre, String edad, String tamano, String genero, String raza, String imagen,
			String estado, String descripcion) {
		super();
		perroID = iD;
		this.nombre = nombre;
		this.edad = edad;
		this.tamano = tamano;
		this.genero = genero;
		this.raza = raza;
		this.imagen = imagen;
		this.estado = estado;
		this.descripcion = descripcion;
	}		
	
	public int getID() {
		return perroID;
	}
	public void setID(int ID) {
		this.perroID = ID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.tamano = imagen;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
