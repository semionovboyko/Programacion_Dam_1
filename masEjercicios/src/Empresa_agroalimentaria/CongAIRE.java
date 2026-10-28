package Empresa_agroalimentaria;

public class CongAIRE extends ProductoCongelado{
	
	private int nitro;
	private int oxi;
	private int dioxCar;
	private int vap;

	public CongAIRE(int fecha_cad, int lote, int fecha_envasado, String pais, int temp_mant, int codigo_superAlime,
			int nitro, int oxi, int dioxCar, int vap) {
		super(fecha_cad, lote, fecha_envasado, pais, temp_mant, codigo_superAlime);
		this.nitro=nitro;
		this.oxi=oxi;
		this.dioxCar=dioxCar;
		this.vap=vap;
	}

	public int getNitro() {
		return nitro;
	}

	public void setNitro(int nitro) {
		this.nitro = nitro;
	}

	public int getOxi() {
		return oxi;
	}

	public void setOxi(int oxi) {
		this.oxi = oxi;
	}

	public int getDioxCar() {
		return dioxCar;
	}

	public void setDioxCar(int dioxCar) {
		this.dioxCar = dioxCar;
	}

	public int getVap() {
		return vap;
	}

	public void setVap(int vap) {
		this.vap = vap;
	}

	@Override
	public String toString() {
		return super.toString() +" CongAIRE [nitro=" + nitro + ", oxi=" + oxi + ", dioxCar=" + dioxCar + ", vap=" + vap + "]";
	}
	
	
	
	

}
