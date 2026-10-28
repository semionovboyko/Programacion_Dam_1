package Ejercicio4;

import java.util.ArrayList;

public class Persona {
	
	private int dni;
	private String apellido;
	private String nombre;
	private char sexo;
	private int edad;
	private double peso;
	
	/**
	 * Constructor
	 * @param d -> dni de la persona
	 * @param a -> apellido de la persona
	 * @param n -> nombre de la persona
	 * @param s -> sexo de la persona
	 * @param e -> edad de la persona
	 * @param p -> peso de la persona
	 */
	public Persona( int d, String a, String n, char s, int e, double p) {
		dni = d;
		apellido = a;
		nombre = n;
		sexo= s;
		edad = e;
		peso = p;
	}
	/**
	 * Metodo para mostrar el dni.
	 * @return dni.
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * Metodo para insertar un dni.
	 * @param dni.
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * Metodo para mostrar el apellido.
	 * @return apellido.
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Metodo para insertar el apellido.
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo para mostrar el nombre.
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo para insertar el nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo para mostrar el sexo.
	 * @return sexo.
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * Metodo para insertar el sexo
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * Metodo para mostrar la edad.
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Metodo para insertar la edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Metodo para mostrar el peso
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * Metodo para insertar el peso
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * Metodo sobreescrito de la clase toString
	 * Muestra los valores de los atributos.
	 */
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", sexo=" + sexo + ", edad="
				+ edad + ", peso=" + peso + "]";
	}

	
}
