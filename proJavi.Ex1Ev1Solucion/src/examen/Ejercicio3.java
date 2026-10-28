package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numeroAdivinar = (int) (1 + Math.random() * 100); //entre 1 y 100
//		int numeroAdivinar = (int) (Math.random() * 101); //entre 0 y 100
		
		System.out.println("(El numero a adivinar es " + numeroAdivinar + ")");
		int intentos = 0;
		int num;
		do {
			System.out.print("Intento " + (intentos + 1) + ": ");
			num = tec.nextInt();
			if(num == numeroAdivinar){
				System.out.println("Acertaste!!");
			} else if(num < numeroAdivinar) {
				System.out.println("Te has quedado corto");
			} else {
				System.out.println("Te has pasado");
			}
			intentos ++;
		
		} while(num != numeroAdivinar && intentos < 10);
		
		if(intentos == 10 && num != numeroAdivinar){
			System.out.println("Intentos agotados");
		}
	}

}
