package Multimedia;

import javax.print.attribute.standard.Media;

public class Pelicula extends Multimedia {
	
	public String actor;
	public String actriz;
	
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
