package adicional1;

import java.util.Random;
import java.util.Scanner;

public class Vector {
	private int longitud;
	private int[] v;

	public void solicitarTamanyo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud deseada para el vector ");
		this.longitud = sc.nextInt();
		v = new int[this.longitud];
		sc.close();
	}

	public void asignarDatos() {
		Random rand = new Random();
		for (int i = 0; i < this.longitud; i++) {
			v[i] = rand.nextInt((100 - 1) + 1) + 1;
		}
	}

	public int maximo() {
		int maximo = 0;
		for (int i = 0; i < this.longitud; i++) {
			if (maximo < v[i])
				maximo = v[i];

		}
		return maximo;
	}

	public int minimo() {
		int minimo = this.v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] < minimo)
				minimo = v[i];
		}
		return minimo;
	}

	public void insertar(int posicion, int numero) {
		int x = 0;
		int y = 0;
		for (int i = posicion; i < this.longitud; i++) {
			x = v[i];
			v[i] = y;
			y = x;
		}
		v[posicion] = numero;
	}

	public void mostrar() {
		for (int i = 0; i < this.longitud; i++) {
			System.out.println(v[i]);
		}
	}

}
