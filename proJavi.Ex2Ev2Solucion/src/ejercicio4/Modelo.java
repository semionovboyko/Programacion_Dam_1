package ejercicio4;

public class Modelo {
    private String nombre;
    private int anyo;
    private int emisiones;
    
    public int compareTo(Modelo m){
    	if(this.anyo < m.anyo) return -1;
    	else if(this.anyo > m.anyo) return 1;
    	else if(this.nombre.compareTo(m.nombre) < 0) return -1;
    	else if(this.nombre.compareTo(m.nombre) > 0) return 1;
    	else return 0;
    }
    public int compareTo2(Modelo m){
    	if(this.anyo != m.anyo) return this.anyo - m.anyo;
    	else return this.nombre.compareTo(m.nombre);
    }
    
    public boolean aptoPlanPIVE(){
    	return this.anyo >= 2012 && this.emisiones <= 160;
    }
    public static double tasaPorEmisiones(int emisiones){
    	if(emisiones <= 100) return 10;
    	else if(emisiones <= 200) return 15;
    	else return 20;

    }

    //-----------------------------------------------------------------
    //------- El resto de m�todos no se deben modificar ---------------
    public Modelo(String nombre, int anyo, int emisiones){
        this.nombre = nombre;
        this.anyo = anyo;
        this.emisiones = emisiones;
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Modelo)) return false;
        Modelo m = (Modelo)o;
        return anyo == m.anyo && nombre.equals(m.nombre);
    }
    
    public int getAnyo(){
    	return anyo;
    }
    public int getEmisiones(){
    	return emisiones;
    }
    public String getNombre(){
    	return nombre;
    }

    public String toString(){
        return  "Nombre: " + nombre + " - Anyo: " + anyo + " - Emisiones: " + emisiones;
    }
}
