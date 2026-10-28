package Teoria;

public class _05TodosPositivo {
	public static void main(String[] args) {
		int[] v1 = {3,3,5,6,2,1,9};
		int[] v = {3,3,5,6,-2,1,9};
		
		/* Mostrar uno de los dos mensajes siguientes:
		 * - "Todos son positivos"
		 * - "No todos son positivos"
		 */
		boolean enc = false;
		int i = 0;
		
		while( i< v.length && !enc){
			if(v[i] < 0) {
				enc = true;
			} else {
				i++;
			}
		}
		if(enc){
			System.out.println("No todos son positivos");
		} else {
			System.out.println("Todos positivos");
		}
		
	}

}
