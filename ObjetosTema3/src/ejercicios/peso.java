package ejercicios;

public class peso {
	
	private double peso;
	
	public peso(double peso, String medida) {
		switch(medida) {
		case "Lb":
			this.peso = (0.453 * peso)/1;
			break;
		case "Li":
			this.peso = (14.59 * peso)/1;
			break;
		case "Oz":
			this.peso = (0.02835* peso)/1;
		case "P":
			this.peso =(0.00155 * peso)/1;
			break;
		case "K":
			this.peso = peso;
			break;
		case "G":
			this.peso = (1 * peso)/1000;
			break;
		case "Q":
			this.peso = (43.3 * peso )/ 1;
			break;
		}
	}
	
	@Override	
	public String toString() {
		return "tu cambio de peso es " + peso;
	}
		
	public double getLibras(){
		double libras;
		libras = (1 * peso)/0.453;
		return libras;
	}
	
	public double getLingotes(){
		double lingotes;
		lingotes = (1 * peso)/14.59;
		return lingotes;
	}
	
	public double getPeso(String medida) {
		
		switch(medida) {
		case "Lb":
			 peso = 0.453 * peso;
			 break;
		case "Li":
			 peso = 14.59 * peso;
			 break;
		case "Oz":
			 peso = 0.02835* peso;
			 break;
		case "P":
			 peso =0.00155 * peso;
			 break;
		case "K":
			 peso = peso;
			 break;
		case "G":
			 peso = 1 * peso;
			 break;
		case "Q":
			 peso = 43.3 * peso;
			 break;
		}
		return peso;
		
	}
	
	public static void main (String[] args) {
		
		peso cambio1 = new peso(154, "Q");
		System.out.println(cambio1.toString());
		
		peso cambio2 = new peso(10, "K");
		System.out.println(cambio2.toString());
		System.out.println(cambio2.getPeso("Li"));
		peso cambio3 = new peso(10, "K");
		System.out.println(cambio3.getLibras());
	}


}
