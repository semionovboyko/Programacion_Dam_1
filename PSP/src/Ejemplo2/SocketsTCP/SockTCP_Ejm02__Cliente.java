package Ejemplo2.SocketsTCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Simple client that sends only text lines to the
 * server and reads the ones coming from it.
 * @author ...
 * @mailto ...
*/

public class SockTCP_Ejm02__Cliente {
  public static void main(String[] args) throws Exception {
	//When passing null to getByName, localhost is generated
	InetAddress addr = InetAddress.getByName(null);
	//Otherwise, these can be used for the same purpose
	//InetAddress addr = InetAddress.getByName("127.0.0.1");
	//InetAddress addr = InetAddress.getByName("localhost");
	System.out.println("addr = " + addr);
	Socket socket = new Socket(addr, SockTCP_Ejm02_Servidor.PORT);
	
	//Put everything inside a try-finally to make sure the socket gets
	//closed:
	try {
	  System.out.println("socket = " + socket);
	  BufferedReader input = new BufferedReader(  
		new InputStreamReader(
			socket.getInputStream()));
	  //The output is emptied automatically by the PrintWriter
	  PrintWriter output = new PrintWriter(new BufferedWriter(
		new OutputStreamWriter(
			socket.getOutputStream())), true);
	  for (int i = 0; i < 10; i++) {
	    output.println("Message " + i);
		String str = input.readLine();
		System.out.println(str);
	  }
	  output.println("END");
	} finally {
		System.out.println("Closing...");
		socket.close();
	}
  }
}