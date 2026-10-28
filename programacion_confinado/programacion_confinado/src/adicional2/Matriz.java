package adicional2;

import java.util.Scanner;
import java.util.Random;

public class Matriz {
	private int filas;
	private int columnas;
	private int[][] m;

	public void solicitarTamanyo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las filas deseadas para la matriz ");
		this.filas = sc.nextInt();
		System.out.println("Introduce las columnas deseadas para la matriz ");
		this.columnas = sc.nextInt();
		m = new int[this.filas][this.columnas];
	}

	public void rellenarMatriz() {
		Random rand = new Random();
		for (int c = 0; c < m.length; c++) {
			for (int f = 0; f < m[c].length; f++) {
				m[c][f] = rand.nextInt((100 - 1) + 1) + 1;
			}
		}
	}

	public void mostrarMatriz() {
		for (int c = 0; c < m.length; c++) {
			for (int f = 0; f < m[c].length; f++) {
				System.out.print(" " + m[c][f] + " ");
			}
			System.out.println();
		}
	}

	public int maximo() {
		int maximo = 0;

		for (int c = 0; c < m.length; c++) {
			for (int f = 0; f < m[c].length; f++) {
				if (maximo < m[f][c])
					maximo = m[f][c];
			}
		}
		return maximo;
	}

	public int minimo() {
		int minimo = this.m[0][0];

		for (int c = 0; c < m.length; c++) {
			for (int f = 0; f < m[c].length; f++) {
				if (m[f][c] < minimo)
					minimo = m[f][c];
			}
		}
		return minimo;
	}

	public void suma(Matriz p) {
		if (filas == p.filas && columnas == p.columnas) {
			for (int c = 0; c < m.length; c++) {
				for (int f = 0; f < m[c].length; f++) {
					m[f][c] += p.m[f][c];
				}
			}
		} else {
			System.out.println("No coinciden en tamaño");
		}
	}

	public void producto(Matriz p) {
		if (filas == p.filas && columnas == p.columnas) {
			if ((filas % 2) == 0 && (columnas % 2) == 0) {
				int[][] multiplicacion = new int[filas][p.columnas];
				if (columnas == p.filas) {
					for (int i = 0; i < filas; i++) {
						for (int j = 0; j < p.columnas; j++) {
							for (int k = 0; k < p.columnas; k++) {
								multiplicacion[i][j] += m[i][k] * p.m[k][j];
							}
						}
					}
				}
				for (int c = 0; c < multiplicacion.length; c++) {
					for (int f = 0; f < multiplicacion[c].length; f++) {
						System.out.print(" " + multiplicacion[c][f] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Deben ser matrices cuadradas");
			}
		} else {
			System.out.println("No coinciden en tamaño");
		}
	}

	public void traspuesta() {
		if ((filas % 2) == 0 && (columnas % 2) == 0) {
			int matrizAdicional[][] = new int[filas][columnas];
			for (int f = 0; f < filas; f++) {
				for (int c = 0; c < columnas; c++) {
					matrizAdicional[f][c] = m[c][f];
				}
			}
			for (int f = 0; f < filas; f++) {
				for (int c = 0; c < columnas; c++) {
					m[f][c] = matrizAdicional[f][c];
				}
			}
		} else {
			System.out.println("Deben ser matrices cuadradas");
		}
	}
}
