package practicas;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejer2_matriz {
	
	static Scanner tec = new Scanner (System.in); 
	
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		String respuesta;
		System.out.println("Rellena la tabla con numeros con numeros");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.println("Fila "+ i + " Columna " + j+ ":");
					matriz[i][j]= tec.nextInt();
				}
			}
		
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.format("%4d", matriz[i][j]);
					System.out.print("  ");
				}
				System.out.println("  ");
			}
			
			int fila = 0, sumaFila=0;
			System.out.println("Introduce una fila para sumarla: ");
			fila = tec.nextInt();
			while(fila > 4) {
				System.out.println("ERROR, vuelve a introducirla");
				fila=tec.nextInt();
			}
			for (int i = fila; i == fila; i++) {
				for (int j = 0; j < 4; j++) {
					sumaFila += matriz[i][j];
				}
			}
			System.out.println("Fila "+fila+" suma en total : "+sumaFila);
			
			int columna = 0, sumaColumna=0;
			System.out.println("Introduce una columna para sumarla: ");
			fila = tec.nextInt();
			while(columna > 4) {
				System.out.println("ERROR, vuelve a introducirla");
				fila=tec.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				for (int j = columna; j == columna; j++) {
					sumaColumna += matriz[i][j];
				}
			}
			System.out.println("Columna "+columna+" suma en total : "+sumaColumna);
			
			int media=0, cont=0, diagonal=0, diagonalInver=0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					media += matriz[i][j];
					cont++;
					if(i==j) {
						diagonal += matriz[i][j];
					}
					if(i+j == 3) {
						diagonalInver += matriz[i][j]; 
					}
				}
			}
			System.out.println("La media es: "+(media)/cont);
			System.out.println("La suma de la diagonal es: "+diagonal);
			System.out.println("La suma de la diagonal invertida es: "+diagonalInver);
	}

}
