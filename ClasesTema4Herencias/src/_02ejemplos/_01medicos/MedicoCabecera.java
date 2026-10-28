package _02ejemplos._01medicos;

public class MedicoCabecera extends Medico {
	//MedicoCabecera HEREDA dni y nombre, getDni(), setDni() ....
		//Podemos incorporar atributos nuevos y métodos nuevos
		private boolean visitaCasas;
	
	//Constructor
	public MedicoCabecera(String dni, String nombre, boolean visitaCasas){
		super(dni,nombre); //llamada al constructor de Medico
		
		this.visitaCasas = visitaCasas;
	}
	
	
	
	public boolean getVisitaCasas(){
		return visitaCasas;
	}
	
	public void setVisitaCasas(boolean v ){
		this.visitaCasas = v;
	}
	
	//Reescritura de un método (Override).
	//El método toString se hereda, pero vamos a hacer que devuelva
	//algo distinto en MedicoCabecera que en Medico
	
	@Override
	public String toString(){
		return "DNI: " + getDni() + "\n" +
				"Nombre: " + getNombre() + "\n" + 
				(visitaCasas? "Si " : "No ") + "visita casas";
	}
	

}
