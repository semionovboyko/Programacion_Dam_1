package Ejercicio2;

import java.util.Scanner;

public class Conversor {
	
	public int num;

	public Conversor(int num) {
		this.num= num;
	}


	public String getNum(String letra) {
		if(letra == "B") {
			return Integer.toBinaryString(num);
		}else if(letra == "H" ){
			return Integer.toHexString(num);
		}else if(letra == "O"){
			return Integer.toOctalString(num);
		}
	
		return "PARAMETRO INCORRECTO";
	}



	public static void main ( String [ ] args) { 
		
		Conversor num = new Conversor(12);
		System.out.println(num.getNum("H"));
	}
	
	

}
