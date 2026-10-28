package Pruebas;

/*
 * Con esta función se pueden utilizar expresiones regulares. En este ejemplo separamos los elementos con espacio 
 * (expresión regular \\s) 
 * y el más para indicar que puede haber más caracteres a continuación.La función split pone cada elemento 
 * encontrado en una posición del vector de Strings, para mostrar los elementos sólo hace falta 
 * recorrerlo.
 * 
 */

public class split {
	
	public static void main(String []args) {
		
		int j = 0;
		String linea = "elemento1 elemento2 elemento3";
		String [] campos = linea.split("\\s+");
		
		while(j<campos.length){
		System.out.println(campos[j]);
		j++;
		}
	
	
	}
}
