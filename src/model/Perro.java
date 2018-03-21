package model;

/**
 * La clase Perro, tiene sus atributos, que pueden ser modificados por el voluntario.
 * @author Ana.
 *
 */
public class Perro {
	
	@Override
	public String toString() {
		return String.format("Perrito [ID=%s, nombre=%s, edad=%s, genero=%s, tamano=%s, imagen=%s]", ID, nombre, edad, genero, tamano, imagen);
	}
	private int ID;
	private String nombre;
	private String edad;
	private String genero;
	private String tamano;
	private String imagen;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param genero
	 * @param tamano
	 */
	public Perro(int ID, String nombre, String edad, String genero, String tamano, String imagen) {
		super();
		this.ID = ID;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.tamano = tamano;
		this.tamano = imagen;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
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
	
	
}
