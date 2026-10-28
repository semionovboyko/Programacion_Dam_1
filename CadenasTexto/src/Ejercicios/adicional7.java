package Ejercicios;

import java.util.Scanner;

public class adicional7 {
	public static void main (String [ ] args) {

        System.out.println ("Por favor introduzca una cadena por teclado:");
        String texto = "";
        Scanner tec = new Scanner (System.in);
        texto = tec.nextLine(); 
        String texto1 , texto2;
        texto1 = texto2 = "";
        
        for (int x=0; x < texto.length(); x++) {
        	  if (texto.charAt(x) != ' ')
        	    texto1 += texto.charAt(x);
        	}
        for (int x=texto1.length()-1; x >= 0; x--) {
        		texto2 += texto1.charAt(x);
        }
        
        if (texto1.equalsIgnoreCase(texto2)){
        	System.out.println("Es un texto palíndromo ");
        }else{
        	System.out.println("No es un texto palíndromo ");
        }
	}
}
