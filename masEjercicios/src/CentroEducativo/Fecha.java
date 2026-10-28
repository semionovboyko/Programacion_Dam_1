package CentroEducativo;

public class Fecha{
	
	private int dia;
	private int mes;
	private int anyo;

	public Fecha(int d,int m, int a) {
		dia = d;
		mes = m;
		anyo = a;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return  "Fecha=" + dia + "/" + mes + "/" + anyo ;
	}
	
	
}
