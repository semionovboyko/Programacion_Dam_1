package Recursion;
import java.io.*; 
import java.util.Scanner; 


public class recursivaFibonacci {
	
	public static int fibonacci(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Introduce cuántos términinos de la serie deseas: ");
		numero = teclado.nextInt();
		for (int i = 0; i < numero; i++)
			System.out.print(fibonacci(i) + "   ");
	}

}
