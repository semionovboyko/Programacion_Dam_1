package Ejercicio1;

public class moneda extends sorteo{
	
	public int lanzar() {
		int num = (int) (Math.random()*2+1);
		if(num == 1) {
			System.out.println("CARA");
		}else
			System.out.println("CRUZ");
		return num;
	}

	/*@Override
	public String toString() {
		return "moneda "+ (lanzar()? "Cruz" : "Cara");// Tiene que ser boolean
	}*/
	

}
