package Ejercicios2;

import java.util.Scanner;

public class Ejer09 {
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe un valor para la base de un triangulo: ");
		double base = tec.nextInt();
		
		System.out.println("Escribe un valor para la altura de un triangulo: ");
		double alt = tec.nextInt();
		
		double area = (base * alt)/2;
		
		System.out.println("El area del triangulo es: "+ area);
	}
}
