package Ejercicios;

import java.util.Arrays;
import java.util.StringTokenizer;

public class resuelto8 {
	
	//Declara y crea una cadena ​ StringTokenizer en función de ​ cad1. Muestra sus  
	//elementos por pantalla utilizando un while.​

	public static void main(String[] args) {
		StringTokenizer notas = new StringTokenizer("JuanCarlos\n8.5\nAndrés\n4.9\nPedro\n3.8\nJuan\n6.3", "\n");
		
		
		String[]nombre = new String[notas.countTokens()/2];
		double[]nota = new double[notas.countTokens()/2];
		int i=0;
		
			while (notas.hasMoreTokens()) {
				nombre[i]= notas.nextToken();
				String str=notas.nextToken();
				nota[i]=Double.valueOf(str).doubleValue();
				i++;
			}
			
		System.out.println(Arrays.toString(nombre));
		System.out.println(Arrays.toString(nota));
	}	 
}

