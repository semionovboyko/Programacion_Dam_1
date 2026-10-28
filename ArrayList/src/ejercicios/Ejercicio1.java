package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Clase Ejercicio 1 
 * Calcula la suma y la media aritmética de los valores contenidos en un ArrayList.
 * @author Alexe
 */
public class Ejercicio1 {
	
	static Scanner tec = new Scanner (System.in);
	static ArrayList<Integer> numeros = new ArrayList<Integer>();
	static Integer num;
	/**
	 * Metodo para introduccir los numeros que deseas por el teclado
	 * Para no introducir mas numeros tecle -99
	 * @return numeros -> La ArrayList con todos los numeros introducidos
	 */
	public static ArrayList<Integer> leerValores() {
		System.out.println("Introduce un numero: ");
		do {
			num = tec.nextInt();
			if(num !=-99)
				numeros.add(num);
		}while(num != -99);
		
		return numeros;
	}
	/**
	 * Metodo para sumar todos los valores que hay en la ArrayList
	 * @param numeros -> ArrayList donde estan todos los numeros introducidos.
	 *   por el teclado
	 * @return suma -> la suma de todos los numeros de la ArrayList
	 */
	public static int calcularSuma(ArrayList<Integer> numeros) {
		int suma=0;
		Iterator it = numeros.iterator();
		while(it.hasNext()) {
			suma += (Integer)it.next();
		}
		return suma;
	}
	/**
	 * Metodo con varias funciones:
	 * 1->Muestra todos nuestros numeros de la ArrayList.
	 * 2->La suma de todos estos.
	 * 3->La media de la suma.
	 * 4->Todos los numeros de la ArrayList que son mayores a la media,
	 * 		si no hubiera ninguno imprime que no hay.
	 * @param numeros -> ArrayList donde estan todos los numeros introducidos
	 */
	public static void mostrarResultado(ArrayList<Integer> numeros) {
		
		System.out.println("Los numeros son:\n"+ leerValores());
		
		System.out.println("\nLa suma de los numeros es "+calcularSuma(numeros));
		System.out.println("La media es "+calcularSuma(numeros)/2);
		
		System.out.println("Los numeros mayores a la media son: ");
		int cont = 0;
		for(int i = 0;i<numeros.size();i++){
			if(numeros.get(i)>calcularSuma(numeros)/2) {
				System.out.println(numeros.get(i));
				cont ++;
			}
		}
		if(cont == 0)
			System.out.println("Lo SIENTO no hay numeros mayores");
	}
	
	public static void main(String []args) {
		mostrarResultado(numeros);	
	}

}
