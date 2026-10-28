package Ejercicio2;

public class Game {
	
	Player p;
	
	//...
	
	public void movement(String m) {
		if(m.equalsIgnoreCase("Derecha")) {
			p.moverDerecha();
		}
		if(m.equalsIgnoreCase("Izquierda")) {
			p.moverIzquierda();
		}
		if(m.equalsIgnoreCase("Arriba")) {
			p.moverArriba();
		}
		if(m.equalsIgnoreCase("Abajo")) {
			p.moverAbajo();
		}
	}

}
