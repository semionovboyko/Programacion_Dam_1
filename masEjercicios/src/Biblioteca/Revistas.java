package Biblioteca;

public class Revistas extends Publicaciones {
	
	private int numero;
	
	public Revistas(int codigo, String titulo, int anyo, int numero) {
		super(codigo,titulo,anyo);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + "numero=" + numero;
	}
	
	

}
