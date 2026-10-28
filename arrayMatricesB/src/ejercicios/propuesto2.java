package ejercicios;

import java.util.Arrays;

public class propuesto2 {
	private static int POS = 10; // número de posiciones del array 
	private static int LIMITE=10; // números entre 1 y LIMITE 
	
	
	public static void getAleatorio(int[]m) {
		for (int f = 0; f < POS; f++)
			m[f] = (int)(Math.random()*LIMITE+1); 
		
		}

	public static void ordena_burbuja(int []m, int[]n) {
		for (int i = 0; i < m.length - 1; i++)
			for (int j = 0; i <= m.length - 2; j++)
				if (m[j]<m[j+1]) {
					int aux = m[j];
					n[j] = m[j + 1];
					n[j + 1] = aux;
				}
		System.out.println(Arrays.toString(n));
	}
	
	public static void muestra(int []m) {
		for (int f = 0; f < m.length; f++)
			System.out.print(m[f] + " ");
	}
	
	public static void main(String[] args) { 
		int []v = new int[POS];
		int []a = new int[POS];
		getAleatorio(v);
		muestra(v);
		System.out.println("\n");
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
	}

}
