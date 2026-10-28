package Ejercicios2;

import java.util.Scanner;

public class Act7 {
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe valor: ");
		int c = tec.nextInt();
		
		
		System.out.println(c >= 0 ? "positivo" : "negativo");
		System.out.println(c%2 == 0 ? "par" : "impar");
		System.out.println(c%5 == 0 ? "es multiplo de 5" :"no es multipolo de 5");
		System.out.println(c%10 == 0 ? "es multiplo de 10" :"no es multipolo de 10");
		System.out.println(c >=100 ? "es menor que 100" : "es mayor que 100");
		
		
		}

}
