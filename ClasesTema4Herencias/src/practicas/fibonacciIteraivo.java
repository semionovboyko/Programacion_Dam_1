package practicas;

import java.util.*;

public class fibonacciIteraivo {
	
	public static void main(String[] args) {
		 
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();  
 
        System.out.print(n1 + ", ");
        System.out.print(n2 + ", ");
 
        for(int i = 0; i<limite-2; i++){
            n2 = n1 + n2;
            n1 = n2 - n1;
            System.out.print(n2 + ", ");
        }
    }

}
