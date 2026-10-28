package ejercicios;

public class Libro {
	
	public int ISBN;
	public String Titulo;
	public String Autor;
	public int numPag;
	public static int numLibros = 0;
	
	public Libro() {
		numLibros++;
	}
	
	public Libro(String tit, String aut) {
		Titulo = tit;
		Autor = aut;
		numLibros++;
	}
	
	public Libro(int code, String Tit, String Aut, int Pag) {
		ISBN = code;
		Titulo = Tit;
		Autor = Aut;
		numPag = Pag;
		numLibros++;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public int getNumLibros() {
		return numLibros;
	}

	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}
	
	public int muestraLibros() {
		return numLibros;
		
	}
	
	public String toString() {
		return "El libro "+Titulo+ " con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+numPag+" páginas."; 
	}
	
	
	public static void main(String[]args) {
		
		Libro L1 = new Libro();
		L1.setTitulo("Monstruos");
		L1.setNumPag(45);
		Libro L2 = new Libro("Anabel", "Mandela");
		L2.setNumPag(12);
		Libro L3 = new Libro(1234, "Casita", "Pedro", 32);
		
		if((L1.numPag > L2.numPag)&&(L1.numPag > L3.numPag )) {
			System.out.println(L1.toString());
		}else if((L2.numPag > L1.numPag)&&(L2.numPag > L2.numPag)) {
			System.out.println(L2.toString());
		}else {
			System.out.println(L3.toString());
		}
		
		System.out.println("___________________________________________________");
		System.out.println(L1.toString());
		System.out.println(L2.toString());
		System.out.println(L3.toString());
		
		
		System.out.println("___________________________________________________");
		System.out.println("Numero de libros: "+numLibros);
		
		
		
	}
	

}
