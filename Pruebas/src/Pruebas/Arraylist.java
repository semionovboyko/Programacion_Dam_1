package Pruebas;
import java.util.ArrayList;
import java.util.*;
public class Arraylist {
	
	/*
	Los siguientes dos constructores nos ayudarán a empezar:
    ArrayList() construye un ArrayList con capacidad cero por defecto, pero crecerá según le vayamos añadiendo:
    ArrayList al = new ArrayList();
    ArrayList(int initialCapacity) construye un ArrayList vacío con una capacidad inicial especificada:
    ArrayList al2 = new ArrayList(5);
    para declarar un ArrayList de tipo String se haría de la siguiente forma:
	 */
	public static void ejercicio1(){	
		Scanner Entrada = new Scanner (System.in);
	

		// El programa solicitara introducir cinco nombres de equipos, y estos se almacenaran en el arraylist Liga.
		ArrayList<String> Liga = new ArrayList<>();
	
		for (int i = 0; i < 5; i++) {
		      System.out.println("Introduzca el nombre de 5 equipos de la Liga: ");
		      Liga.add(Entrada.next());
		}
		
		//Se creá un segundo arraylist de nombre Liga2 que será una copia del arraylista, para verificarlo,
		//se recorren y se muestran los dos arraylist.
		
		ArrayList<String> Liga2 = Liga;

		System.out.println("\n" + "EQUIPOS DE LA LIGA" + "\n" + "———————");
		for (int i = 0; i < Liga.size(); i++) {
		    System.out.println(Liga.get(i));

		}

		System.out.println("\n" + "EQUIPOS DE LA LIGA" + "\n" + "———————");
		for(String j: Liga2){
		      System.out.println(j);
		}
		
		//Se muestra la cantidad de valores que tiene el arraylist liga.
		
		System.out.println("\n" + "El arraylist Liga contiene: " + Liga.size() + " valores.");
		
		//Se elimina el valor de la posición 4 y muestra de nuevo los valores del arraylist.
		String r = Liga.remove(4);
		System.out.println("\n" + "El arraylist Liga, con el valor de la posición 4, ["+r+"] borrado: " + Liga);
		
		//Se sustituye el valor de la posición 2 por un equipo distinto y se muestrán los valores del arraylist.
		String s = Liga.set(2, "Levante");
		System.out.println("\n" + "El arraylist Liga,sustituyendo el valor de la posición 2, ["+s+"] por Levante: " + Liga);
		
		//Solicita el valor de la posición 3 y borra este valor.

		System.out.println("\n" + "Introduzca el valor de la posición 3:");
		String valor=Entrada.next();

		      if(valor.equalsIgnoreCase("D")){
		            valor =Liga.set(3, "");
		            System.out.println("El arraylist Liga, con el valor 3 borrado: " + Liga);           
		      }
		      else{
		            System.out.println("El valor introducido no es correcto");
		      }
	}
		//En este segundo ejercicio, se creá un método que no recibe parámetros.    
		public static ArrayList<String> ejercicio2(){
			Scanner Entrada = new Scanner (System.in);
			//Se creá un arraylist que se rellenara con los datos introducidos.

			ArrayList<String> nomEdad = new ArrayList<>();
			
			//Este método solicitara a través de la clase Entrada (clase creada para introducir datos por consola)
			//5 nombres y 5 edades.

			for (int i = 0; i < 5; i++) {

			System.out.println("Introduzca nombre: ");

			nomEdad.add(Entrada.next());

			System.out.println("Introduzca edad: ");
			nomEdad.add(Entrada.next());

			}
			//Una vez rellenado se devolverá el arraylist
			return nomEdad;
		}
		
		//En este tercer ejercicio se realizá un método que recibirá como
		//parámetro el arraylist que nos ha devuelto el método anterior.
		public static void ejercicio03(ArrayList<String> nombreEdad) {

			String datos = "";

			for(int i = 0; i < nombreEdad.size(); i++) {
					if(i < (nombreEdad.size() - 1))
						datos += nombreEdad.get(i) + ", ";
					else
						datos += nombreEdad.get(i);
			}

			System.out.println("\n\tDatos del ArrayList separados por \", \": " + datos);

			StringTokenizer token = new StringTokenizer(datos, ", ");

			System.out.println("\n\tDatos separados con StringTokenizer:");
			while(token.hasMoreTokens()) {
				System.out.println("\t\t" + token.nextToken());
			}
		}


		public static void main(String[] args) {
			Scanner Entrada = new Scanner (System.in);
			
			boolean exit = false;

			ArrayList<String> arrayMetodoEjercicio02 = new ArrayList<>();

			while(!exit) {
				System.out.println("\nElige el método");
				System.out.println("\t(1) Método que trabaja con 2 ArrayList pidiendo nombres de equipos");
				System.out.println("\t(2) Método que pide el nombre y la edad de dos usuarios, devuelve luego todo en un ArrayList");
				System.out.println("\t(3) Método que llama al método 2 para trabajar con StringTokenizer");
				System.out.println("\t(4) Para salir del menú y cerrar el programa");
				System.out.print("Opcion elegida: ");
				int opcion = Entrada.nextInt();

				switch(opcion) {
					case 1:
						ejercicio1();
						break;
					case 2:
						arrayMetodoEjercicio02 = ejercicio2();
						System.out.println("\n\tDatos introducidos: " + arrayMetodoEjercicio02);
						break;
					case 3:
						if(arrayMetodoEjercicio02.isEmpty())
							System.out.println("\n\tPrimero llama al método 2 para rellenar el ArrayList");
						else
							ejercicio03(arrayMetodoEjercicio02);
						break;
					case 4:
						exit = true;
						break;
					default:
						System.out.println("\n\tOpción mal introducida");
						break;
				}
			}
		
		}
	
}



