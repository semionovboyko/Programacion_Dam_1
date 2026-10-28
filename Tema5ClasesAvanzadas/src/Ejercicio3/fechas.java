package Ejercicio3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class fechas {
	
	//Este método convierte una fecha en formato normal dd/mm/yyyy a formato americano mm/dd/yyyy.
	public static String normaltoAmericano(String fecha) {
		
		return fecha.substring(3,6) +
				fecha.substring(0,3) +
				fecha.substring(6);
	}
	
	//Este método realiza el paso contrario, convierte fechas en formato americano a formato normal
	public static String americanotonormal(String fecha) {
		
		return fecha.substring(3,6) +
				fecha.substring(0,3) +
				fecha.substring(6);
	}
	
	public static void main(String []args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce una fecha: dd/mm/aaaa");
		String fecha = tec.next();
		System.out.println(normaltoAmericano(fecha));
		
		System.out.println("_____________________________________");
		
		System.out.println("Introduce una fecha: mm/dd/aaaa");
		String fecha1 = tec.next();
		System.out.println(americanotonormal(fecha1));
	}

}
