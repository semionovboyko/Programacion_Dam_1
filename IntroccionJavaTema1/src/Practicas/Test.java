package Practicas;
/*Realiza un metodo para la clase TEst que genere letras de forma aleatoria*/

public class Test {
	public static char getLetras() {
		return (char)(Math.random()*26+'a');
	}
	
	public static void main (String[] args) {
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
	}

}
