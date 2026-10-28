package Prueba;

public class Cuenta {
	
	public float balance;
	
	public Cuenta() {
		
	}
	
	public void deposito (float cantidad) {
		balance += cantidad;
	}
	
	public void retiro (float cantidad) {
		balance -= cantidad;
	}
	
	public void transferencia(Cuenta destino,float cantidad) {
		destino.deposito(cantidad);
		retiro(cantidad);
	}
	
	public float balance() {
		return balance;
	}
}
