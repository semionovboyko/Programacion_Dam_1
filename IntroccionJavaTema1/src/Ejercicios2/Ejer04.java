package Ejercicios2;

import java.util.Scanner;

public class Ejer04 {
	
		public static void main (String []args) {
				
				Scanner tec = new Scanner (System.in);
				
				System.out.println("Escribe una temperatura: ");
				double tem = tec.nextInt();
				
				double fahrenheit = 32 + (9 * tem /5 );
				
				System.out.println(" Tu temperatura en fahrenheit es: " + fahrenheit);
		}
}
