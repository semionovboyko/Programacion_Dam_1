package Proyecto_Hacha.proyecto_hacha;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnirArchivo {
	int char1;
	public static BufferedInputStream leer = null;
	public BufferedOutputStream escribir = null;

	public UnirArchivo() {

	}

	public void unir(double numtrozos, File fichero, String destino, double size, String nombre) throws IOException {

		escribir = new BufferedOutputStream(new FileOutputStream(destino + "Unido" + ".png"));

		for (int i = 0; i < numtrozos; i++) {

			leer = new BufferedInputStream(new FileInputStream(destino + nombre + (i+1) + ".png"));
			char1 = leer.read();
			for (int j = 0; j < size; j++) { // se recorre 1 vez por cada byte del tamaño de size
				if (char1 != -1) {

					escribir.write(char1);

					char1 = leer.read();
				}

			}

		}

		
		escribir.close();
		leer.close();

	}

}
