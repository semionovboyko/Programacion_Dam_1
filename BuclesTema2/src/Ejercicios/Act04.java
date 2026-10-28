package Ejercicios;

import java.util.Scanner;

public class Act04 {
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe tu fecha de nacimiento");
		System.out.print("Dia:");
		int dia = tec.nextInt();
		System.out.print("Mes:");
		int mes = tec.nextInt();
		System.out.print("Anyo:");
		int anyo = tec.nextInt();
		
		int num1= (dia / 10)+(dia % 10);
		
		int  num2;
		if(mes < 10) {
			num2= mes;
		}else {
			num2= (mes/10)+(mes%10);
		}
		
		int num3=(anyo/1000)+((anyo/100)%10)+((anyo%1000)/100)+(anyo%10);
		
		int suerte1 =num1 + num2 + num3; 
		int suerte2 =(suerte1/10)+(suerte1%10);
		
		System.out.println("Tu numero de la suerte es: "+ suerte2);
}


}
