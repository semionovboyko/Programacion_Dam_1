package Ejercicios2;

import java.util.Scanner;

public class Ejer07 {
	

	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe la longitud del cateto A: ");
		double a = tec.nextInt();
		System.out.println("Escribe la longitud del cateto B: ");
		double b = tec.nextInt();
		
		double pitagoras1 = (Math.pow(a, 2)+Math.pow(b, 2));
		double pitagoras2 = Math.sqrt(pitagoras1);
		
		System.out.println("La longitud de la hipotenusa es: "+ pitagoras2);
	}
	
}
