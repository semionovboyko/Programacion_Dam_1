package practicas;

public class rectangulo {
	
		private int ancho;
		private int alto;

		rectangulo(int an, int al) {
			this.ancho = an;
			this.alto = al;
		}

		rectangulo() {
			alto = ancho = 0;
		}

		rectangulo(int dato) {
			ancho = alto = dato;
		}
		
		rectangulo(rectangulo r) {
			this.ancho = r.ancho;//getAncho();
			this.alto = r.alto;//getAlto();
		}
	
		public int getAncho() {
			return this.ancho;
		}

		public int getAlto() {
			return this.alto;
		}

		public rectangulo incrementarAncho() {
			ancho++;
			return this;
		}

		public rectangulo incrementarAlto() {
			this.alto++;
			return this;
		}
		
		public static void main(String[] args) {
			/*rectangulo r1 = new rectangulo(5, 7);
			rectangulo r2 = new rectangulo();
			r2 = r1;
			r2.incrementarAncho();
			r2.incrementarAlto();
			System.out.println("Alto: " + r1.getAlto());
			System.out.println("Ancho: " + r1.getAncho());*/
			
			rectangulo r1 = new rectangulo(5, 7);
			//rectangulo r2 = new rectangulo();
			rectangulo r2 = new rectangulo(r1);
			r2.incrementarAncho();
			r2.incrementarAlto();
			System.out.println("Alto: " + r2.getAlto());
			System.out.println("Ancho: " + r2.getAncho());
		}
			
		}
	
