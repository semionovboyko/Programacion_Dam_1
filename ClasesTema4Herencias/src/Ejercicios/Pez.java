package Ejercicios;

public class Pez implements Cloneable {
	
	public String nombre;
	private static int numPeces;
	
	public Pez() {
		numPeces++;
	}
	
	public Pez (String nombre){
		this.nombre = nombre;
		numPeces++;
	}
	
	public Pez (Pez p) {
		this.nombre = p.nombre;
		numPeces++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static int cuantosPecesHay() {
		return numPeces;
	}
	
	
	
	@Override
	public Object clone() {
		
		Object objeto = null; 
		try { 
			objeto = super.clone( ); 
			numPeces++;
		} catch (CloneNotSupportedException ex) {
			System.out.println("Error al duplicar"); 
		} return objeto; 
	}
	
	@Override
	public boolean equals(Object obj) {
	Pez p= (Pez)obj;
	return p.getNombre().equals(this.getNombre());
	}
	
	@Override
	public String toString() {
		
		return nombre;
	}
	
	public static void main(String []args) {
		
		Pez payaso = new Pez();
		payaso.setNombre("Nemo");
		Pez payaso1 = (Pez) payaso.clone();
		Pez globo = new Pez();
		
		Pez globo2 = new Pez(payaso); 
		
		
		System.out.println(payaso);
		System.out.println(payaso1.toString());
		System.out.println(globo.equals(payaso));
		System.out.println(cuantosPecesHay());
		System.out.println(globo2);
		
	}
}


