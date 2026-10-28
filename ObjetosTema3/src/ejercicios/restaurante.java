package ejercicios;

public class restaurante {
	
	double papas;
	double chocos;
	int clientes;
	
	public double materiaPrima(double papas, double chocos) {
		
		do {
			papas -= 1;
			chocos -= 0.50;
			clientes +=3;
		}
		
		while(papas != 0 && chocos != 0);
		return clientes;
		
	}
	
	public void addChocos(int x) {
		chocos += x;
	}
	
	public void addPapas(int y) {
		papas += y;
	}
	
	public int getComensales() {
		return clientes;
	}
	
	public double getChocos() {
		return chocos;
	}
	
	public double getPapas() {
		return papas;
	}

	
	public static void main(String[] args) {
		restaurante comidas = new restaurante();
		comidas.addChocos(10);
		comidas.addChocos(10);
		System.out.println(comidas.getChocos());
		
		comidas.materiaPrima(1 ,1);
		System.out.println(comidas.getComensales());
	}

	
	


	
	
	
}
