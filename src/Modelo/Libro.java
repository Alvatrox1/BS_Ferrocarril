package Modelo;

public class Libro {
	
	private Integer idLibro;
	private String folio;
	private String titulo;
	private Autor autor;
	private String isbn;
	private Editorial editorial;
	private Integer a�o;
	private Pais pais;
	private Estante estante;
	private Sala sala;
	private String descripcion;
	private Status status;
	
	public Libro() {
		
	}

	public Libro(Integer idLibro, String folio, String titulo, Autor autor, String isbn, Editorial editorial,
			Integer a�o, Pais pais, Estante estante, Sala sala, String descripcion, Status status) {

		this.idLibro = idLibro;
		this.folio = folio;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editorial = editorial;
		this.a�o = a�o;
		this.pais = pais;
		this.estante = estante;
		this.sala = sala;
		this.descripcion = descripcion;
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return " Libro : " + " Numero de Libro : " + this.idLibro + ". Folio : " + this.folio + ". Titulo : " + this.titulo + 
				". Autor : " + this.autor + ". ISBN : " + this.isbn + ". Editorial : " + this.editorial + ". A�o de Publicacion : " +
				this.a�o + " Pais de Origen : " +  this.pais + ". Estante : " + this.estante + ". Sala : " + this.sala + 
				". Descripcion : " + this.descripcion + ". Status : " + this.status + ". \n ";
	}

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estante getEstante() {
		return estante;
	}

	public void setEstante(Estante estante) {
		this.estante = estante;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	

}
