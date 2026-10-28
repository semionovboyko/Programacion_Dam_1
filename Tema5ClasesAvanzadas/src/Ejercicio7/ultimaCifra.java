package Ejercicio7;

import java.util.Scanner;

public class ultimaCifra {
	
	
	public static int ultimoDigito(Integer num1) {
		
		int ultimoDigito;

		ultimoDigito = num1%10;
		return ultimoDigito;
		
	}
	 
	
	
	
	public static void main(String[]arg){
		 
		  Scanner tec= new Scanner(System.in);
		  
		  System.out.println("Introduce un número por pantalla: ");
		  String numero1 = tec.next();
		  Integer num1 = Integer.valueOf(numero1);
		  
		  System.out.println("La ultima cifra es: " + ultimoDigito(num1));
		 }
}


