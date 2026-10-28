package Teoria;

public class _06TresMayores {
	public static void main(String[] args) {
		int[] edad = {10, 20, 30, 12, 15, 18, 30, 50};
		//int[] edad = {10, 2, 3, 12, 15, 8, 0, 5};
		//int[] edad = {10, 20, 30, 12, 15, 8, 3, 5};
		/*
		 * Mostrar uno de los dos mensajes siguientes: 
		 * - En el grupo hay AL MENOS 3 mayores de edad
		 * - En el grupo no hay AL MENOS 3 mayores de edad
		 */
		boolean enc = false;
		int i = 0;
		int cont = 0;
		while (i < edad.length && !enc){
			if(edad[i] >= 18){
				cont ++;
				if(cont == 3){
					enc = true;
				}
			}
			i++;
		}
		if(enc) System.out.println("Hay al menos 3 mayores de edad");
		else System.out.println("NO HAY al menos 3 mayores de edad");
	}


}
