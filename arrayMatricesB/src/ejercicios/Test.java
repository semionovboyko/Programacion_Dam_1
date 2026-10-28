package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	static Scanner tec = new Scanner(System.in);
	private int[] array;

	public void cargar() {
		System.out.println("Introduce el tamaño: ");
		int tamanyo = tec.nextInt();
		array = new int[tamanyo];
		for (int f = 0; f < array.length; f++) {
			array[f] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
	}

	public void burbuja() {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
			}
		}
	}
	
	public void seleccion() {
		int minimo, aux;
		for (int i = 0; i < array.length; i++) {
			minimo = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[minimo]) 
					minimo = j;
				aux = array[minimo];
				array[minimo] = array[i];
				array[i] = aux;
			}
	}
	
	public void insercion() {
		int aux;
		int j;
		for (int i = 1; i <= array.length-1; i++) {
			aux = array[i];
			for (j = i - 1; j >= 0 && array[j] > aux; j--) {
				array[j + 1] = array[j];
				array[j] = aux;
			}
		}
	}
	
	public int busqueda_bin(int dato) {   
		int inicio= 0, fin= array.length-1, med = array.length/2, encontrado=-1; 
	 
		while (inicio <= fin && encontrado == -1) {
			if (array[med] == dato)
				encontrado = med;
			/* mover inicio y fin para dividir el área de búsqueda */ 
			else {
				if (array[med] > dato)
					/* Dato estará del principio a la mitad */ 
					fin = med - 1;
				else
					/* Dato estará de la mitad al final */ 
					inicio = med + 1;
				med = (inicio + fin) / 2;
			}
		}
		return encontrado;
	}

	public void imprimir() {
		for (int f = 0; f < array.length; f++) {
			System.out.print(array[f]+" ");
		}
	}

	public static void main(String[] ar) {
		Test pv = new Test();
		pv.cargar();
		System.out.println("Indica el metodo por el que lo quieres ordenar: B(burbuja) / S(seleccion) /"
				+ " I(insercion)");
		char metodo= tec.next().charAt(0);
		switch(metodo) {
			case 'B': System.out.println("Vector ordenado por método burbuja.");
					  pv.burbuja();
					  pv.imprimir();
					  break;
			case 'S': System.out.println("Vector ordenado por método seleccion.");
					  pv.seleccion();
					  pv.imprimir();
					  break;
			case 'I': System.out.println("Vector ordenado por método insercion.");
					  pv.insercion();
					  pv.imprimir();
					  break;
			default: System.out.println("Letra incorrecta");
		}
		System.out.println("\nIntroduce el numero que quieres buscar: ");
		int numero= tec.nextInt();
		System.out.println(pv.busqueda_bin(numero));
	}

}
