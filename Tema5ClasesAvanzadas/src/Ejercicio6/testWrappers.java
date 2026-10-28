package Ejercicio6;

import java.util.Scanner;

public class testWrappers {
	
	public static void main(String []args) {
		
		int  suma, multiplicacion, division, modulo;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		String numero1 = tec.next();
		Integer num1 = Integer.valueOf(numero1);
		
		System.out.println("Introduce otro numero: ");
		String numero2 = tec.next();
		Integer num2 = Integer.valueOf(numero2);
		
		suma = num1 + num2;
		System.out.println ("Resultado suma : "+suma);
		
		multiplicacion = num1 * num2;
		System.out.println ("Resultado multiplicacion: "+multiplicacion);
		

		
		try{
			 modulo = num1 % num2;
			 System.out.println ("Resultado modulo : "+modulo);
	         division = num1/num2;
	         System.out.println ("Resultado division: "+division);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("EL SEGUNDO NUMERO NO PUEDE SER CERO TANTO PARA LA DIVISION COMO PARA EL MODULO");
	      }
	}

}
