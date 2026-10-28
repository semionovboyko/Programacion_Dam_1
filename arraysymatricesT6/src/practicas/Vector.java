package practicas;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {

	private  int lon;
	private  int[] v;
	
	Scanner tec = new Scanner (System.in);

	
	public void solicitarTamanyo() {
	//Pedimos al usuario que informe el atributo lon (longitud del vector)
    //y entonces creamos el otro atributo: el vector v de lon enteros.
		System.out.println("Introduce el tamanio del vector: ");
		int lon = tec.nextInt();
		v = new int[lon];
		
	}
	
	public void asignarDatos() {
		for(int i = 0; i<v.length; i++) {
			v[i]=(int) (Math.random()*(100-1)+1);
			System.out.print(v[i]+"  ");
		}
		System.out.print(" \n");
	}
	
	public int maximo(){
		int max = 0;
		for(int i = 0; i<v.length; i++) {
			if(v[i]> max) {
				max = v[i];
			}
		}
		return max;	
	}
	
	public int minimo(){
		int min = 0;
		for(int i = 0; i<v.length; i++) {
			if(v[i]< min) {
				min = v[i];
			}
		}
		return min ;
	}
	
	public void insertar(int pos, int num){
	        for(int i=v.length-1; i>=pos; i--){
	            if(i != pos) {
	            	v[i]=v[i-1];
	            }else {
	            	v[i]=num;
	            }
	        }
	        
	        for(int i=0;i<v.length;i++) {
				System.out.print(v[i]+" ");
			}
	            
	 }

	public static void main(String [] args) {
		Vector vector = new Vector();
		vector.solicitarTamanyo();
		vector.asignarDatos();
		System.out.println(vector.maximo());
		System.out.println(vector.minimo());
		System.out.println("_____________________");
		vector.insertar(3,3);
		
		//Creamos un objeto Vector con el constructor por defecto (no hay que implementar el constructor
//		por defecto) y luego llamamos a los métodos que le darán los valores a los atributos.
	}
}
