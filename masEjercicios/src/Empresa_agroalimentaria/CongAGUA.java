package Empresa_agroalimentaria;

public class CongAGUA extends ProductoCongelado{
	
	private int salinidad;
	
	public CongAGUA(int fecha_cad, int lote, int fecha_envasado, String pais, int temp_mant, int codigo_superAlime, int salinidad) {
		super(fecha_cad, lote, fecha_envasado, pais, temp_mant, codigo_superAlime);
		this.salinidad=salinidad;
	}

}
