package Recursion;
import java.util.Scanner;

public class recursivo {
	
	public static int recursivo(int i, int j) {
		int elemento;
		if (i == 1 || j == 1 ) //BASE
			return elemento = 1;
		else
			return  elemento = recursivo (i-1,j) + recursivo(i,j-1);
	}
	
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Introduce numero de filas y columnas: ");
		numero = teclado.nextInt();
	
       
        for(int i=1;i<=numero;i++){
            for(int j=1;j<=numero;j++){
                System.out.print(recursivo(i,j)+"\t");
            }
            System.out.println(" ");
        }
         
	}

}
