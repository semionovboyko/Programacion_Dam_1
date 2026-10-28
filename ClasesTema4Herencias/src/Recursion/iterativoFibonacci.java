package Recursion;
import java.io.*;
import java.util.Scanner; 

public class iterativoFibonacci {
	
	public static long fibonacci(int posicion) {
		int siguiente = 1;
		int actual = 0;
		int temporal = 0;
		
		for (int i = 1; i <= posicion; i++) {
			// Si no quieres imprimirla, comenta la siguiente línea:
			System.out.print(actual + ", ");
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		// Si no quieres imprimirla, comenta la siguiente línea:
		System.out.println(actual);
		return actual;
	}
	
	public static void main (String[]args) {
		
		System.out.println(fibonacci(20));
	}
}
