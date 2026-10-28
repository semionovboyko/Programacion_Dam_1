package Ejercicio1;

public class Persona {
	
	String numeroDeTelefono;
	
	public Persona(String numeroDeTelefono) {
	//super(); NO HACE FALTA SUPER
		this.numeroDeTelefono= numeroDeTelefono;
	}
	
	public String getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	
	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
}
