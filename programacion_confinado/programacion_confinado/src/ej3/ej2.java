package ej3;

import java.util.Scanner;

public class ej2 {
	static int columna, fila;
	static Scanner sc = new Scanner(System.in);
	static int[][] matriz = new int[4][4];

	public static void mostrarMatriz() {
		for (columna = 0; columna < matriz.length; columna++) {
			for (fila = 0; fila < matriz.length; fila++) {
				System.out.print(" " + matriz[columna][fila] + " ");
			}
			System.out.println();
		}
	}

	public static void rellenarMatriz() {
		for (columna = 0; columna < matriz.length; columna++) {
			for (fila = 0; fila < matriz.length; fila++) {
				System.out.println("Introduce tu número: ");
				matriz[columna][fila] = sc.nextInt();
			}
		}
	}

	public static int sumaFila() {
		System.out.println("Introduce el número de la fila que desees sumar ");
		int entrada = sc.nextInt() - 1;
		int resultado = 0;
		for (int indice = 0; indice < matriz.length; indice++) {
			resultado += matriz[entrada][indice];
		}
		return resultado;
	}

	public static int mostrarSumaDiagonal() {
		int resultado = 0;
		for (int indice = 0; indice < matriz.length; indice++) {
			resultado += matriz[indice][indice];
		}
		return resultado;
	}

	public static int mostrarSumaDiagonalInversa() {
		int resultado = 0;
		int contador = 0;
		for (int indice = matriz.length - 1; indice >= 0; indice--, contador++) {
			resultado += matriz[indice][contador];
		}
		return resultado;
	}

	public static int mostrarMedia() {
		int resultado = 0;
		int contador = 0;
		for (columna = 0; columna < matriz.length; columna++) {
			for (fila = 0; fila < 4; fila++, contador++) {
				resultado += matriz[columna][fila];
			}
		}
		return resultado / contador;
	}

	public static void main(String[] args) {
		rellenarMatriz();
		mostrarMatriz();

		System.out.println(sumaFila());
		System.out.println(mostrarSumaDiagonal());
		System.out.println(mostrarSumaDiagonalInversa());
		System.out.println(mostrarMedia());
	}

}
