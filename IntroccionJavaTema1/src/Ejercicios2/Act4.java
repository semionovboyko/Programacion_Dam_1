package Ejercicios2;

import java.util.Scanner;

public class Act4 {
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe un valor para a: ");
		int a = tec.nextInt();
		System.out.println("Escribe un valor para b: ");
		int b = tec.nextInt();	
		System.out.println("Escribe un valor para c: ");
		int c = tec.nextInt();
		System.out.println("Escribe un valor para d: ");
		int d = tec.nextInt();
		
		int tmp;
		tmp = a;
		a = d;
		d = b;
		b = c;
		c = tmp;
		
		
		
		System.out.println("a es: "+a);
		System.out.println("b es: "+b);
		System.out.println("c es: "+c);
		System.out.println("d es: "+d);
 }

}
