package Multimedia;
import javax.print.attribute.standard.Media;
/**
 * 
 * @author Alexe
 *
 */
public class Disco extends Multimedia {
		
		public Genero genero;
		/**
		 * Es un constructor con parametros donde introduces los datos
	     * de un objeto disco.
	     * 
		 * @param titulo
		 * @param autor
		 * @param formato
		 * @param duracion
		 * @param genero
		 */
		public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
			super(titulo, autor, formato, duracion);
			this.genero = genero;
			
		}
		
		public String toString() {
			return super.toString() + " Genero:" + genero;
		}


}
