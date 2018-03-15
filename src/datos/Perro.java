package datos;

/**
 * La clase Perro, tiene sus atributos, que pueden ser modificados por el voluntario.
 * @author aSolorzano.
 *
 */
public class Perro {
	
	@Override
	public String toString() {
		return String.format("Perro [nombre=%s, edad=%s, genero=%s, tamano=%s]", nombre, edad, genero, tamano);
	}
	
	private String nombre;
	private String edad;
	private String genero;
	private String tamano;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param genero
	 * @param tamano
	 */
	public Perro(String nombre, String edad, String genero, String tamano) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.tamano = tamano;
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
	
	
}
