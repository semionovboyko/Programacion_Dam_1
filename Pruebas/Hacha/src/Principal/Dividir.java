package Principal;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;

public class Dividir{
	 @SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ParserConfigurationException, TransformerException, SAXException {
		 Scanner sc = new Scanner(System.in);
		 File fileInicial = new File("hola.txt");
		 File fileFinal = null;
		 
		 System.out.println("En cuántas partes quieres dividir el archivo");
		 int a = sc.nextInt();
		 int n = 1;
		 int npartes = a;
		 int size = (int) fileInicial.length()/npartes;
		 int resto = (int) fileInicial.length()%npartes;
		 
		 byte [] buffer = new byte[size+resto];
		 
		 String nombreArchivo = fileInicial.getName();
		 
		 try(FileInputStream fis = new FileInputStream(fileInicial);
				 BufferedInputStream bis = new BufferedInputStream(fis)){
			 int bytes = 0;
			 while((bytes = bis.read(buffer))>0) {
				 String archivoPartNombrado = String.format("%s.%03d", nombreArchivo, n++);
				 File nuevoFile = new File(fileFinal,archivoPartNombrado);
				 
				 try(FileOutputStream fos = new FileOutputStream(nuevoFile)){
					 fos.write(buffer, 0, bytes);
				 }
			 }
		 }
		 long tamaño = fileInicial.length();
		 String nombre = fileInicial.getName();
		 File documentoXML = new File("hola.xml");
		 String ubicacion = documentoXML.getAbsolutePath();
		 
			 String tamaño1 = Long.toString(tamaño);
			 String fragmentos = Integer.toString(npartes);
			 
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 
			 Document documento = db.newDocument();
			 Element elemento = documento.createElement("Info_Fichero");
			 documento.appendChild(elemento);
			 
			 Attr atributo = documento.createAttribute("Nombre");
			 atributo.setValue(nombre);
			 elemento.setAttributeNode(atributo);
			 
			 Element tamaño_original= documento.createElement("Tamaño_Original");
		     tamaño_original.setTextContent(tamaño1+" BYTES");
		     elemento.appendChild(tamaño_original);
		        
		     Element Ubicación= documento.createElement("Ubicación");
		     Ubicación.setTextContent(ubicacion);
		     elemento.appendChild(Ubicación);
		        
		     Element N_fragmentos= documento.createElement("Num_Fragmentos");
		     N_fragmentos.setTextContent(fragmentos);
		     elemento.appendChild(N_fragmentos);
			 
		     TransformerFactory tf = TransformerFactory.newInstance();
		     Transformer transformer = tf.newTransformer();
		     DOMSource source = new DOMSource(documento);
		     StreamResult resultado = new StreamResult(documentoXML);
		     transformer.transform(source, resultado); 
		 
	}
}