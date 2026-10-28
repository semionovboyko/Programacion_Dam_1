 package Funciones;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dividir {
	
	public static void splitFile (File f, int a,File o) throws IOException {

		//F fichero a partes a numero de partes y o destino
		int partes= 1;
		int contpartes =a;
		int size = (int) f.length()/contpartes;
		int resto = (int) f.length()%contpartes;
		
		byte [] buffer = new byte[size+resto];
	
		
		
		String filename = f.getName();
		
		try (FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			int CANTIDADBYTES = 0;
			while ((CANTIDADBYTES = bis.read(buffer)) > 0) {
				String filepartname = String.format("%s.%03d", filename, partes++);
				File nuevo = new File (o,filepartname);
				
				 try (FileOutputStream out = new FileOutputStream(nuevo)) {
	                 out.write(buffer, 0, CANTIDADBYTES);
	             }
			}
			
		}
		
		
	}
}
