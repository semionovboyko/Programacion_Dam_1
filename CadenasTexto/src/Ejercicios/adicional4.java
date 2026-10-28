package Ejercicios;

import java.util.Scanner;

public class adicional4 {
	
	public static void main (String [ ] args) {
		Scanner tec = new Scanner (System.in);

        System.out.println ("Por favor introduzca una cadena por teclado:");
        String texto = "";
        texto = tec.nextLine(); 
      
        System.out.println ("Por favor introduzca otra cadena por teclado:");
        String texto1 = "";
        texto1 = tec.nextLine(); 
        
        if (texto.equalsIgnoreCase(texto1)){
        System.out.println("Iguales");
        }else{
        System.out.println("No iguales");
        }
	}
}
