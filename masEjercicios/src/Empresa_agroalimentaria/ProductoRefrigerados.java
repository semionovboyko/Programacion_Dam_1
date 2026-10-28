package Empresa_agroalimentaria;

public class ProductoRefrigerados extends Frio{
	
	private int  codigo_superAlime;
	
	public ProductoRefrigerados(int fecha_cad, int lote, int fecha_envasado, String pais,int temp_mant, int codigo_superAlime) {
		super(fecha_cad,lote,fecha_envasado,pais,temp_mant);
		this.codigo_superAlime=codigo_superAlime;
	}

	public int getCodigo_superAlime() {
		return codigo_superAlime;
	}

	public void setCodigo_superAlime(int codigo_superAlime) {
		this.codigo_superAlime = codigo_superAlime;
	}
	
	
}
