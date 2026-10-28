package ejercicios;

public class coche {
	
	String marca;
	String modelo;
	
	public coche() {
		
	}
	
	public coche(String mar, String mod){
		marca = mar;
		modelo = mod;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static void main (String []args) {
		
		coche coche1= new coche();
		coche1.setMarca("250A");
		coche1.setModelo("Audi");
		
		coche coche2 = new coche("122B", "Honda");
		
		System.out.println(coche1.getModelo());
		System.out.println(coche2.getModelo());
	}

}
