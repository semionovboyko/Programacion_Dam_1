package Ejercicios;

import java.util.Scanner;

public class adicional3 {
	
	public static void main (String [ ] args) {

        System.out.println ("Por favor introduzca una cadena por teclado:");
        String texto = "";
        Scanner tec = new Scanner (System.in);
        texto = tec.nextLine(); 
        String resulta = texto.replace(' ','\n');
        System.out.println(resulta.toString());
        
    }
}
