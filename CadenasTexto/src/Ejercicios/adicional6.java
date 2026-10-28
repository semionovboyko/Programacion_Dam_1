package Ejercicios;

import java.util.Scanner;

public class adicional6 {
	public static void main (String [ ] args) {

        System.out.println ("Por favor introduzca una cadena por teclado:");
        String texto = "";
        Scanner tec = new Scanner (System.in);
        texto = tec.nextLine();
        int a, e, i, o, u;
        a = e = i = o = u =0;
        
        for (int x=0; x < texto.length(); x++) {
			if(texto.charAt(x) == 'a' || texto.charAt(x) == 'A' ) {
				 a++;
			}else if(texto.charAt(x) == 'e' || texto.charAt(x) == 'E' ) {
				 e++;
			}else if(texto.charAt(x) == 'i' || texto.charAt(x) == 'I' ) {
				 i++;
			}else if(texto.charAt(x) == 'o' || texto.charAt(x) == 'O' ) {
				 o++;
			}else if(texto.charAt(x) == 'u' || texto.charAt(x) == 'U' ) {
				 u++;
			}
        }
        
        System.out.println("No de A's: "+a+ "\nNo de E's: "+e+ "\nNo de I's: "+i+ "\nNo de O's: "+o+ "\nNo de U's: "+u );
	}
	
}
