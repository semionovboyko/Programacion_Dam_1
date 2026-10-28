package Ejercicio2;

public class Player {
	
	int x, y;
	
	public int moverDerecha() {
		return getX()+1; 
	}
	
	public int moverIzquierda() {
		return getX()-1; 
	}
	
	public int moverArriba() {
		return getY()-1; 
	}
	
	public int moverAbajo() {
		return getY()+1; 
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
