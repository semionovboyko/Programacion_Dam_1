package ejercicios;
import java.util.*;

public class ejercicio1 {
	
	public static void main(String[]args) {
		
		Scanner tec= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = tec.nextInt();
	         
	    int matriz[][]=new int[num][num];
	         
	        //i = filas y j = columnas
	        for(int i=0;i<matriz.length;i++){
	            for(int j=0;j<matriz[0].length;j++){
	                matriz[i][j]=(i*matriz.length)+(j+1);
	                System.out.print(matriz[i][j]+"  ");
	                 
	            }
	            System.out.println("");
	        }
	         
	 }
}