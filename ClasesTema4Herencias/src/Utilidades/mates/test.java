package Utilidades.mates;
import java.util.*;

public class test {
	
	public static void main (String []args) {
		
		Scanner tec= new Scanner (System.in);
		
		int num1, num2;
		System.out.println("Ingrese un numero: ");
		num1 = tec.nextInt();
		System.out.println("Ingrese otro numero");
		num2 = tec.nextInt();
		
		sumar sum = new sumar();
		potenciar pot = new potenciar();
		
		System.out.println(sum.suma(num1, num2));
		System.out.println(pot.potencia(num1, num2));
		
	}

	

}
