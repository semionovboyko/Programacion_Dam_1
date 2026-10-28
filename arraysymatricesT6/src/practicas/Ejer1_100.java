package practicas;

public class Ejer1_100 {
	
	public static void main(String[] args) {
		 
        //Esto es opcional
        final int TAMANIO=101;
 
        int num[]=new int[TAMANIO];
 
        //Invocamos las funciones
        
 
        mostrarArray(num);
        
        sumaAndMedia(num);
    }
 
 
    public static void mostrarArray(int lista[]){
        for(int i=1;i<lista.length;i++){
            System.out.print(i+ " ");
        }
    }
    
    public static void sumaAndMedia(int lista[]) {
    	int suma = 0;
    	for(int i=1;i<lista.length;i++){
    		suma += i;
        }
    	System.out.println("\nSuma = "+suma);
    	System.out.println("Media = "+(suma)/100);
    	
    }
}
