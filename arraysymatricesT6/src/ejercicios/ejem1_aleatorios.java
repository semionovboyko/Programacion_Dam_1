package ejercicios;

import java.util.Random;

public class ejem1_aleatorios {
	


public static void main(String[] args) {

    int numeros[]=new int [4];
    int minimo = 1;
    int maximo = 5;
//Genera, comprueba e introduce los numeros en el array si la comprobación es correcta
    for (int i = 0; i < numeros.length; i++) {
        int num = Generar(minimo,maximo);   
        //Aqui es donde falla, siempre sale true.
        if(Comprobar(numeros,num)==true){
            numeros[i] = num;
        }
    }

    for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
    }

}
public static int Generar(int minimo, int maximo){
    Random  rnd = new Random();
    int num = (minimo + rnd.nextInt((maximo + 1) - minimo));
    return num;
}
public static boolean Comprobar(int numeros[], int num){
    boolean igual = false;
    for(int i = 0; i<numeros.length;i++){
        if(numeros[i] != num){ 
            igual = true;
        }
    }return igual; 
}



}
