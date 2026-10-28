package Teoria;

import java.util.Arrays;

public class _07ClasesArrays {
	
	public static void main(String[] args) {
		//Métodos de utilidad en la clase Arrays
		
		// - Devolver un array en forma de String
		int[] v1 = {1,2,3};
		String[] v2 = {"enero", "febrero", "marzo"};
		
		String texto = Arrays.toString(v1);
		System.out.println(texto);

		texto = Arrays.toString(v2).toUpperCase();
		System.out.println(texto);
		
		
		//Ordenar: Ordena el array de menor a mayor
		String [] v3 = {"casa", "hotel", "apartamento"};
		
		Arrays.sort(v3);
		System.out.println(Arrays.toString(v3));
		
		//Comparar el contenido de dos arrays
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a, b));
		
		//Rellenar
		Arrays.fill(a, 3);
		System.out.println(Arrays.toString(a));
		
		
	}

}
