package ejercicios;
import java.util.*;

public class finanzas {

	private double cambio;
	
	public finanzas() {
		cambio=1.36;
	}
	

	public finanzas(double c) {
		cambio = c;
	}
	
	public double dolaresToEuros(double dinero) {
		dinero = dinero / cambio; 
		return dinero;
	}
	
	public double eurosToDolares(double dinero) {
		dinero = dinero * cambio;
		return dinero;
	}
	
	
	
	public static void main (String []args) {
		
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce tu dinero");
		double d = tec.nextDouble();
		
		finanzas f1 = new finanzas();
		System.out.println(f1.dolaresToEuros(d));
		

		System.out.println("Introduce un valor para el cambio: ");
		double c = tec.nextDouble();
		finanzas f2 = new finanzas(c);
		System.out.println(f2.eurosToDolares(d));
	}
}



