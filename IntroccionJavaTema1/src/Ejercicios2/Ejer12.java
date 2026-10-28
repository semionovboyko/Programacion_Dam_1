package Ejercicios2;

import java.util.Scanner;

public class Ejer12 {
		public static void main (String []args) {
				
				Scanner tec = new Scanner (System.in);
				
				System.out.println("Escribe un numero de 5 cifras: ");
				int num = tec.nextInt();
				
				int num1= num / 10000;
				int num2= num / 1000;
				int num3= num % 1000;
				int num4= num / 10;
				int num5= num % 10;
				
				int num22 = num2 % 10;
				int num33 = num3 /100;
				int num44 = num4 % 10;

				System.out.println(num1);
				System.out.println(num22);
				System.out.println(num33);
				System.out.println(num44);
				System.out.println(num5);
				
				System.out.println("_______________________________________");
				
				System.out.println(num5);
				System.out.println(num44);
				System.out.println(num33);
				System.out.println(num22);
				System.out.println(num1);
		}

}
