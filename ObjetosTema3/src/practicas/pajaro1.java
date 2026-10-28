package practicas;

public class pajaro1 {
		
	// *** atributos o propiedades *** 
		
		private char color;  
		private int edad;    
		
		// *** métodos de la clase *** 
		
		pajaro1() {
			color = 'v'; 
			edad = 0;
		}      // constructor de la clase pájaro
		
		pajaro1( char c, int e) {
			color = c; 
			edad = e;
		}    // constructor clase pájaro 
		
		// ***Aquí irán los demás métodos de la clase *** 
		
		public static void main (String[ ] args) {       
			
			// metodo main 
			pajaro1 p1, p2; 
			p1 = new pajaro1( ); 
			p2 = new pajaro1('a', 3); 
		} 
	}

