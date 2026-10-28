package Ejercicios;

public class LetrasAleatorias1 {
	
	public static void main(String[] args){

		int resultado;
		char letra;
		char vocal;
		
		//Sumamos al numero de letras (sin ñ) el valor en ASCII
		resultado=(int)(Math.random()*26+65);
		letra = (char)resultado;
		
		if ((letra=='A') || (letra=='E') || (letra=='I') || 
				(letra=='O') || (letra=='U')){
			vocal = letra;
			System.out.println("Es una vocal: " + letra );
		}else {
			System.out.println("Es una consonante: " + letra);
		}

		
	}
		

}
