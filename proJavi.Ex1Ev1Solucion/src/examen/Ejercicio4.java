package examen;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("a: ");
		int a = tec.nextInt();

		System.out.println("b: ");
		int b = tec.nextInt();
		
		for(int num = a ; num <= b; num++){
			if(empiezaComoTermina(num)){
				System.out.println(num);
			}
		}
	}

	public static boolean empiezaComoTermina(int num){
		//Convertimos numero a texto
		String texto = String.valueOf(num);
		//texto = Integer.toString(num);
		//texto = "" + num;
		
		if(texto.charAt(0) == texto.charAt(texto.length()-1)){
			return true;
		} else {
			return false;
		}
		
		
		
	}
}
