package ej1;

public class main {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		int contador = 1;
		for(int i = 1; i <= 100; i++ ){
			numeros[i-1] = contador;
			System.out.println(numeros[i-1]);
			contador++;
		}
	}
}
