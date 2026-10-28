package ejercicios;
import java.util.*;

public class Recursivo {
	public static void main(String []args) {
		
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int num = tec.nextInt();
		int resultado = sumaRecursiva(num);
		
		for (int i=num; i>=1; i--) {
			System.out.print(i+" + ");
			if(i == 1) {
				System.out.print(0);
				break;
			}
			
		
		}
			System.out.println( " = "+resultado);
	
		}
		
		public static int sumaRecursiva(int numero) {
			int res;
			
			if(numero ==1 ) {
				return 1;
			}else {
				res = numero + sumaRecursiva(numero-1);
			}
			
			return res;
		}

}
