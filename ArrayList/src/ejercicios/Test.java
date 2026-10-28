package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import Ejercicio3.Alumno;

/**
 * Clase Test contiene todos los metodos para poder modificar una ArrayList.
 * @author Alexe
 *
 */
public class Test {
	static Scanner tec = new Scanner(System.in);
	
	/**
	 * Metodo para mostrar la ArrayList.
	 * @param a -> ArrayList que se desea mostrar
	 */
	public static void mostrar(ArrayList<?> a) {
		for (int i = 0; i < a.size(); i++) {
		    System.out.println(a.get(i));
		}
		
		// OTROS METODOS DE BUSQUEDA
		
		/*--- Foreach----
		 * for(Integer i: a){      
		 *       System.out.println(i); 
		 * }
		 */
		
		/*--- Iterator----
		 * Iterator it = lista.iterator(); 
		 * while(it.hasNext())           
		 * 		 System.out.println(it.next());
		 */	
	}
	
	/**
	 * Metodo para invertir la lista del parametro
	 * @param b ArrayList que se desea modificar
	 * @return newArray -> nueva lista ya modificada
	 */
	public static ArrayList reverso(ArrayList b) {
		
		ArrayList newArray = new ArrayList<>();
		 for (int i = b.size() - 1; i >= 0; i--) { 
			 newArray.add(b.get(i));	 
		 }
		 return newArray;
	}
	
	public static void main(String []args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Alex");
		names.add("Pepe");
		names.add("Javi");
		names.add("Marc");

		mostrar(names);
		System.out.println("____________________");
		names.clear();
		
		names.add("Ann");
		names.add("Ann");
		names.add("Ann");
		names.add("Ann");
		mostrar(names);
		System.out.println("numero de elementos"+names.size());//Imprime le tamaño de la lista
		
		System.out.println(names.contains("Alex"));//Busca si esta ese elemento
		System.out.println(names.indexOf("Ann"));//Devuelve la posicion de ese elemento
		
		System.out.println(reverso(names));
		
		//Copia de la lista mediante copiando una referencia
		ArrayList<String> friends = names;
		friends.add("Harry");
		
		mostrar(names);
		System.out.println("____________________");
		
		//Copia de la lista mediante el constructor de copia
		ArrayList<String>newNames=new ArrayList<String>(friends); 
		//mostrar(newNames);
		
		//Lista con otro tipo de dato: -Integer-
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(0,444); //Inserta el valor 444 en la posicion 0
		numeros.add(1,333);
		numeros.add(2,888);
		numeros.add(3,555);
		
		numeros.remove(0);//Elimina el valor que se encuentre en esa posicion
		numeros.set(0,777);//Intercambia el valor de la posicion 2 por el 777
		mostrar(numeros);
		
		System.out.println(reverso(numeros));
	}

	
}
