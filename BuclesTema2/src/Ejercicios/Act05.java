package Ejercicios;

public class Act05 {
	
	public static void main(String []args){
		
		
		System.out.println("Tabla del 1\n**********");
		
		multipli();
	}
	
	public static int multipli() {
		
		final int num=1;
		int multi=0;
		
		for (int i= 1; i < 11; i++) {
			multi = num * i;
			System.out.println(num +"*"+ i +"="+multi);
			
		}
		
		return multi;
		
		
	}

}
