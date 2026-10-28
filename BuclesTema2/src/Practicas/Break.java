package Practicas;

public class Break {
	public static void main(String[] args){
        for (int i = 0; i< 6; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    break;
                }
                else{
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
    }

}
//La sentencia break hace que se salga completamente del bucle 
//más interno y proseguimos con la siguiente iteración del bucle externo.

// Bucle  i empieza por 0 y tiene que llegar a 5 pero 
// dentro tiene un valor j que tiene que recorrer hasta 4 entonces empezamos 
// i posicion 0 j posicion 0
// i posicion 0 j posicion 1