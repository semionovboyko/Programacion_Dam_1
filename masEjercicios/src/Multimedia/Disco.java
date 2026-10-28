package Multimedia;
import javax.print.attribute.standard.Media;

public class Disco extends Multimedia {
		
		public Genero genero;
		
		public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
			super(titulo, autor, formato, duracion);
			this.genero = genero;
			
		}
		
		public String toString() {
			return super.toString() + " Genero:" + genero;
		}


}
