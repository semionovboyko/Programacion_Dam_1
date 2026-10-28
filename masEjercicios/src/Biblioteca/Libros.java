package Biblioteca;

public class Libros extends Publicaciones implements Prestable{
	
	
	private boolean prestado = false;

	public Libros(int codigo, String titulo, int anyo, boolean prestado) {
		super(codigo, titulo, anyo);
		this.prestado = prestado;
	}


	@Override
	public void Prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
		
	}

	@Override
	public boolean Prestado() {
		return prestado;
	}


	@Override
	public String toString() {
		return super.toString() + " prestado = " + prestado;
	}
	
}
