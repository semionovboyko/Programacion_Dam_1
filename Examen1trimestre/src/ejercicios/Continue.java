package ejercicios;

public class Continue {
	
	public static void main(String[] args) {
		int dia = 5, i; 
		
		for (i = 1; i <= 7; i++) { 
			
			if (dia == i){
			System.out.println("Hoy es el " + i + "º dia de la semana.");
			continue; 
			//Es lo mismo que el anterior pero lo unico que cambia es que en lugar de un BREAK
			// el cual rompe el bucle FOR hay un CONTINUE el cual despues de que se cumpla la condicion
			//continua con el bucle FOR imprimiendo por pantalla los dias hasta llegar a 7
			
			} 
		
			System.out.println("Día " + i); 
		 } 
			
		 System.out.println("Seguimos..."); 
	 }

}
/*
	Día 1
	Día 2
	Día 3
	Día 4
	Hoy es el 5º dia de la semana.
	Día 6
	Día 7
	Seguimos...
*/
