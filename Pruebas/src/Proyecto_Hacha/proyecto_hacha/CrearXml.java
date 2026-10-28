package Proyecto_Hacha.proyecto_hacha;

import java.io.*;
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

public class CrearXml {
	public CrearXml(double numtrozos,String destino, double tamany) {
		
	}
	public void crearXml(double numtrozos,String destino, double tamany){
		
		String trozos = Double.toString(numtrozos);
		String tamañoOriginal = Double.toString(tamany);
		
	
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// Elemento raíz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("root");
			doc.appendChild(rootElement);
			// Primer elemento
			Element elemento1 = doc.createElement("Numero_de_trozos");
			rootElement.appendChild(elemento1);
			// Se agrega un atributo al nodo elemento y su valor
			Attr attr = doc.createAttribute("id");
			attr.setValue(trozos);
			elemento1.setAttributeNode(attr);
			
			Element elemento2 = doc.createElement("Tamany");
			elemento2.setTextContent(tamañoOriginal);
			rootElement.appendChild(elemento2);
			// Se escribe el contenido del XML en un archivo
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(destino+"info.xml"));
			transformer.transform(source, result);
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	
}
}

	
	