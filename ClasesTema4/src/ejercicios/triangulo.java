package ejercicios;

public class triangulo {
	
	public static int e(int i, int j) {
		int res;
		
		if( i == 1 || j == 1) {
			return 1;
		}else {
			  res = e(i, j-1) + e(i-1,j);
		}
		return res;
		
	}
	
	public static void main (String []args) {
        
        int numFilas = 7/2 + 1;
                 
        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
            	System.out.print(e(altura,asteriscos)+"    ");
            }
            System.out.println("");         
        }
	}

}
