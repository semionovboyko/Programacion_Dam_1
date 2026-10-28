package Ejercicio4;

import java.util.List;
import java.util.Scanner;

import Ejercicio3.Alumno;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/**
 * Se tiene la información de una personas.
 * Esta información se tiene que registrar en un ​ArrayList, buscar una persona dado el ​dni,               eliminar una persona dado el​dni ​ , ordenar por​apellidos y mostrar todas las personas.
 * Hacer un menú para realizar lo que se pide.              
 * @author Alexe
 *
 */
public class Test {
	
	  static Scanner tec = new Scanner(System.in);
	  
	  public static ArrayList<Persona> persona = new ArrayList<Persona>();
	  
	  /**
	   * Metodo para mostrar los valores de la ArrayList.
	   */
	  public static void printArrayListPersona() {
			Iterator<Persona> itrArrayList = persona.iterator();
			int posicion = 1;
			while (itrArrayList.hasNext()) {
				System.out.println(itrArrayList.next().toString());
				posicion++;
			}
		}
	  
	  /**
	   * Metodo para buscar el dni introducido por parametro en la ArrayList
	   * Se repetira tantas veces como sea necesario hasta introducir el dni correcto.
	   * @param persona -> ArrayList de la informacion de las personas
	   * @param dni -> Dni de la persona a buscar
	   */
	  public static void devuelvePersona(){
		  System.out.println("Introduce el dni que desea buscar: ");
		  boolean encontrado = false;
		  do {
			  int dni= tec.nextInt();
			  for(Persona list: persona){
			    	 if(list.getDni()==dni) {
			    		System.out.println("Esta en la posicion: "+persona.indexOf(list));  
			    		encontrado = true;
			    	 }
			  }
		  }
		  while(!encontrado);  
	  }
	  /**
	   * Metodo para eliminar  el dni que deseas introducido por el teclado.
	   */
	  public static void eliminar() {
		  int pos = 0;
		  System.out.println("Introduce el dni para eliminar la informacion: ");
		  int dni = tec.nextInt();
		  	for(Persona list: persona){
		    	 if(list.getDni()==dni) {
		    		 pos = persona.indexOf(list);  
		    	 }
		  }
		  persona.remove(pos);
	  }
	  
	  /**
	   	  * Metodo para ordenar los apellidos por orden alfabetico. 
		  * Sobreescritura del método "compare" de la clase Comparator 
		  * (implementa la interfaz Comparator y llamar al método "sort" de la clase collections
		  */
	  public static void ordenarApellido() {
		  Collections.sort(persona, new Comparator<Persona>() {
				@Override
				public int compare(Persona p1, Persona p2) {
					return new String(p1.getApellido()).compareTo(new String(p2.getApellido()));
				}
			});
		  //Llamada al metodo para imprimir la lista ordenada.
		  printArrayListPersona();
	  }
	  
	public static void main(String[]args) {
		 Persona p1 = new Persona(222,"Gonzo","Alex",'H',23,80.5);
		 Persona p2 = new Persona(111,"Sanchez","Marta",'M',45,70.4);
		 Persona p3 = new Persona(333,"Hidalgo","Javi",'H',23,84.00);
		 Persona p4 = new Persona(444,"Gonzalo","Victor",'H',56,76.8);
		 Persona p5 = new Persona(666,"Suarez","Angel",'H',12,45.5);
		 
		 persona.add(p1);
		 persona.add(p2);
		 persona.add(p3);
		 persona.add(p4);
		 persona.add(p5);
		
		 boolean exit = false;
			while(!exit) {
				System.out.println("ACCIONES");
				System.out.println("[1] Mostrar la informacion ");
				System.out.println("[2] Buscar dni ");
				System.out.println("[3] Eliminar informacion  ");
				System.out.println("[4] Orden alfabetico apellido ");
				System.out.println("[5] Salir ");
				System.out.print("Introduzca accion (1-5): ");
				int opcion = tec.nextInt();
		
				switch(opcion) {
				case 1:
					printArrayListPersona();
					break;
				case 2:
					devuelvePersona();
					break;
				case 3:
					eliminar();
					break;
				case 4:
					ordenarApellido();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Opción mal introducida");
					break;
			}
				}
		
	  }

}
