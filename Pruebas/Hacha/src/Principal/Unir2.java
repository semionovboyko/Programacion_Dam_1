package Principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Unir2 {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		File [] archivos = new File [0];
	    FileInputStream leer;
	    FileOutputStream escribir;
	    String rutaFinal = "C:\\Users\\cursodam\\eclipse-workspace\\Hacha";
	    String nombre = "\\holaUnido.txt"; 
		JFileChooser chooser = new JFileChooser();
	    File destino = new File(rutaFinal+nombre);
		//Hacemos que el JFileChooser pueda seleccionar más de un archivo, de esta manera podemos unir los archivos partidos
		chooser.setMultiSelectionEnabled(true);
		//Aclaramos que el JFileChooser solo pueda coger archivos y no directorios.
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
	    
	    /*String numeroPartes ="";
    	String d = "unidoxml.xml";
   		 
   		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
   		Document xml = dBuilder.parse(d);
   		String tamaño = xml.getElementsByTagName("N_partes").item(0).getTextContent();
   		numeroPartes = tamaño;
         
   		System.out.println(numeroPartes);*/
	}

}
