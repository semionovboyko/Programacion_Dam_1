package Proyecto_Hacha.proyecto_hacha;
import java.util.*;
import java.io.*;
public class Menu {
	public static String ruta;
	public static String destino;
	public static String nombre;
	public static int opcion;
   
    public static long numtrozos;
    public static double medida;
    public static long size;
    public static double tamany;
    
	Scanner sc = new Scanner(System.in);
	public Menu() {
		
	}
	
	public void Menu() throws IOException {
		/*ruta ="C:\\Users\\cursodam\\Desktop\\Hacha\\foto.png";
        nombre = "copia";
        destino = "C:\\Users\\cursodam\\Desktop\\Hacha\\";
        numtrozos = 7;*/
        /*File fichero = new File(ruta);
        tamany = fichero.length();
        size = fichero.length()/numtrozos;*/ // tamaño de cada parte
   
        
        
     
        System.out.println("Indique la ruta del archivo: ");
        ruta = sc.nextLine();
        System.out.println("Indique la ruta donde desea guardar el archivo: ");
      
        String destino = sc.nextLine();
        
        System.out.println("Indique el nombre de las partes troceadas ");
        String nombre = sc.nextLine();
        
        System.out.println("Indique el numero de partes que desea crear");
         numtrozos = sc.nextInt();
         
         File fichero = new File(ruta);
         tamany = fichero.length();
         size = fichero.length()/numtrozos; // tamaño de cada parte
        
		
	    
        boolean salir = false;
       //Guardaremos la opcion del usuario
         
        while(!salir){
             
            System.out.println("1. Separar el fichero y generar XML ");
            System.out.println("2. Unir fichero ");
            System.out.println("3. Salir");
             
            System.out.println("Elija una de las opciones ");
            opcion = sc.nextInt();
        	switch(opcion){
    		case 1:    Separar se = new Separar(ruta,nombre,destino,numtrozos, fichero);
            			se.dividr(numtrozos,destino,fichero,nombre,size);
            			CrearXml xml = new CrearXml(numtrozos, destino, tamany);
    					xml.crearXml(numtrozos,destino,tamany);

            			break;
    		case 2:     
    					
    					UnirArchivo un = new UnirArchivo();
    			 		un.unir(numtrozos, fichero, destino, size, nombre);
    					
    					break;

    		case 3:
                		salir=true;
                		break;
    			 		
    		}
             
        }
		
	
		System.out.println("Compruebe su carpeta de destino. ");
		
	}

}
