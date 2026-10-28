package Ejemplo1.TCP;

import java.io.*;
import java.net.*;

public class TCP_EJ01_Cliente {
  public static void main(String[] args) throws Exception {
	String Host = "localhost";
	int Puerto =  6000; //puerto remoto
	
	System.out.println("PROGRAMA CLIENTE INICIADO.....");
	Socket Cliente = new Socket (Host, Puerto);
	
	//CREO FLUJO DE SALIDA AL SERVIDOR
	DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
	
	//ENVÍO UN SALUDO AL SERVIDOR
	flujoSalida.writeUTF("Saludos al SERVIDOR DESDE EL CLIENTE;");
	
	//CREO FLUJO DE ENTRADA AL SERVIDOR
	DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
	
	//EL SERVIDOR ME ENVÍA UN MENSAJE
	System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());
	
	//CERRAR STREAMS Y SOCKETS
	flujoEntrada.close();
	flujoSalida.close();
	Cliente.close();
	
  }// main
}// TCP_EJ01_Cliente

/*
try {
  Socket clientSocket = new Socket();
  InetSocketAddress addr = new InetSocketAddress("localhost",5555);
  clientSocket.connect(addr);
  InputStream is = clientSocket.getInputStream();
  OutputStream os = clientSocket.getOutputStream();
  String mensaje = "mensaje desde el cliente";
  os.write(mensaje.getBytes());
  clientSocket.close();

} catch (IOException e) {
	e.printStackTrace();
}
*/
