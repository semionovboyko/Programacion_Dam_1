package CentroEducativo;

import java.util.Scanner;

public class test {
	
	public static void main(String []args) {
			 
			 Fecha f1 = new Fecha(1,1,2020);
			 Hora h1 = new Hora(8,10);
			 Examen e1 = new Examen("Pro",12, f1,h1);
			 
			 System.out.println(e1);
	}


		 
}
