package Modelo;

public class Autor {
	
	private Integer idAutor;
	private String nombre;
	private String apellidos;
	
	public Autor() {
		
	}

	public Autor(Integer idAutor, String nombre, String apellidos) {

		this.idAutor = idAutor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	

	@Override
	public String toString() {
		return this.nombre + " " + this.apellidos + ". \n ";
	}

	
	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
