package ejercicio;

public class Lavadora extends Electrodimestico{
	
	private int carga = 5;
	
	public Lavadora(){
		
	}
	
	public Lavadora(int precioBase, ConsumoEnergetico CE, int peso, int carga) {
		super(precioBase,CE,peso);
		this.carga = carga;	
	}
	
	public Lavadora (Lavadora L) {
		this.carga = L.carga;
	}
	
	public double precioFinal() {
		
		double precio = super.precioFinal();
		
		if (carga <= 30) {
			precio += 50;
		}
		
		return precio;
	}

}
