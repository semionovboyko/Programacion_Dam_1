package ProyectoFichero;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class leerFile {
	
	 static int char1;
	 int char2;
     static Scanner tec= new Scanner (System.in);
     static BufferedInputStream leer = null;
     static BufferedOutputStream escribir = null;
     static int partes, bitsFal;
     static int longitud=(int) new File("textoO.txt").length();
     
     public static int partes() {
    	 System.out.println("Cuantas partes lo quieres dividir: ");
  	     int num = tec.nextInt();
    	 return num;
     }
     
     public static void separar() throws FileNotFoundException, IOException {	
 		
 		leer =new BufferedInputStream( new FileInputStream("textoO.txt"));
 	    char1 = leer.read();
 	      
 	    int numero = partes();
 	    partes = longitud/numero;
 		bitsFal = longitud%numero;
 		  
 		  
 		  try {
 		      DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
 		      DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
 		      //Elemento raíz
 		      Document doc = docBuilder.newDocument();
 		      Element rootElement = doc.createElement("archivo");
 		      doc.appendChild(rootElement);
 		     
 		      Element elemento3 = doc.createElement("numero");
 		      elemento3.setTextContent(Integer.toString(numero));
 		      rootElement.appendChild(elemento3);
 		      
 		      
 		      //Primer elemento
 		      Element elemento1 = doc.createElement("bitXpartes");
 		      elemento1.setTextContent(Integer.toString(partes));
 		      rootElement.appendChild(elemento1);
 		      
 		      Element elemento4 = doc.createElement("bitsFALTAN");
 		      elemento4.setTextContent(Integer.toString(bitsFal));
 		      rootElement.appendChild(elemento4);
 		      
 		      Element elemento2 = doc.createElement("longitud");
 		      elemento2.setTextContent(Integer.toString(longitud));
 		      rootElement.appendChild(elemento2);
 		      
 		      //Se escribe el contenido del XML en un archivo
 		      TransformerFactory transformerFactory = TransformerFactory.newInstance();
 		      Transformer transformer = transformerFactory.newTransformer();
 		      DOMSource source = new DOMSource(doc);
 		      StreamResult result = new StreamResult(new File("C:\\Users\\Alexe\\Documents\\programacion\\ficheros/prueba.xml"));
 		      transformer.transform(source, result);
 		    } catch (ParserConfigurationException pce) {
 		      pce.printStackTrace();
 		    } catch (TransformerException tfe) {
 		      tfe.printStackTrace();
 		    }
 				  int contador =0;  
 				  for(int i =0; i <numero ; i++) {
 					  escribir = new BufferedOutputStream(new FileOutputStream("copia"+ contador +".txt"));
 			    	 
 			    	 for (int j = 0; j <= partes; j++ ) { 
 			    		 char1 = leer.read();
 			    		 escribir.write(char1);
 			    	
 			    	  }
 			    	  escribir.close();
 			    	  contador++;
 		    		 
 			      }
 			         leer.close();
 		}
     
     public static void unir() throws IOException {
    	
    	int numero = partes();
  	    partes = longitud/numero;
  		bitsFal = longitud%numero;

 		escribir = new BufferedOutputStream(new FileOutputStream("todasCopias.txt"));

 		for (int i = 0; i < numero; i++) {

 			leer = new BufferedInputStream(new FileInputStream("copia"+ i + ".txt"));
 			char1 = leer.read();
 			for (int j = 0; j < partes; j++) { 
 				if (char1 != -1) {
 					
 					escribir.write(char1);
 					char1 = leer.read();
 				}

 			}

 		}

 		
 		escribir.close();
 		leer.close();

 	}


	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("Que deseas hacer:");
		System.out.println("1.-Separa archivo\n"+"2.-Unir archivos\n"+"3.-Salir\n");
		int opcion = tec.nextInt();
		
		switch(opcion) {
		case 1:
			separar();
			break;
		case 2:
			unir();
			break;
		case 3:
			break;
		}
		
	           
	}  
	
	
}


