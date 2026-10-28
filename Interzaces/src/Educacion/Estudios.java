package Educacion;

public class Estudios {
	
	public static String queCentroTeToca(String quieroEstudiar) {
		String centro = "";
		
		if(quieroEstudiar.equals("Informatica")) {
			centro = "IES El Grao";
		}else {
			centro = "Otros";
		}
		return centro;
	}

}
