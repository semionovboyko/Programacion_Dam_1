package Empresa_agroalimentaria;

public class Producto {
	
	private int fecha_cad;
	private int lote;
	private int fecha_envasado;
	private String pais;
	
	public Producto(int fecha_cad, int lote, int fecha_envasado, String pais) {
		
		this.fecha_cad=fecha_cad;
		this.lote=lote;
		this.fecha_envasado=fecha_envasado;
		this.pais=pais;
		
	}

	public int getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(int fecha_cad) {
		this.fecha_cad = fecha_cad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getFecha_envasado() {
		return fecha_envasado;
	}

	public void setFecha_envasado(int fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Producto [fecha_cad=" + fecha_cad + ", lote=" + lote + ", fecha_envasado=" + fecha_envasado + ", pais="
				+ pais + "]";
	}
	
	
}
