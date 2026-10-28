package Educacion;
import java.util.Scanner;

public class CentroTexto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce que deseas estudiar:");
		String quieroEstudiar = tec.nextLine();
		System.out.println(Estudios.queCentroTeToca(quieroEstudiar));
	}

}
