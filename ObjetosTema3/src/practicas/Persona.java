package practicas;

public class Persona {
	
	private String nombre;
    private String apellido;

    public Persona(){

    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters irían aquí abajo ...
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
    

    public static void main(String[] args) {

         Persona persona1 = new Persona();
         persona1.setNombre("Antonio");
         persona1.setApellido("Morales");

         Persona persona2 = new Persona("Luis", "Veliz");

         System.out.println(persona1.getNombre());
         System.out.println(persona2.getNombre());
     }

	
}


