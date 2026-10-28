package Multimedia;

/**
 * @author Alexe
 * @version 
 */

public class Multimedia {
	
	private String titulo;
	private String autor;
	private Formato formato;
	private int duracion;
	
	/**
	 * Es un constructor con parametros donde introduces los datos
	 * de un objeto multimedia.
	 * @param titulo Un título para el constructor.
	 * @param autor Un autor para el constructor.
	 * @param formato Un formato para el constructor.
	 * @param duracion Una duracion para el constructor.
	 */
	public Multimedia(String titulo, String autor, Formato formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	/**
	 * Devuelve el valor del titulo.
	 * @return titulo.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Inserta un título en la clase descripción.
	 * @param titulo El nuevo título de la descripción.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Es un metodo para compara dos objetos multimedia introducidos.
	 * @return true si conciden los dos objetos en el autor y en el titulo.
	 * @return false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/**
	 * Es un metodo que imprime por pantalla los valores introducidos en los metodos.
	 * @return valores
	 */
	@Override
	public String toString() {
		return "Multimedia titulo=" + titulo + " autor=" + autor + " formato=" + formato + " duracion=" + duracion;
	}
}
