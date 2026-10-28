package adicional2;

public class main {

	public static void main(String[] args) {
		Matriz m1 = new Matriz();
		Matriz m2 = new Matriz();
		
		m1.solicitarTamanyo();
		m1.rellenarMatriz();
		m1.mostrarMatriz();
		
		m2.solicitarTamanyo();
		m2.rellenarMatriz();
		m2.mostrarMatriz();
		//m2.producto(m1);
		System.out.println("");
		//m2.mostrarMatriz();
		
		m1.mostrarMatriz();
		m1.producto(m2);
		//m1.mostrarMatriz();
		
		
		
		//System.out.println("El valor máximo es: " + m1.maximo());
		//System.out.println("El valor mínimo es: " + m1.minimo());
	}

}
