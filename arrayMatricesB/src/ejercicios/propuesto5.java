package ejercicios;

import java.util.Arrays;

public class propuesto5 {
	private static int POS = 5; // número de posiciones del array 
	private static int LIMITE=100; // números entre 1 y LIMITE 
	
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
		System.out.println(Arrays.toString(m));
	}
	

	public static void muestra(int []m) {
		for (int f = 0; f < m.length; f++)
			System.out.print(m[f] + " ");
	}
	
	public static void main(String[] args) { 
		int []v = new int[POS];
		int []a = new int[POS];
		int []ne = new int[v.length + a.length];
		getAleatorio(a);
		getAleatorio(v);
		muestra(a);
		System.out.println("\n");
		muestra(v);
		System.out.println("\n");
		System.arraycopy(v, 0, ne, 0, v.length);
		System.arraycopy(a, 0, ne, v.length, a.length);
		muestra(ne);
		System.out.println("\n");
		ordena_burbuja(ne);
		
	}

}
