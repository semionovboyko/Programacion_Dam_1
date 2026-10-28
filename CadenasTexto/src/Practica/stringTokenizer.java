package Practica;

import java.util.StringTokenizer;

public class stringTokenizer {
	
	public static void main(String[]args) {
		
		StringTokenizer str;
		str = new StringTokenizer("UNO DOS TRES JUAN PERICO ANDRES");
		System.out.println("La cadena str tiene "+str.countTokens()+" elementos");
		while( str.hasMoreTokens() )
			System.out.println(str.nextToken());
	}
}
