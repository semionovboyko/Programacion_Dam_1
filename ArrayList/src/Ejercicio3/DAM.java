package Ejercicio3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Programa que guarde en un​ArrayList los nombres y su nota en el examen de​ Programación     
 * de los alumnos de ​1DAM. Estos datos se introducirán por teclado, para luego mostrarlos
 * ordenados alfabéticamente y, posteriormente, por nota. 
 * @author Alexe
 *
 */
public class DAM {
	  static Scanner tec = new Scanner(System.in);
	  
	  private static ArrayList<Alumno> programacion = new ArrayList<>();
	  	  
	  /**
	   * Metodo para mostrar a los alumnos y su nota
	   */
	  private static void printArrayListAlumno() {
			Iterator<Alumno> itrArrayList = programacion .iterator();
			int posicion = 1;
			while (itrArrayList.hasNext()) {
				System.out.println("Alumno = " + itrArrayList.next().toString());
				posicion++;
			}
		}
	  
	  public static void main(String[]args) {
		  
		//Para introducir a los alumnos y sus notas, para no introducir mas, teclear no.
		boolean seguir = false;
		System.out.println("Si no quiere introducir nombre escriba no ");
		 while(!seguir) {
		      System.out.println("nombre: ");
		      String nom=tec.next();
		      if(nom.equals("no")) { 
		    	  seguir = true;
		      }else {
		    	   System.out.println("nota: ");
				   double not=tec.nextDouble();
				   programacion.add(new Alumno(nom, not));
		      }
		  }
		  
		 /**
		  * Sobreescritura del método "compare" de la clase Comparator 
		  * (implementa la interfaz Comparator y llamar al método "sort" de la clase collections
		  * Este metodo Ordena los nombre por orden alfabetico.
		  */
		  Collections.sort(programacion, new Comparator<Alumno>() {
				@Override
				public int compare(Alumno p1, Alumno p2) {
					return new String(p1.getNombre()).compareTo(new String( p2.getNombre()));
				}
			});
		  
		    //Llamada al metodo para imprimir la ArrayList
			printArrayListAlumno();
			System.out.println("_____________________________");
		  
		 /**
		  * Sobreescritura del método "compare" de la clase Comparator 
		  * (implementa la interfaz Comparator y llamar al método "sort" de la clase collections
		  * Este metodo Ordena las notas de menor a mayor.
		  */
			Collections.sort(programacion, new Comparator<Alumno>() {
				@Override
				public int compare(Alumno p1, Alumno p2) {
					return new Integer((int) p1.getNota()).compareTo(new Integer((int) p2.getNota()));
				}
			});
			printArrayListAlumno();
	  }
}
