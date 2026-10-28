package Empresa_agroalimentaria;

public class Frio extends Producto {
	
	private int temp_mant;
	
	public Frio(int fecha_cad, int lote, int fecha_envasado, String pais, int temp_mant) {
		super(fecha_cad,lote,fecha_envasado,pais);
		this.temp_mant=temp_mant;
		
	}

	public int getTemp_mant() {
		return temp_mant;
	}

	public void setTemp_mant(int temp_mant) {
		this.temp_mant = temp_mant;
	}

	@Override
	public String toString() {
		return super.toString() +" Frio [temp_mant=" + temp_mant + "]";
	}
	
	

}
