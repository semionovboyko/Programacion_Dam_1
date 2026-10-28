package ejercicios;

import java.util.Arrays;

public class propuesto6 {
	
	private static int POS = 1000; // número de posiciones del array 
	private static int LIMITE=1000; // números entre 1 y LIMITE 
	
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
		int c = 0;
		for (int f =m.length-1; f > 989; f--) {
				System.out.println(m[f] + " ");
			
		}
	}
	
	public static void main(String[] args) { 
		int []v = new int[POS];
		getAleatorio(v);
		ordena_burbuja(v);
		muestra(v);

	
	}

}
