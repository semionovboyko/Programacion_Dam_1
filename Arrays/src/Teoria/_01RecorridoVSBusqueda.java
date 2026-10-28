package Teoria;
import java.util.*;
public class _01RecorridoVSBusqueda {
	
	public static void main (String []args) {
		int [] v = {1,2,3,4,5,6,7,8,};
		
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce un valor: ");
		int x= tec.nextInt();
		
		//RECORIDO PARA SABER CUANTOS SON MULTIPLOS DE X HAY EN V
		int cont=0;
		for(int i =0; i<v.length; i++) {
			if(v[i]%x == 0) {
				cont++;
			}
		}
		System.out.format("hay %d multiplos de %d%n", cont,x);
		
		//BUSQUEDAS EN QUE POSICION DE LA ARRAY ESTA EL PRIMER MULTIPLO DE X
		boolean enc = false;
		int i=0;
		while(i < v.length && !enc) {
			if(v[i]%x == 0) {
				enc = true;
			}else {
				i++;
			}
		}
		if(enc){
			System.out.format("El primer multiplo de %d esta en la pos %d%n",
					x, i);
		} else {
			System.out.println("No hay ningun multiplo de " + x);
		}
	}

}
