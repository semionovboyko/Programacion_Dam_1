package ejercicios;

import java.util.Scanner;

public class matriz {

	    public static Scanner EN = new Scanner(System.in);
	    public static int i,j;
	    public static void main(String[] args) {
	        int M, N;
	        System.out.println("inserte la cantidad de filas");
	        M = EN.nextInt();//CON SCANNER JAVA  LEEMOS
	        System.out.println("inserte la cantidad de columnas");
	        N = EN.nextInt();//CON SCANNER JAVA  LEEMOS

	        System.out.println("inserte los datos");

	        int mat[][] = new int[M][N];//DECLARAMOS E INICIALIZAMOS UNA MATRIZ EN JAVA

	        llenar(mat);//LLAMAMOS AL METODO LLENAR Y LE PASAMOS UNA MATRIZ EN JAVA
	System.out.println("La Matriz queda asi!!");

	        mostrar(mat);//LLAMAMOS AL METODO MOSTRAR Y LE PASAMOS UNA MATRIZ
	    } 
	//EL METODO EN JAVA PARA LLENAR
	    private static void llenar(int[][] mat) {
	       for ( i = 0; i < mat.length; i++) {
	            for ( j = 0; j < mat.length; j++) {
	                mat[i][j] = EN.nextInt();//EL OBJETO DE TIPO SCANNER LEE
	            }
	        }
	    }
	//EL METODO EN JAVA PARA MOSTRAR
	    private static void mostrar(int[][] mat) {
	        for ( i = 0; i < mat.length; i++) {
	            for ( j = 0; j < mat.length; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }   
	}


