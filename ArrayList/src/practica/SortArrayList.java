package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortArrayList {
	
	private static ArrayList<Double> arrayListInt = new ArrayList<>();
	private static ArrayList<Personaje> personas = new ArrayList<>();

	public static void main(String args[]) {

		// Guardo datos en el ArrayList

				arrayListInt.add(3.5); 	arrayListInt.add(4.5);

				arrayListInt.add(2.5);	arrayListInt.add(6.5);

				arrayListInt.add(5.1);	arrayListInt.add(1.3);

				arrayListInt.add(5.2);



				// Imprimo el arrayList de Enteros desordenado

				System.out.println("ArrayList desordenado: ");

				printArrayListInt();





				// Ordeno el ArrayList de menor a mayor y lo imprimo

				System.out.println("\nArrayList ordenado de menor a mayor");

				Collections.sort(arrayListInt);

				printArrayListInt();



				// Ordeno el ArrayList de mayor a menor y lo imprimo

				System.out.println("\nArrayList ordenado de mayor a menor");

				Comparator<Double> comparador = Collections.reverseOrder();

				Collections.sort(arrayListInt, comparador);

				printArrayListInt();



				// Guardo datos en el ArrayList de Objetos de la clase persona

				personas.add(new Personaje("Pepe", 28));

				personas.add(new Personaje("Juan", 32));

				personas.add(new Personaje("Paco", 40));

				personas.add(new Personaje("Lola", 20));

				personas.add(new Personaje("Jose", 28));

				personas.add(new Personaje("Dani", 24));

				personas.add(new Personaje("Sara", 36));

				personas.add(new Personaje("Susi", 24));



				// Imprimo el ArrayList desordenado por edad de la clase persona

				System.out.println("\nArrayList desordenada");

				printArrayListPersona();



				// Odeno el arrayList de menor a mayor por edad y lo imprimo

				System.out.println("\nArrayList ordenado por edad de menor a mayor:");

				Collections.sort(personas, new Comparator<Personaje>() {

					@Override

					public int compare(Personaje p1, Personaje p2) {

						return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));

					}

				});

				printArrayListPersona();



				// Odeno el arrayList de mayor a menor por edad y lo imprimo

				System.out.println("\nArrayList ordenado por edad de mayor a menor:");

				Collections.sort(personas, new Comparator<Personaje>() {

					@Override

					public int compare(Personaje p1, Personaje p2) {

						// Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes

						return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));

					}

				});

				printArrayListPersona();

				/* Ordenar personas segun su edad
				Collections.sort(personas, new Comparator<Persona>() {
				    @Override
				    public int compare(Persona p1, Persona p2) {
				       if( p1.getEdad() > p2.getEdad() ){
				           return 1;
				       }
				       if( p1.getEdad() < p2.getEdad() ){
				           return -1;
				       }
				       return 0;
				    }
				});
*/
			}



			private static void printArrayListInt() {

				Iterator<Double> itrArrayList = arrayListInt.iterator();

				int posicion = 1;

				while (itrArrayList.hasNext()) {

					System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next());

					posicion++;

				}

			}



			private static void printArrayListPersona() {

				Iterator<Personaje> itrArrayList = personas.iterator();

				int posicion = 1;

				while (itrArrayList.hasNext()) {

					System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());

					posicion++;

				}

			}

	
}
