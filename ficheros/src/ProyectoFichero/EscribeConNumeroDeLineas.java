package ProyectoFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EscribeConNumeroDeLineas {
	public static void main(String[]args) {
		
		String nomFich = "textoO.txt";
		
		try(BufferedReader fbr = new BufferedReader(new FileReader(nomFich))){
			int i = 0;
			String linea = fbr.readLine();
			while(linea != null) {
				System.out.format("[%1d] %s", i++, linea);
				System.out.println();
				linea = fbr.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
