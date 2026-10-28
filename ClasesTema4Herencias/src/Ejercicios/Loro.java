package Ejercicios;

public class Loro extends Aves implements PuedeCaminar, PuedeVolar{

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("PUEDE VOLAR"); 
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("PUEDE CAMINAR"); 
		
	}

}
