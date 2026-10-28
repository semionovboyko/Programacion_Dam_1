package practica;

import java.util.Arrays;

public class coctail {

	private static int[] lista = {28, 6, 12, 14, 34, 8};

	public static void ordena_cocktail(int array[]) {
		int i = 0, j = array.length - 1;
		while (i < j) {
			System.out.println("i "+i+ " j "+ j);
			for (int k = i; k < j; k++)
				if (array[k] > array[k + 1]) {
					System.out.println("k de i "+ k);
					System.out.println(Arrays.toString(lista));
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
				}
			j--;
			System.out.println("valor j "+j);
			for (int k = j; k > i; k--)
				if (array[k] < array[k - 1]) {
					
					System.out.println("k de j "+ k);
					System.out.println(Arrays.toString(lista));
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;
				}
			i++;
		}
	}

	public static void muestra() {
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
	}

	public static void main(String[] args) {
	
		System.out.println("Vector aleatorio.");
		muestra();
		System.out.println("\n\nVector ordenado por método cocktail sort.");
		ordena_cocktail(lista);       
		muestra( );         
		System.out.println(" ");
	}
}
