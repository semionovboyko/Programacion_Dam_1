package Funciones;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;



public class leerXML {
 
	public static String leexml (String d) throws IOException {
     String numeroPartes ="";
    	
    	 try {
    		 
    		 DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    		 Document xml = dBuilder.parse(d);
    		 String tamaño = xml.getElementsByTagName("N_partes").item(0).getTextContent();
    		numeroPartes = tamaño;
             
         } catch (Exception e) {
             e.printStackTrace();
         }
		return numeroPartes;
    	
    }}
