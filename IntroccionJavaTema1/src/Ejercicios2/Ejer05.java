package Ejercicios2;

import java.util.Scanner;

public class Ejer05 {
	
		public static void main (String []args) {
				
				Scanner tec = new Scanner (System.in);
				
				System.out.println("Escribe un radio: ");
				double rad = tec.nextInt();
				
				double perimetro = 2* Math.PI*rad;
				double area = Math.PI*Math.pow(rad, 2);
			
				System.out.println("Escribe un valor para Y: ");
				int y = tec.nextInt();
		}
}
