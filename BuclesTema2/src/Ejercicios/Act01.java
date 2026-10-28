package Ejercicios;

import java.util.Scanner;

/*Realiza un programa con tres variables de tipo entero a, b y c.
 *  El programa deberá mostrar por pantalla el valor menor y mayor
 */

public class Act01 {
	
	 public static void main(String[] args) {
	        Scanner tec=new Scanner(System.in);
	        int n1=tec.nextInt();
	        int n2=tec.nextInt();
	        int n3=tec.nextInt();
	        if(n1>n2)
	            if(n1>n3)
	                if(n2>n3)
	                    System.out.println(n1+" es el mayor, "+n3+" es el menor");
	                else if(n2==n3)
	                    System.out.println(n1+" es el mayor, "+n2+", "+n3+"  son iguales");
	                else
	                    System.out.println(n1+" es el mayor, "+n2+" es el menor");
	            else if(n1==n3)
	                System.out.println(n1+", "+n3+" son iguales, "+n2+" es el menor");
	            else
	                System.out.println(n3+" es el mayor, "+n2+" es el menor");
	        else if(n2>n3)
	            if(n1==n3)
	                System.out.println(n2+" es el mayor, "+n1+", "+n3+"  son iguales");
	            else if(n2==n1)
	                System.out.println(n1+", "+n2+" son iguales, "+n3+" es el menor");
	            else if(n1>n3)
	                System.out.println(n2+" es el mayor, "+n3+" es el menor");
	                else
	                    System.out.println(n2+" es el mayor, "+n1+" es el menor");
	        else if(n1==n2)
	            if(n2==n3)
	                System.out.println(n1+", "+n2+", "+n3+" son iguales");
	            else
	                System.out.println(n3+" es el mayor, "+n1+", "+n2+"  son iguales");
	        else if(n2==n3)
	            System.out.println(n2+", "+n3+" son iguales, "+n1+" es el menor");
	        else
	            System.out.println(n3+" es el mayor, "+n1+" es el menor");
	    }
}
