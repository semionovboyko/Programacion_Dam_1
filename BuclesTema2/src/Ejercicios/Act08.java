package Ejercicios;
import java.util.Scanner;

public class Act08 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int num = tec.nextInt();
        
            if(num != invNum(num) && esPrimo(num) && esPrimo(invNum(num))) {
                System.out.println(num + " ES UN NUMERO OMIRP " + invNum(num));
            }else {
            	System.out.println(num + " NO ES UN NUMERO OMIRP " );
            }
        }
    
    //Invierte los digitos de un numero
    public static int invNum(int n) {
        int nDigitos = Integer.toString(n).length();
        int nInv = 0;

        if (nDigitos == 1) {
            return n;
        } else {
            for (int i = 0; i < nDigitos; i++) {
                if (i == 0) {
                    nInv += (n % 10) * Math.round(Math.pow(10, (nDigitos - 1)));
                } else if (i == nDigitos - 1) {
                    nInv += n / Math.round(Math.pow(10, (nDigitos - 1)));
                } else {
                    nInv += (n / Math.round(Math.pow(10, i))) % 10 
                             * Math.round(Math.pow(10, (nDigitos - 1 - i)));
                }
            }
        }

        if (nInv < 0) {
            return nInv / 10;
        } else {
            return nInv;
        }
    }
    //Comprueba si un numero es o no primo
    public static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                
                return false;
            }
        }
        return true;
    }
	       	  
	    	
}
	         /*PARA SABER SI UN NUMERO ES PRIMO O NO
	         for(i=1;i<(n+1);i++){
	         if(n%i==0){
	             a++;
	            }
	         }
	         if(a!=2){
	              System.out.println("No es Primo");
	            }else{
	                System.out.println("Si es Primo");
	         }*/
	     
	
	 


