package Practica;

/*
 * Realiza un programa que muestre por pantalla los dos primeros argumentos
 * tomados desde la línea de comandos. (Para ejecutarlo, debéis ir a la línea 
 * de comandos en la carpeta bin que esté muestraArgs.class
 * y poner java muestraArgs paco luis pepe y mostrará “paco luis pepe”) 
 * */

public class muestraArgs {
	
	public static void main (String[] args) {
		for (String s: args) 
			System.out.println(s);   
		}

}
