package Ejercicios;

import java.util.Scanner;

public class adicional5 {
	
	public static String letras(String texto) {
		String letras = "";
		for (int x=0; x < 3; x++) {
			 letras += texto.charAt(x);
		}	
		return letras.toUpperCase();
		
	}
	
	public static void main (String [ ] args) {
		Scanner tec = new Scanner (System.in);

        System.out.println ("Por favor introduzca nombre:");
        String texto = "";
        texto = tec.nextLine(); 
      
        System.out.println ("Por favor introduzca 1 apellido:");
        String texto1 = "";
        texto1 = tec.nextLine(); 
        
        System.out.println ("Por favor introduzca 2 apellido:");
        String texto2 = "";
        texto2 = tec.nextLine(); 
        
        System.out.println(letras(texto)+letras(texto1)+letras(texto2));
	}

}
