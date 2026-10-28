package ejercicios;
import java.util.*;

public class notaMedia {
	
	public static void main (String[]args) {
		
		double media = 0;
		int cont = 0;
		char respuesta;
		double nota;
		
		Scanner tec = new Scanner(System.in);
		do{
			System.out.println("Introduce tu nota del modulo:");
			nota = tec.nextInt();
			media += nota;
			cont++;
			
			System.out.println("Quieres introducir otra nota: S/N");
			respuesta =tec.next().charAt(0);
			
		}while(respuesta == 'S');
		
		System.out.println("ALUMNO: Alexey Semionov ");
		System.out.println("NOTA MEDIA: " + media/cont);
	}

}