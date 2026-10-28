package _02ejemplos._01medicos;

public class Especialista extends Medico{
	
	private String especialidad;
	
	public Especialista(String dni, String nombre, String especialidad){
		super(dni,nombre);
		this.especialidad = especialidad;
	}
	
	//La reescritura de un método puede ser TOTAL (como en MedicoCabecera)
	// o PARCIAL (Aprovechar lo que hace la clase padre): 
	public String toString(){
		return super.toString() + " - " + especialidad;
	}

}
