package ejercicios;

public class consumo {
	
	private double Kms, litros, vMed, Pgas;
	
	public consumo(double k, double l, double v, double p) {
		Kms=k;
		litros=l;
		vMed=v;
		Pgas=p;
	}
	
	public double getTiempo() {
		
		double tiempo = Kms * vMed;
		return tiempo;
	}

	public void setKms(double kms) {
		Kms = kms;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void setvMed(double vMed) {
		this.vMed = vMed;
	}

	public void setPgas(double pgas) {
		Pgas = pgas;
	}
	
	public double consumoMedio() {
		double consMedio= 0;
		if ( Kms == 100)
			consMedio= (litros * 100)/Kms; 
		return consMedio;
		
	}
	
	public double consumoEuros() {
		double consEuros= 0;
		if( Kms == 100 )
			consEuros= (Pgas * 100)/Kms;
		return consEuros;
	}
	
	
}
