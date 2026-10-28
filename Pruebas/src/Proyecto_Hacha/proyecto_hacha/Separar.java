package Proyecto_Hacha.proyecto_hacha;

import java.io.*;
public class Separar  {
	int char1;
	int contador = 1;
	public static BufferedInputStream leer = null; 
	public BufferedOutputStream escribir = null;
	

	


	public Separar(String ruta, String nombre, String destino, double numtrozos, File fichero) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		leer = new BufferedInputStream(new FileInputStream(fichero));
	}

	public void dividr(double numtrozos, String destino, File fichero, String nombre,  double size) throws IOException{
		


	       
		 
			char1 = leer.read();
	
		    for (int i = 0; i < numtrozos; i++) { // para dividir el archivo en n partes
		        
					escribir = new BufferedOutputStream(new FileOutputStream(destino+nombre+contador+".png"));
					
				
		        for (int j = 0; j < size; j++) { //se recorre 1 vez por cada byte del tamaño de size
		            if(char1 != -1) {
		               
							escribir.write(char1);
					
		               
							char1 = leer.read();
						} 
		            else
		            	break;

		            }
		        escribir.close();
		        contador++;
		        }
		        
					
		    	leer.close();
		        
		       
		    }
		  
			

		
	}


