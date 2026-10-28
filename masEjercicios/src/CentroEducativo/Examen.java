package CentroEducativo;

import java.util.*;

public class Examen {
	
	private String asignatura;
	private int aula;
	private Fecha fecha;
	private Hora hora;
	
	public Examen(String asig,int aul, Fecha f, Hora h) {
		asignatura = asig;
		aula = aul;
		fecha = f;
		hora = h;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Examen asignatura=" + asignatura + " aula=" + aula +" "+ fecha.toString() + " " + hora.toString() ;
	}
	
	
}
