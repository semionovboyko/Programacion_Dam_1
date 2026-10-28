package Ejemplo1.TCP;
import java.io.*;
import java.net.*;


public class TCP_EJ01_Servidor {
  public static void main(String[] args) throws IOException{
	int numeroPuerto = 6000; //puerto
	ServerSocket servidor = new ServerSocket(numeroPuerto);
	Socket clienteConectado = null;
	System.out.println("Esperando al cliente.....");
	clienteConectado = servidor.accept();
	
	//CREO FLUJO DE ENTRADA DEL CLIENTE
	InputStream entrada = null;
	entrada = clienteConectado.getInputStream();
	DataInputStream flujoEntrada = new DataInputStream(entrada);
	
	//EL CLIENTE ME ENVÍA UN MENSAJE
	System.out.println("Recibiendo del CLIENTE: \n\t"+ flujoEntrada.readUTF());
	
	//CREO FLUJO DE SALIDA AL CLIENTE
	OutputStream salida = null;
	salida = clienteConectado.getOutputStream();
	DataOutputStream flujoSalida = new DataOutputStream(salida);
	
	//ENVÍO UN SALUDO AL CLIENTE
	flujoSalida.writeUTF("Saludos al cliente del servidor");
	
	//CERRAR STREAMS Y SOCKETS
	entrada.close();
	flujoEntrada.close();
	salida.close();
	flujoSalida.close();
	clienteConectado.close();
	servidor.close();
  }// main
}// TCP_EJ01_Servidor
	
	/*
	try {
	  ServerSocket serverSocket = new ServerSocket();
	  InetSocketAddress addr = new InetSocketAddress("localhost",5555);
	  Socket newSocket =  serverSocket.accept();
	  InputStream is = newSocket.getInputStream();
	  OutputStream os = newSocket.getOutputStream();
	  byte[] mensaje = new byte[25];
	  is.read(mensaje);
	  
	  newSocket.close();
	  serverSocket.close();

	} catch (IOException e) {
		//System.out.println(e);
		e.printStackTrace();
	}
	*/
