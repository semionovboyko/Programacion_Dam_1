package practicas;

public class Pais {
	
	private String nombre; //propiedad nombre de cada objeto Pais. 
    private int cantidadHabitantes; //propiedad cantidadHabitantes de cada objeto Pais. 

    //Constructor, cuando se cree un objeto Pais se ejecutará el código incluido en el constructor, como sabemos sirve para INICIALIZAR.
    public Pais (String nombre, int cantidadHabitantes) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes ;
        //Puedes inicializar también con un valor fijo. 
        //this.nombre = "México City";
        //this.cantidadHabitantes = 125000;
    } 

      //Getters/Setters
      //método para obtener nombre de pais en el objeto Pais.
    public String getNombre () {
    	return nombre; 
    } 
    //método para asignar nombre pais en el objeto Pais.
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //método para obtener cantidad de habitantes de pais en el objeto Pais.
    public int getCantidadHabitantes () { 
    	return cantidadHabitantes; 
    } 
    //método para asignar cantidad de habitantes de pais en el objeto. 
    public void setCantidadHabitantes(int cantidadHabitantes){
        this.cantidadHabitantes = cantidadHabitantes;
    }

}
