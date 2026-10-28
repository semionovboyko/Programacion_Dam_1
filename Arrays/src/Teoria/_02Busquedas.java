package Teoria;
import java.util.*;

public class _02Busquedas {
	
	public static void main(String[] args) {
		String[] nombre = {"Manuel","Rosa","Pedro","Luis"};
		
		//Mostrar el primer nombre del array que comienza con 
		// la letra indicada por el usuario
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce letra: ");
		char letra = tec.next().toUpperCase().charAt(0);
		
		//buscamos en el array
		boolean enc = false;
		int i = 0;
		while(i < nombre.length && !enc){
			if(nombre[i].toUpperCase().charAt(0) == letra){
				enc = true;
			} else {
				i++;
			}
		}
		if(enc) {
			System.out.println(nombre[i]);
		} else {
			System.out.println("Ningun nombre empieza por " + letra);
		}
		
	}

}
