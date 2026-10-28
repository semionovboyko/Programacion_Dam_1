package practicas;

public class factorial {
	
	public static void main (String []args) {
		
		int n = 5;
		int resultado=factorialRecursivo(n);
		System.out.println(resultado);
	}
	
	public static int factorialRecursivo(int numero) {
		
		int res;
		
		if(numero == 1) {
			return 1;
		}else {
			res= numero * factorialRecursivo(numero-1);
		}
		
		return res;
	}

}

/* ITERANDO
public class Factoriales{
    static int factorial(int numero){
         int resultado = 1;
         while(numero > 0){
           resultado = resultado*numero;
           número--;
         }
    }
    
    int facI (int n){
        int t, resultado;
        resultado=1;
        for (t=1; t<=n; t++) resultado *=t;
        return resultado;
    }
}
    
*/