package Funciones;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

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
import org.w3c.dom.Element;
public class crearXML {

  public static void XML (String nombre, long tamaño, int partes, String ubi,File r) throws IOException {
	  //en esta fucnion le paso el nombre original del fichero el tamaño  las partes la ubicación
	    try {
	    	String tamaño1 = Long.toString(tamaño);	
	    	String partes1 = Integer.toString(partes);	
	    	
	    	
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	        //Elemento raíz
	        Document doc = docBuilder.newDocument();
	        Element rootElement = doc.createElement("INFO_fichero");
	        doc.appendChild(rootElement);
	        //Primer elemento
	        
	        Element elemento1 = doc.createElement("información");
	        rootElement.appendChild(elemento1);
	        
	        //Se agrega un atributo al nodo elemento y su valor
	        Attr attr = doc.createAttribute("nombre");
	          attr.setValue(nombre);
	          elemento1.setAttributeNode(attr);
	    
	        
	        Element tamaño_original= doc.createElement("tamaño_original");
	        tamaño_original.setTextContent(tamaño1+" BYTES");
	        rootElement.appendChild(tamaño_original);
	        
	        Element Ubicación= doc.createElement("Ubicación");
	        Ubicación.setTextContent(ubi);
	        rootElement.appendChild(Ubicación);
	        
	        Element N_partes= doc.createElement("N_partes");
	        N_partes.setTextContent(partes1);
	        rootElement.appendChild(N_partes);
	        
	        
	        
	        //Se escribe el contenido del XML en un archivo
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(r);
	        transformer.transform(source, result);
	      } catch (ParserConfigurationException pce) {
	        pce.printStackTrace();
	      } catch (TransformerException tfe) {
	        tfe.printStackTrace();
	      } 
	  
	  
	  
	  
	  
	  
}
} 
  
  
  
  
  
  
  
  