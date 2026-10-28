package ProyectoFichero;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ListadoDirectorio {
	
	public static void main (String []args) throws IOException{
		
		String ruta ="resultadoAlexey1";
		if(args.length>=1) ruta = args[0];
		
		File fich = new File (ruta);
		
		if(fich.exists()) {
			System.out.println("Existe");
			fich.delete();
			
		}else if(fich.isFile()){
			System.out.println("Es un fichero");
			
		}else {
			System.out.println("No existe");
			try {
				fich.createNewFile();
				System.out.println("Se ha creado el archivo");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		File [] archivos = new File [0];
	    FileInputStream leer;
	    FileOutputStream escribir;
		JFileChooser chooser = new JFileChooser();
	    File destino = new File("resultadoAlexey.png");
		chooser.setMultiSelectionEnabled(true);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    int seleccion = chooser.showOpenDialog(chooser);
	    if(seleccion == JFileChooser.APPROVE_OPTION) {
	    	File[] ficheros = chooser.getSelectedFiles();
	    	archivos = ficheros;
	    	for(int a=0;archivos.length>a;a++) {
	    		escribir = new FileOutputStream(destino);
	    		for (int i = 0; i < archivos.length; i++) {
	    	    	int char1 = 0;
	    	    	  leer = new FileInputStream(archivos[i]);
	    	    	  char1 = leer.read();
	    	    	  
	    	    	  while(char1 != -1){          
	    	    		  escribir.write(char1);
	    	    		  char1 = leer.read();
	    	    		  }
	    	    }
	    		escribir.close();
	    	}
	    }
	    System.out.println("Unido");
		
	
	 Scanner sc = new Scanner(System.in);
	 File fileInicial = new File("resultadoAlexey.png");
	 File fileFinal = null;
	 
	 
	 int n =0;
	 byte [] buffer = new byte[(int) fileInicial.length()/2];
	 
	 String nombreArchivo = fileInicial.getName();
	 
	 try(FileInputStream fis = new FileInputStream(fileInicial);
			 BufferedInputStream bis = new BufferedInputStream(fis)){
		 int bytes = 0;
		 while((bytes = bis.read(buffer))>0) {
			 String archivoPartNombrado = String.format("%s.%03d", "resultadoAlexey", n++);
			 File nuevoFile = new File(fileFinal,archivoPartNombrado+".png");
			 
			 try(FileOutputStream fos = new FileOutputStream(nuevoFile)){
				 fos.write(buffer, 0, bytes);
			 }
		 }
	 }
	}
}
