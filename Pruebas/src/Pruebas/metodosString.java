package Pruebas;

public class metodosString {
	public static void  main(String []args) {
		
		//Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada
		String a = "Java desde Cero";
		int sal = a.indexOf("a");
		System.out.println(sal);
		
		//Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada,
		//comenzando en el índice especificado.
		String s = "Java desde Cero";
		int salida = s.indexOf('e',1);
		System.out.println(salida);
		
		//Devuelve el índice dentro de la cadena de la última aparición de la cadena especificada.
		String x = "Java desde Cero";
		int ultima = x.lastIndexOf('e');
		System.out.println(ultima);
		
	     
	    }
	
}
