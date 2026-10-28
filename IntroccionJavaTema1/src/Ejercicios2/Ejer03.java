package Ejercicios2;

import java.util.Scanner;

public class Ejer03 {
	
		public static void main (String []args) {
			
			Scanner tec = new Scanner (System.in);
			
			System.out.println("Escribe un numero entero: ");
			int num = tec.nextInt();
			
			System.out.println(num*2);
			System.out.println(num*3);
		}
}
