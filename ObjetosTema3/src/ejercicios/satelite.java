package ejercicios;
import java.util.*;

public class satelite {
	Scanner tec = new Scanner (System.in);
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	
	public satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia_tierra= d;
	}
	
	public satelite() {
		meridiano = paralelo = distancia_tierra = 0;
	}
	
	public void setPosicion(double m, double p, double d) {
		meridiano= m;
		paralelo = p;
		distancia_tierra= d;
	}
	
	public void variaAltura(double desplazamiento) {
		
		desplazamiento = distancia_tierra + desplazamiento;
		
		if(desplazamiento < 0)
			desplazamiento = 0;
		
	}
	
	public boolean enOrbita() {
		if(distancia_tierra == 0) 
			return false;
		else 
			return true;
	}
	
	public void variaPosicion(double variap, double variam) {
		
		paralelo += variap;
		meridiano += variam;
	}
	
	public void printPosicion() {
		System.out.println("El satellite se encuentra en el paralelo"+
	paralelo + "en el  meridiano " + meridiano + " a una distanci de la de la tierra "
		+ distancia_tierra + "kilometros");
	}
	

}
