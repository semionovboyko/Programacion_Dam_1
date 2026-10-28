package Multimedia;

import javax.print.attribute.standard.Media;

/**
 * 
 * @author Alexe
 *
 */
public class Pelicula extends Multimedia {
	
	public String actor;
	public String actriz;
	/**
	 * Es un constructor con parametros donde introduces los datos
	 * de un objeto pelicula.
	 * Solo uno de los dos (actor o actriz) pueden ser un valor null,sino se lanzará* una excepción.
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param duracion
	 * @param actor
	 * @param actriz
	 * 
	 * @throws IllegalArgumentException Solo un parametro entro actor o actriz puede ser un valor null.
	 */
	public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		
		if ( actor == null && actriz == null) {
			throw new IllegalArgumentException("Ambos campos no pueden ser vacios");
		}
		
		this.actor = actor;
		this.actriz = actriz;
	}
	
	public String toString() {
		return super.toString() + " Actor: " + actor + " Actriz: " + actriz;
	}

}
