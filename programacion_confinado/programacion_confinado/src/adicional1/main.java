package adicional1;

public class main {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		
		v1.solicitarTamanyo();
		v1.asignarDatos();
		v1.mostrar();
		System.out.println("");
		v1.insertar(2, 32);
		v1.mostrar();
		
		//System.out.println("El valor máximo es: " + v1.maximo());
		//System.out.println("El valor mínimo es: " + v1.minimo());
	}

}
