package ejercicio1a3;

public class Ejercicio3 {
	public static void asignaturasConAprobados(int[][] notas, String[] asig) {
		for (int j = 0; j < notas[0].length; j++) {
			boolean encAprobado = false;
			for (int i = 0; i < notas.length && !encAprobado; i++) {
				if(notas[i][j] >= 5){
					System.out.println(asig[j]);
					encAprobado = true;
				}
			}
		}
	}

	public static void main(String args[]) {
		int[][] notasPrimero = { { 4, 4, 4, 4, 4, 4 }, { 5, 4, 5, 2, 6, 2 }, { 4, 4, 5, 4, 4, 4 }, { 4, 4, 6, 4, 4, 4 },
				{ 4, 4, 7, 4, 4, 1 } };
		String[] asigPrimero = { "PRG", "BDA", "ED", "LMI", "FOL", "INGL" };

		// Deber�a mostrar 3 asignaturas: PRG, ED y FOL
		asignaturasConAprobados(notasPrimero, asigPrimero);
		System.out.println("=========================");

		int[][] notasSegundo = { { 1, 1, 2, 1, 1, 1 }, { 1, 1, 2, 1, 1, 1 }, { 1, 1, 6, 1, 1, 1 } };
		String[] asigSegundo = { "DI", "PSP", "AD", "EIE", "INGL" };
		// Deber�a mostrar 1 asignaturas: AD
		asignaturasConAprobados(notasSegundo, asigSegundo);
	}
}
