package ej7;

import java.util.Random;
import java.util.Scanner;

public class main {

	static int[] vector = new int[100];
	
	public static void asignarDatos() {
		Random rand = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = rand.nextInt((80 - 10) + 1) + 10;
		}
	}
	
	public static int maximo() {
		int maximo = 0;
		for (int i = 0; i < vector.length; i++) {
			if (maximo < vector[i])
				maximo = vector[i];
		}
		return maximo;
	}

	public static int minimo() {
		int minimo = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < minimo)
				minimo = vector[i];
		}
		return minimo;
	}
	
	public static void mostrar() {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	
	
	public static int mostrarMedia() {
		int resultado = 0;
		int contador = 0;
			for (int fila = 0; fila < 100; fila++, contador++) {
				resultado += vector[fila];
			}
		return resultado / contador;
	}
	
	public static void main(String[] args) {
		
		asignarDatos();
		mostrar();
		System.out.println("");
		System.out.println(maximo());
		System.out.println(minimo());
		System.out.println(mostrarMedia());
		
	}

}
