package Ejercicio1;

public  class dado extends sorteo{
	
	public int lanzar() {
		int num = (int) (Math.random()*6+1);
		return num;
	}
	
	@Override
	public String toString() {
		return "Dado ["+lanzar()+"]";
	}

}
