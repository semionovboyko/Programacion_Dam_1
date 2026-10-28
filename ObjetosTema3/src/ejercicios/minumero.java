package ejercicios;

public class minumero {
	
	private int numero;
	
	public minumero(){
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int dobleNum() {
		return numero= numero *2;
	}
	
	public int tripleNum() {
		return numero= numero *3;
	}
	
	public int cuadrupleNum() {
		return numero= numero *4;
	}
	
	public static void main(String[] args) {
		
		minumero n1= new minumero();
		n1.setNumero(5);
		System.out.println(n1.tripleNum());
		System.out.println(n1.cuadrupleNum());
	}
}
