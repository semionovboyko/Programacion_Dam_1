package ejercicio1a3;
public class Ejercicio2 {
   public static boolean hayUnPar(int v[]){
	   int contPares = 0;
	   boolean enc = false;
	   for (int i = 0; i < v.length && !enc; i++) {
		   if(v[i] % 2 == 0){
			   //El elemento es par
			   contPares ++;
			   if(contPares > 1){
				   enc = true;
			   }
		   }
	   }
	   if(contPares == 1) return true;
	   else return false;
   }
   
   public static void main(String args[]){
       //  --- Puedes probar con los siguientes arrays ---------
       int ceroPares[] = {1,1,1,1,1,3,1,7,1,1}; //Este array NO tiene elementos pares
       int unPar[] = {1,1,1,2,1,3,1,7,1,1}; //Este array tiene un elemento par
       int dosPares[] = {1,1,1,2,1,2,1,7,1,1}; //Este array tiene DOS elemento pares
       int tresPares[] = {1,1,1,2,1,2,2,7,1,1}; //Este array tiene tres elementos pares
       
       System.out.println("Con 0 pares: " + hayUnPar(ceroPares)); 	//Debe imprimir false
       System.out.println("Con 1 pares: " + hayUnPar(unPar));     	//Debe imprimir true
       System.out.println("Con 2 pares: " + hayUnPar(dosPares)); 	//Debe imprimir false
       System.out.println("Con 3 pares: " + hayUnPar(tresPares));	//Debe imprimir false

   }
}
