package practicas;

import java.util.Scanner;

public class Matriz {
	
	private int fila;
	private int colum;
	private int[][] m;
	Scanner tec = new Scanner (System.in);

	
	
	public void solicitarTamanyo() {
		//Se pide al usuario por teclado los valores número de fila (atributo fila)
		//y número de columnas (atributo colum) y creamos la matriz con esas dimensiones.
		System.out.println("Introduce el numero de fila del vector: ");
		int fila = tec.nextInt();
		System.out.println("Introduce el numero de columna del vector: ");
		int colum = tec.nextInt();
		m = new int[fila][colum];
	}
	
	public void asignarDatos() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <m.length ; j++) {
				m[i][j]=(int) (Math.random()*(100-1)+1);
            }
		}
	}
	
	public void mostrarMatriz() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public int maximo(){
		int max = 0;
		for(int i = 0; i<m.length; i++) {
			for (int j = 0; j <m.length ; j++) {
				if(m[i][j]> max) {
					max = m[i][j];
				}
			}
		}
		return max;	
	}
	
	public int minimo(){
		int min = 0;
		for(int i = 0; i<m.length; i++) {
			for (int j = 0; j <m.length ; j++) {
				if(m[i][j]< min) {
					min = m[i][j];
				}
			}
		}
		return min ;
	}
	
	public void suma(Matriz matriz) {

        if(fila == matriz.fila && colum== matriz.colum){
            for(int i=0;i<m.length;i++){
                for(int j=0;j<m.length;j++){
					m[i][j] +=matriz.m[i][j];
                }
                
            }
            mostrarMatriz();
        }else {
        	System.out.println("No coinciden");
        }
 
	}
	
	public void producto(Matriz matriz) {
		if (fila == matriz.fila && colum == matriz.colum) {
			if ((fila % 2) == 0 && (colum % 2) == 0) {
				int[][] multiplicacion = new int[fila][matriz.colum];
				if (colum == matriz.fila) {
					for (int i = 0; i < fila; i++) {
						for (int j = 0; j < matriz.colum; j++) {
							for (int k = 0; k < matriz.colum; k++) {
								multiplicacion[i][j] += m[i][k] * matriz.m[k][j];
							}
						}
					}
				}
				for (int i = 0; i < multiplicacion.length; i++) {
					for (int j = 0; j < multiplicacion.length; j++) {
						System.out.print(" " + multiplicacion[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Deben ser matrices cuadradas");
			}
		} else {
			System.out.println("No coinciden en tamaño");
		}
	}
	
	public void traspuesta() {
		if ((fila % 2) == 0 && (colum % 2) == 0) {
			int matrizAdicional[][] = new int[fila][colum];
			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < colum; j++) {
					matrizAdicional[i][j] = m[i][j];
				}
			}
			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < colum; j++) {
					m[i][j] = matrizAdicional[i][j];
				}
			}
		} else {
			System.out.println("Deben ser matrices cuadradas");
		}
	}
	
	public static void main(String[]args) {
		
		Matriz mat1 = new Matriz();
		mat1.solicitarTamanyo();
		mat1.asignarDatos();
		mat1.mostrarMatriz();
		
		System.out.println(mat1.maximo());
		System.out.println(mat1.minimo());
		
		Matriz mat2 = new Matriz();
		mat2.solicitarTamanyo();
		mat2.asignarDatos();
		mat2.mostrarMatriz();
		System.out.println(mat2.maximo());
		System.out.println(mat2.minimo());
		
		System.out.println("___________________________");
		
		mat1.suma(mat2);
	}
}
