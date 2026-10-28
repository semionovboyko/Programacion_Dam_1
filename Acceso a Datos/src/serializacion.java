import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializacion {
	
	public static void main(String[] args){

			Producto e = new Producto();
            e.nombre = "KinderSorpresa";
            e.tipo = "Alimento";
            e.codigoBarras = 29087695;
            e.numero = 333;

            try
            {
                    FileOutputStream archivo = new
                                    FileOutputStream("Producto.ser");
                    ObjectOutputStream salida = new
                                    ObjectOutputStream(archivo);
                    salida.writeObject(e);
                    salida.close();
                    archivo.close();
                    System.out.println("Datos guardados en productos.ser");
            }
            catch (IOException i)
            {
                    i.printStackTrace();
            }
    }

}
