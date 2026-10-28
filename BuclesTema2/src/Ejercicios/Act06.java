package Ejercicios;
import java.util.*;

public class Act06 {
	
	public static void main ( String [ ] args) {
		//int rnd = 100 + (int) (Math.random()*200); 
		
		Random ran = new Random();
		int rnd = ran.nextInt(100)+100;
		
		
		if ( rnd % 2 == 0) {
			System.out.println(rnd + " es par"); 
		}else {
			System.err.println(rnd  + " es impar");
		}
		
		
	} 
	 

}
