package Empresa_agroalimentaria;

public class test {
	
	public static void main (String [] args) {
		
		ProductoFresco sandia= new ProductoFresco(2022, 10012, 7, "Spain");
		ProductoFresco uva= new ProductoFresco(2022, 10012, 7, "Spain");
		
		ProductoRefrigerados yogur= new ProductoRefrigerados(2022, 10012, 7, "Spain", 3, 34);
		ProductoRefrigerados carne= new ProductoRefrigerados(2022, 10012, 7, "Spain", 4, 45);
		
		CongAGUA hielo = new CongAGUA(2024, 40012, 79, "Spain", 3, 34, 34);
		CongAGUA helado = new CongAGUA(2042, 10012, 7, "Spain", 7, 34, 777);
		CongAIRE lacteos = new CongAIRE(202254, 10012, 7, "Spain", 3, 344, 4,5,6,7);
		CongAIRE huevos = new CongAIRE(2066, 10012, 7, "Spain", 3, 34, 5,6,7,8);
		CongNITROGENO cebolla = new CongNITROGENO(2222, 10012, 7, "Spain", 3, 34);
		
		System.out.println(sandia);
		System.out.println(uva);
		System.out.println(yogur);
		System.out.println(carne);
		System.out.println(hielo);
		System.out.println(helado);
		System.out.println(lacteos);
		System.out.println(huevos);
		System.out.println(cebolla);
	}

}
