package Practica;
/*
 * Ejercicio: Realiza un método esCapicua que tome como parámetro un entero y devuelva true si el número es capicua
 * y false en caso contrario. Utiliza wrappers y objetos String. 
 * */
import java.util.Scanner;

public class esCapicua {
	
	public static boolean esCapicua(int dato) {

		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		System.out.println("Dato invertido: " + reverse);
		return i.toString().equals(reverse.toString());
	}

	public static void main(String[] args) { 
		boolean palindromo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un entero para ver si es capicua");
		int dato = entrada.nextInt();
		System.out.println("Dato de entrada:" + dato);
		palindromo = esCapicua(dato);
		if (palindromo)
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
	}

}
