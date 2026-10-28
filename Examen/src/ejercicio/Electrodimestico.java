package ejercicio;

public abstract class Electrodimestico{
	
	private int precioBase = 100;
    protected ConsumoEnergetico CE = ConsumoEnergetico.F;
	private int peso = 5;
	
	public Electrodimestico() {
		
	}
	
	public Electrodimestico(int precioBase, ConsumoEnergetico CE, int peso) {
		
		this.precioBase = precioBase;
		this.CE = CE;
		this.peso = peso;
		comprobarConsumo(CE);
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public ConsumoEnergetico getCE() {
		return CE;
	}

	public void setCE(ConsumoEnergetico cE) {
		CE = cE;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumo(ConsumoEnergetico CE) {
		
		if (CE == ConsumoEnergetico.A) {
			CE = ConsumoEnergetico.A;
		}else if (CE == ConsumoEnergetico.B) {
			CE = ConsumoEnergetico.B;
		}else if (CE == ConsumoEnergetico.C) {
			CE = ConsumoEnergetico.C;
		}else if (CE == ConsumoEnergetico.D) {
			CE = ConsumoEnergetico.D;
		}else if (CE == ConsumoEnergetico.E) {
			CE = ConsumoEnergetico.E;
		}else if (CE == ConsumoEnergetico.F) {
			CE = ConsumoEnergetico.F;
		}else {
			CE = ConsumoEnergetico.F;
		}
			
	}
	
	public double precioFinal() {
		
		double precioFinal= 0;
		
		if(CE == ConsumoEnergetico.A) {
			precioFinal = 100;
		}else if(CE == ConsumoEnergetico.B) {
			precioFinal = 80;
		}else if(CE == ConsumoEnergetico.C) {
			precioFinal = 60;
		}else if(CE == ConsumoEnergetico.D) {
			precioFinal = 50;
		}else if(CE == ConsumoEnergetico.E) {
			precioFinal = 30;
		}else{
			precioFinal = 10;
		}
		
		if(peso <=19) {
			precioFinal +=10;
		}else if(peso <=49) {
			precioFinal +=50;
		}else if(peso <=79) {
			precioFinal +=80;
		}else {
			precioFinal +=100;
		}
		
		return precioFinal;
	
	}
	
	
	
}
