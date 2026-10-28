package ejercicios;

public class Break {

	public static void main(String[] args) {
		int dia = 5, i; 
		for (i = 1; i <= 7; i++) { //Bucle que empieza por la posicion 1 que va incrementando +1 hasta 7
			
			if (dia == i){ //Condicion cuando coincida la posicion con el dia que es "5"
				System.out.println("Hoy es el " + i + "º día de la semana.");//Se imprime por pantalla
				break; //Se rompe el bucle for 
			}
			System.out.println("Día " + i); //Se imprimen los dias por pantalla hasta que la condicion se cumpla.
		} 
		
		System.out.println("Seguimos...");////Se imprime por pantalla cuando se rompe el bucle 
		} 
	
	} 

/*RESULTADO
	Día 1
	Día 2
	Día 3
	Día 4
	Hoy es el 5º día de la semana.
	Seguimos...
*/
