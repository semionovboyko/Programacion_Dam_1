package _02ejemplos._01medicos;

public class Medico {
	private String dni;
	private String nombre;
	
	
	public Medico(String dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override 
	public String toString() {
		return dni + " - " + nombre ;
	}
	
	@Override 
	public boolean equals(Object o){
		return this == o ||
				o instanceof Medico &&
				dni.equals(((Medico)o).dni);
	}
	
	

}
