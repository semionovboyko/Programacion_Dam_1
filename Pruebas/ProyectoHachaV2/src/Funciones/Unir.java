package Funciones;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Unir {

	
	
	public static void UnirFicheros ( File[] files, File d ) throws IOException {
		
		
		int a;         
	    FileInputStream leer;
	    FileOutputStream escribir;
	    
	    
	    escribir = new FileOutputStream(d);
	    
	   
	    for (int i = 0; i < files.length; i++) {
	    	int char1 = 0;
	    	  leer = new FileInputStream(files[i]);
	    	  char1 = leer.read();
	    	  
	    	  while(char1 != -1){          
	    		  escribir.write(char1);
	    		  char1 = leer.read();
	    		  }
	    }
	  

			
	   escribir.close();
	    

	}
}
