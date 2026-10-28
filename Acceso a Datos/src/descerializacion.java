import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class descerializacion {
	
	public static void main(String[] args)
    {
            Producto e = null;
            try
            {
                    FileInputStream archivo = new
                                    FileInputStream("producto.ser");
                    ObjectInputStream entrada = new
                                    ObjectInputStream(archivo);
                    e = (Producto) entrada.readObject();
                    entrada.close();
                    archivo.close();
            }
            catch(IOException i)
            {
                    i.printStackTrace();
                    return;
            }
            catch(ClassNotFoundException c)
            {
                    System.out.println("Clase Producto no encontrada");
                    c.printStackTrace();
                    return;
            }

            System.out.println("Deserializando al producto...");
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Tipo: " + e.tipo);
            System.out.println("codigoBarras: " + e.codigoBarras);
            System.out.println("Numero: " + e.numero);
    }

}
