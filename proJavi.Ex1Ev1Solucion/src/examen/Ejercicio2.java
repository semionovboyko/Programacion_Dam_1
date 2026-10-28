package examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Megas consumidos: ");
		double mb = tec.nextDouble();
		
		System.out.println("Minutos hablados: ");
		int min = tec.nextInt();
		
		double porDatos = calcularImporteDatos(mb);
		double porLlamadas = calcularImporteLlamadas(min);
		double total = porDatos + porLlamadas;
		double totalConIva = total + (total * 21 / 100);
		//double totalConIva = total * 1.21;
		//double totalConIva = total + total * 0.21;
		
		System.out.println("Coste por datos: " + porDatos);
		System.out.println("Coste por llamadas: " + porLlamadas);
		System.out.println("TOTAL: " + total);
		System.out.println("TOTAl IVA INCLUIDO: " + totalConIva);
		
	}
	
	public static double calcularImporteDatos(double mb){
		double importe;
		if(mb < 500){
			importe = mb * 0.05;
		} else if(mb < 1500){
			importe = mb * 0.03;
		} else if(mb < 5000){
			importe = mb * 0.02;
		} else {
			importe = mb * 0.01;
		} 
		return importe;
	}
	public static double calcularImporteLlamadas(int minutos){
		double importe;
		if(minutos <= 200){
			importe = 5;
		} else {
			importe = 5 + (minutos - 200) * 0.07;
		}
		return importe;
	}

}
