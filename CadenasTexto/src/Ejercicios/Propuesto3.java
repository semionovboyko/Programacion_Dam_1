package Ejercicios;

public class Propuesto3 {
	public static boolean esCapicua(int dato) {
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString() == reverse.toString();
		/* 
		i.toString() == reverse.toString();
		
		al asignar i == reverse hace que la segunda referencia apunte al mismo lugar de memoria
		que la primera y no se dupliquen los datos. En ese caso el método equals si da como resultado true. 
		
		return i.toString()equals(reverse.toString());
		
		*/
	}
	
	
	public static void main(String []args) {
		
		System.out.println(esCapicua(200));
	}

}
