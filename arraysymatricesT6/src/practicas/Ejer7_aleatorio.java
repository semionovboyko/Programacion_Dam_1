package practicas;

import java.util.Random;

public class Ejer7_aleatorio {
	
	private static int cont;
	private static int mayor;
	private static int menor = 81;


	public static void main(String[] args) {
		 
        //Indicamos el tamaño
       
        int num[]=new int[101];
        
        //Invocamos las funciones
        
        rellenarNumAleatorioArray(num);
        
        mostrarArray(num);
        
        mayorYmedia(num);
        
        menorYmedia(num);
        
    }
 
    public static void rellenarNumAleatorioArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(80-10)+10));
        }
    }
    
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+ " ");
        }
    }
    
    public static void mayorYmedia(int lista[]){
    
        for(int i=0;i<lista.length;i++){
        	if(lista[i] > mayor){
        		mayor = lista[i];
        	}
        }
        for(int i=0;i<lista.length;i++){
        	if(lista[i] == mayor){
        		cont++;
        	}
        }
        System.out.println("\n________________________________________________");
        System.out.println("cont del mayor " + cont);
		System.out.println("El num mayor es " + mayor);
		System.out.println("La media es " + (mayor)/cont);
		System.out.println("________________________________________________");
    }
    
    
    public static void menorYmedia(int lista[]){
        for(int i=0;i<lista.length;i++){
        	if(lista[i] < menor){
        		menor = lista[i];
        	}
        	
        }
        for(int i=0;i<lista.length;i++){
        	cont = 1;
        	if(menor == lista[i]){
        		cont++;
        	}
        }
        System.out.println("cont del menor " + cont);
		System.out.println("El num menor es " + menor);
		System.out.println("La media es " + (menor)/cont);
    }
    
}


