package Practicas;

public class proba2 {

	public static void main (String argv[]){
		 int i = 0;
		 bucleext:
		 while ( i < 7){
			 i ++;
			 for ( int k = 1; k < (8-i); k+=2) {
				 if ( i %2 == 0) {
					continue bucleext;
				}
					System.out.print( " " );
			 }
			 
			 for ( int j = 0; j < i; j++) {
				 System.out.print( "*" );
			 
			 }
			
			 System.out.println( "" );
			 if ( i == 7) {
				 break bucleext;
			 }
		 } 
	}
}
