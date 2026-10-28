package practica;

import java.util.Arrays;

public class Ordenacocktail {
	private static int[] lista = {45, 3, 1, 44, 23, 28};

	public static void ordena_cocktail(int array[]) {
		boolean swp = true;
		int i = 0, j = array.length - 1;
		while (i < j) {
			System.out.println("ESTOY EN i "+ i+ " j"+ j);
			for (int k = i; k < j; k++)
				if (array[k] > array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
					swp = true;
					System.out.println("k en i "+ k);
					System.out.println(Arrays.toString(lista));
				}
			j--;
			if (swp) {
				System.out.println("ESTOY EN j "+ j);
				swp = false;
				for (int k = j; k > i; k--) {
					System.out.println(" LA J VALE "+ j);
					System.out.println(swp);
					System.out.println(" LA POSICION DE K  "+ k);
					if (array[k] < array[k - 1]) {
						System.out.println(swp);
						System.out.println(" k vale "+ k);
						int temp = array[k];
						array[k] = array[k - 1];
						array[k - 1] = temp;
						swp = true;
						System.out.println("ehhhhh a pasado por aqui!!!");
						System.out.println("k en j "+ k);
						System.out.println(Arrays.toString(lista));
						System.out.println(swp);
					}
				}
			}
			i++;
		}
	}

	public static void muestra() {
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
	}

	public static void main(String[] args) {
	
		ordena_cocktail(lista);       
	
	}

}
