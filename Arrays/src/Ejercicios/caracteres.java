package Ejercicios;

public class caracteres {
	
	/*METODOS static ---- no actuan sobre un objeto EJEMPLO math.sqrt, interfes(parseInt), String s = "javi";
	 * 			no static ----- actua se ejecuta sobre un objeta EJEMPLO s.op(s.toUpperCase(i)), objeto.metodo,s.indexOf()
	 * 
	 */
	
	public static void main (String []args) {
		
		//char []v = {'a','a', 'b','c','d','a','e'};
		String[]v = {"aabed","cdef","zabol"};
		
		//System.out.println(metodo(v));
	}
	
	public static String metodo (char[]v) {
		
		
	
		String str = "";
		
		/*str += char;
		return str;*/
		
		for(int i=0; i<v.length;i++) {
			if(v[i]== 'a' || v[i]=='b') {
				str += v[i];
			}
		}
		return str;
	}
	
	public static String metodo1 (String[]v) {
		
		/*String str = aabab / concatenar a y b de todas las cadenas J
		 * String str 0 dab; /si la longitud de la cadena es par me interesan las a y b
		 * 						si es impar las c y d
		 */
		
		String str = ""; //o null;
		
		for (int i= 0; i <v.length;i++) {
			for(int j=0; j<v[i].length();j++) {
				char caracter = v[i].charAt('j');
				if(caracter == 'a'|| caracter == 'b') {
					str += caracter;
				}
			}
		}
		return str;
	}

}
