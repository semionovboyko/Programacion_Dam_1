package Ejercicios2;

import java.util.Scanner;

public class Ejer06 {
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe una velocidad en km/h: ");
		double vel = tec.nextInt();
		
		double metrossegundo = vel * 5 / 18;
		
		System.out.println("Equivalen a " + metrossegundo + " m/s");
	}
}
