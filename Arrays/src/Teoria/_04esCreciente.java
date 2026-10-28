package Teoria;

public class _04esCreciente {
	
	public static void main(String[] args) {
		//int[] v = {2,20,30,50,60};
		int[] v = {2,20,30,20,50};
		
		//Comparando cada elemento con el de su derecha
		boolean enc = false;
		int i = 0;
		while (i < v.length - 1 && !enc){
			if(v[i] > v[i+1]) {
				enc = true;
 			} else {
 				i++;
 			}
		}
		if(enc){
			System.out.println("No creciente");
		} else {
			System.out.println("Creciente");
		}
		
		//Comparando cada elemento con el de su izquierda
		enc = false;
		i = 1;
		while (i < v.length  && !enc){
			if(v[i] < v[i-1]) {
				enc = true;
 			} else {
 				i++;
 			}
		}
		if(enc){
			System.out.println("No creciente");
		} else {
			System.out.println("Creciente");
		}
	}

}
