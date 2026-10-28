package Teoria;
import java.util.*;

public class _03Busquedas {
	
	public static void main(String[] args) {
		
		//Edad de las personas de un grupo
		int[] edad = {12, 10, 9, 13, 14, 20, 18};
		
		//Hay una edad minima para poder entrar al cine:
		Scanner tec = new Scanner(System.in);
		System.out.println("Cual es la edad minima para entrar al cine?");
		int edadMinima = tec.nextInt();
		
		//QUE PERSONA NO PODRIA ENTRAR
		for(int i = 0; i< edad.length;i++) {
			if(edad[i] < edadMinima){
				System.out.println("La persona " + i + " no puede entrar");
			}else
				System.out.println("La persona " + i + " si puede");
		}
		
		//Indicar si el grupo puede entrar al cine o no
		boolean enc = false;
		int i = 0;
		while(i < edad.length && !enc){
			if(edad[i] < edadMinima){
				enc = true;
			} else {
				i++;
			}
		}
		if(enc){
			System.out.println("El grupo no puede entrar");
		} else {
			System.out.println("El grupo puede entrar");
		}
		
	}

}
