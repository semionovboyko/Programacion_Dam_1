package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Ejercicio3.Alumno;

/**
 * Programa que usa un ​ArrayList de números. (El ejercicio pedia numeros reales pero pienso
 * que definir el tipo Integer o Double no influye en el programa).
 * El programa muestra un menú donde el usuario elige la acción
 * 	a realizar sobre el ​ArrayList. ​ 
 * @author Alexe
 *
 */
public class Ejercicio2 {
	static Scanner tec = new Scanner (System.in);
	static ArrayList<Integer> array = new ArrayList<>();
	/**
	 * Metodo para introducir los numeros por teclado que guardara en la ArrayList
	 * tecla 0 para no introducir mas numeros.
	 */
	public static void agregar(){	
		boolean seguir = false;
		
		System.out.println("Si no quiere introducir mas numeros escriba 0 ");
		System.out.println("Agregar un número: ");
		while(!seguir) {
		      Integer num=tec.nextInt();
		      if(num == 0) { 
		    	  seguir = true;
		      }else {
				   array.add(num);
		      }
		  }
		
	}
	/**
	 * Metodo para imprimir la posicion del numero que el usuario desee.
	 * Si el numero deseado no se encuentra en la Array imprimira "no encontrado".
	 * Este metodo esta diseñado para buscar todos los numeros repetidos que esten en la 
	 * lista.
	 */
	public static void buscar(){
		ArrayList<Integer> pos = new ArrayList<>();
		int cont = 0;
		
		System.out.println("Introduce el numero buscado: ");
		Integer num = tec.nextInt();
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i)==num) {
				pos.add(i);
				cont ++;
			}
		}
		if(cont !=0) {
			System.out.println("Esta en la posicion: \n" + pos);
		}else
			System.out.println("El numero que estas buscando no esta");
			
	}
	
	/**
	 * Metodo para modificar el numero que el usuario desee introducido por teclado.
	 * Si el numero deseado no se encuentra en la Array imprimira "no encontrado".
	 * Este metodo esta diseñado para buscar todos los numeros repetidos que esten en la 
	 * lista y cambiarlos por el del usuario.
	 */
	public static void modificar(){
		
		System.out.println("Introduzca numero a cambiar: ");
			int viejoNumero = tec.nextInt();
			if(array.contains(viejoNumero)) {
				System.out.println("Introduzca num: ");
				Integer nuevoNum = tec.nextInt();
				for (int i = 0; i < array.size(); i++) {
					if(array.get(i) == viejoNumero) {
						array.set(i,nuevoNum);
					}
				}
			}else {
				System.out.println("NUMERO NO ENCONTRADO");
			}
			
	}
	/**
	 * Metodo para eliminar el numero que el usuario desee introducido por teclado.
	 * Este metodo esta diseñado para buscar todos los numeros repetidos que esten en la 
	 * lista y eliminarlos por el del usuario.
	 */
	public static void eliminar(){
		System.out.println("Que numero deseas eliminar: ");
		Integer num=tec.nextInt();
		while(array.contains(num))
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i) == num) 
				array.remove(num);	
		}	
	}
	/**
	 * Metodo para insertar un nuevo numero en la lista.
	 * Pedira el nuevo numero al usuario y luego la posicion en la que desea insertar el 
	 * numero. Dara error si la posicion es menor que el primer numero o si la posicion es
	 * excesiva
	 */
	public static void insertarElem() {
		System.out.println("Introduzca numero para insertar: ");
		Integer num = tec.nextInt();
		System.out.println("Introduzca la posicion: ");
		int pos = tec.nextInt();
		if(pos>=0 && pos<=array.size()) {
			array.add(pos,num);
		}else {
			System.out.println("Error posicion");
		}
	}
	
	/**
	 * Metodo para mostrar la lista.
	 * Tambien mostrara imprimiendo "Lista vacia" si no hay ningun numero introducido.
	 */
	public static void mostrar() {
		if(array.size() == 0) {
			System.out.println("--LISTA VACIA--");
		}else {
			System.out.println("Los numeros son: ");
			for (int i = 0; i < array.size(); i++) {
		       System.out.print(array.get(i)+" ");
			}
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		boolean exit = false;
		while(!exit) {
			System.out.println("ACCIONES");
			System.out.println("[1] Agregar elemento ");
			System.out.println("[2] Buscar elemento ");
			System.out.println("[3] Modificar elemento  ");
			System.out.println("[4] Eliminar elemento ");
			System.out.println("[5] Insertar elemento ");
			System.out.println("[6] Mostrar elemento ");
			System.out.println("[7] Orden ascedente ");
			System.out.println("[8] Orden descendente ");
			System.out.println("[9] Salir ");
			System.out.print("Introduzca accion (1-9): ");
			int opcion = tec.nextInt();

			switch(opcion) {
				case 1:
					agregar();
					break;
				case 2:
					buscar();
					break;
				case 3:
					modificar();				
					break;
				case 4:
					eliminar();
					break;
				case 5:
					insertarElem();
					break;
				case 6:
					mostrar();
					break;
				case 7:
					/*Esto hace que los numeros de la lista se ordenen de menor a mayor.
					 *Como las Collectiones ya tiene sus propios metodos incorporados
					 *pienso que seria una tonteria sacarlo.
					 */
					Collections.sort(array);
					mostrar();
					break;
				case 8:
					/*Esto hace que los numeros de la lista se ordenen de mayor a menor.
					 *Como las Collectiones ya tiene sus propios metodos incorporados
					 *pienso que seria una tonteria sacarlo.
					 */
					Comparator<Integer> comparador = Collections.reverseOrder();
					Collections.sort(array,comparador);
					mostrar();
					break;
				case 9:
					exit = true;
					break;
				default:
					System.out.println("Opción mal introducida");
					break;
			}
		}
	
	}

}
