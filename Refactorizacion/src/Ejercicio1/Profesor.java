package Ejercicio1;

import java.util.List;

public class Profesor extends Persona {
	
	String nombre;//str; LOS NOMBRES DE LAS VARIABLES TIENE QUE ESTAR CLARA
	int edad;
	String numeroDeTelefono;
	String prestamos;
	
	public Profesor(String numeroDeTelefono) {
		super(numeroDeTelefono);
	}
	
	public void printInformacionPersonal() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Telefono: " + numeroDeTelefono);
	}
	
	public void printTodaLaInformacion() {
		/*System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Telefono: " + this.numeroDeTelefono);*/
		//NO HACE FALTA VOLVER A REPETIR LOS DATOS
		printInformacionPersonal();
		System.out.println(prestamos);
		
	}


}
