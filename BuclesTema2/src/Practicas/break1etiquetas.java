package Practicas;

public class break1etiquetas {
	
	 //Un ejemplo de break con etiquetas es el siguiente:
	 public static void main (String argv[]){
		 int i = 0;
		 
		 bucleexterno:  //etiqueta la siguiente sentencia, es decir el while
		 while ( i < 100){
			 i ++;
			 for ( int j = 0; j < i; j++) {
				 if ( i== 8) {
					 break bucleexterno;
				 }
		 
				 System.out.print( "*" );
			 }
		 
			 System.out.println( "" );
		 }
	 }
	

}
