package Ejercicio3;

public class Alumno {
	
	private String nombre;
	private double nota;
	/**
	 * Constructor Alumno
	 * @param nom -> nombre del alumno
	 * @param not -> nota del alumno
	 */
	public Alumno(String nom, double not) {
		nombre= nom;
		nota= not;
	}

	/**
	 * Metodo para insertar nombre
	 * @param nombre -> nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo para mostrar nombre
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para mostrar nota
	 * @return nota del alumno
	 */
	public double getNota() {
		return nota;
	}
	
	/**
	 * Metodo para introducir nota
	 * @param nota del alumno
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	/**
	 * Metodo sobreescrito de la clase toString.
	 * Metodo para mostrar los valores de nombre y nota.
	 */
	public String toString() {
		return this.getNombre() + "  Nota = " + this.getNota();
	}

}
