package practicas;
import java.util.*;

public class Temperatura {
	
	public static double c;
	public static double f;
	
	public static double celsiusToFahrenheit(double c) {
		
		 f = (1.8)* c +32;
		return f;
	}
	
	public static double fahrenheitToCelsius(double f) {
		
		c = (f-32) / 1.8;
		return c;
	}
	
	public static void main (String []args) {
		
		Scanner tec= new Scanner (System.in);
		
		System.out.println("Introduce la temperatura en celsius: " );
		c = tec.nextDouble();
		System.out.println("Tu temperatura en fahrenheit es: " + celsiusToFahrenheit(c));
		
		System.out.println("Introduce la temperatura en fahrenheit: " );
		f = tec.nextDouble();
		System.out.println("Tu temperatura en celsius es: " + fahrenheitToCelsius(f));
	}

}
