package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		System.out.println("Numero de socio: ");
		int nSocio = tec.nextInt();
		System.out.println("Familia numerosa (Si/No)");
		String fn = tec.next().toLowerCase();
		
		if(edad < 5 || edad > 80){
			System.out.println("Edad no permitida");
		} else {
			double precio;
			if(edad <= 12){
				precio = 80;
				if(nSocio != 0) {
					precio -= 5;
				}
			} else if(edad <= 17){
				precio = 100;
				if(nSocio != 0) {
					precio -= 7.5;
				}
			} else if(edad <= 64){
				precio = 120;
				if(nSocio != 0) {
					precio -= 10;
				}
			} else {
				precio = 50;
				if(nSocio != 0) {
					precio -= 12.5;
				}
			} 
			
			if(fn.equals("si")){
				precio -= 10;
			}
 
			System.out.println("Precio del pase anual: " + precio);
 
		}
		
	}

}
