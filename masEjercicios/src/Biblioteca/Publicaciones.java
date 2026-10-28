package Biblioteca;

public class Publicaciones {
	
	public int codigo;
	public String titulo;
	public int anyo;
	
	public Publicaciones(int codigo, String titulo, int anyo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	@Override
	public String toString() {
		return " codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo ;
	}
	
	

}
