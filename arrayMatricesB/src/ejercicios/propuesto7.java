package ejercicios;

import java.util.Arrays;

public class propuesto7 {
	
	private static int POS = 20; // número de posiciones del array 
	private static int LIMITE=5; // números entre 1 y LIMITE 
	
	public static void getAleatorio(int[]m) {
		for (int f = 0; f < POS; f++)
			m[f] = (int)(Math.random()*LIMITE+1); 
		
		}

	public static void ordena_burbuja(int []m) {
		for (int i = 0; i < m.length - 1; i++)
			for (int j = m.length - 1; j > i; j--)
				if (m[j] < m[j - 1]) {
					int aux = m[j];
					m[j] = m[j - 1];
					m[j - 1] = aux;
				}
	}
	
	public static void muestra(int []m) {
		for (int i =0;i<m.length; i++) {
				System.out.print(m[i] + " ");
		}
	}
	
	 public static void mayor(int m[]){
		    
		 int []aux = new int [6];
			for( int i : m) {
				aux[i] +=1;
			}
			
			System.out.println(Arrays.toString(aux));

	 }
	 
	 public static void menor(int lista[]){
		 int menor = 1000;
		 int cont = 0;
		 for(int i=0;i<lista.length;i++)
	        	if(lista[i] < menor)
	        		menor = lista[i];
	     
	     for(int i=0;i<lista.length;i++)
	        	if(menor == lista[i])
	        		cont++;
	        	
	     System.out.println("El numero menor es: "+menor+ " y se repite "+ cont);
	         
	 }
	
	public static void main(String[] args) { 
		int []v = new int[POS];
		
		getAleatorio(v);
		ordena_burbuja(v);
		muestra(v);
		System.out.println("\n");
		mayor(v);
	
	
	}

}
