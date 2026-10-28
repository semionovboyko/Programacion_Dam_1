package Ejercicios2;

import java.util.Scanner;

public class Ejer08 {
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe un radio: ");
		double rad = tec.nextInt();
		
		double vol = (4*Math.PI*Math.pow(rad, 3)/3);
		
		System.out.println("El volumen de la esfera es: "+vol);
	}
}
