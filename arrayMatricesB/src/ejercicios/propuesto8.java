package ejercicios;

import java.util.Arrays;

public class propuesto8 {

	private static int POS = 10; // número de posiciones del array 
	private static int LIMITE=10; // números entre 1 y LIMITE 
	
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
		for (int f =0; f <m.length; f++) {
				System.out.print(m[f] + " ");
		}
	}
	
	public static void busqueda(int []m) {  
		int []existe = new int [11];
		for( int i : m) {
			existe[i]=1;
		}
		
		System.out.println(Arrays.toString(existe));
		System.out.println("Numeros que faltan: ");
		for(int i = 1; i <existe.length;i++) {
			if(existe[i]==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static void main(String[] args) { 
		int []v = new int[POS];
		
		getAleatorio(v);
		ordena_burbuja(v);
		muestra(v);
		System.out.println("\n");
		busqueda(v);
	
	}

}
