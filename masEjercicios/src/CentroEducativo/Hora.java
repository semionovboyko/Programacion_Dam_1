package CentroEducativo;

public class Hora {
	
	private int hora;
	private int minutos;

	public Hora(int h, int min) {
		hora = h;
		minutos = min;
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Hora=" + hora + ":" + minutos ;
	}
	
}
