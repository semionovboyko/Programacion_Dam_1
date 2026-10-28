package ejercicios;

public class propuesto1 {
	
	private static int[] lista;
	final static int POS = 50; // número de posiciones del array 
	final static int LIMITE=100; // números entre 1 y LIMITE 
	static int cont ;
	
	public static int getAleatorio() {
		return (int)(Math.random()*LIMITE+1); 
		}

	public static void ordena_burbuja() {
		
		for (int i = 0; i< lista.length-1; i++) {
			boolean cambio = false;
		
			for (int j = lista.length-1; j > i; j--)  
				if (lista[j] < lista[j-1]) {  
					int aux = lista[j];      
					lista[j] = lista [j-1];   
					lista[j-1] = aux;   
					cambio = true;
				}
			    if (cambio == false) {
			    	break;
			    }
		}
	}
	public static void muestra() {
		for (int f = 0; f < lista.length; f++)
			System.out.print(lista[f] + " ");
	}
	
	public static void main(String[] args) { 
		lista = new int[POS];
		for (int f = 0; f < POS; f++)
			lista[f] = getAleatorio();
		System.out.println("Vector aleatorio.");
		muestra(); // muestra el vector desordenado 
		System.out.println("\n\nVector ordenado por el método de la burbuja.");
		ordena_burbuja(); // ordena por metodo burbuja
		muestra( ); //muestra el vector ordenado
		System.out.println("\nCambios realizados: "+ cont);
	}
}
