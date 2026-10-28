package Practica;

import java.io.IOException;
import java.util.Scanner;

public class vectoresobjetosstring {
	
	private static String[] lista;
	final static int POS = 10;
	//número de posiciones del array

	public static void muestra() {
		for (int i = 0; i < POS; i++)
			System.out.println("Elemento " + i + " " + lista[i]);
	}

	public static void main(String[] args) throws IOException {
		lista = new String[POS];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < POS; i++) {
			System.out.println("Introduce un nombre: ");
			lista[i] = entrada.next();
		}
		System.out.println("");
		muestra();
		System.out.println("");
	}

}
