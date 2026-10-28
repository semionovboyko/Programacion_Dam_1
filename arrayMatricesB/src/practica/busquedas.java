package practica;

public class busquedas {
	static double abril[] = {2.2 ,2.5, 1, 4, 3.4,0,12};
	
	public static int primerDiaSinLluvia(double[]lluvia) {
		int i=0;
		boolean encontrado= false;
		while(i<lluvia.length && !encontrado) {
			if(lluvia[i]==0)
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else 
			return -1;
	}
	
	public static int queDiaSinLluvia(double[]lluvia) {
		int i=0;
		while(i<lluvia.length && lluvia[i]!=0)
			i++;
		if(i==lluvia.length)
			return -1;
		else
			return i;
		
	}
	
	public static void main(String []args) {
		System.out.println(primerDiaSinLluvia(abril));
		System.out.println(queDiaSinLluvia(abril));
	}

}
