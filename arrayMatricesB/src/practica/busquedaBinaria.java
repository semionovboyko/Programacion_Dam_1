package practica;

public class busquedaBinaria {
/*Arrrays ya ordenadas
 * 
 */
	public static boolean hayalguiende36(int[]edad){
		//variables iz y der marcaran el fragmento del array ene le que
		//realizamos la busqueda. inicialmente buscamos en toda el array.
		int izq = 0;
		int der= edad.length-1;
		
		boolean encontrado = false;
		while(izq<=der && !encontrado) {
			// Calculamos posicion central del fragmento en el que buscamos
			int m =( izq + der)/2;
			
			if(edad[m]==36)
				//Hemos encontrado una persona de 36
				encontrado = true;
			else if(edad[m]>36) 
				//El elemento central tiene mas de  36
				// continuamos la busqueda en la mitad izq.Es decir
				// entre las las posiciones izq y m-1
				der=m-1;
			else
				//El elemento central tiene mmenos de  36
				// continuamos la busqueda en la mitad derecha.Es decir
				// entre las las posiciones m+1 y der
				izq=m+1;
				
			}// del while return encontrado
		if(encontrado)// finaliza por encontrado o cuando izq y derecha se cruzan(izq>der)
			return true;
		else 
			return false;
		}
	}
