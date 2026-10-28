package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Privado {
	
	private int id_chat;

	
	public Privado() {
		
		
	}
	
	
	public Privado(int id_chat) {
		super();
		this.id_chat = id_chat;
		
	}


	public int getId_chat() {
		return id_chat;
	}


	public void setId_chat(int id_chat) {
		this.id_chat = id_chat;
	}


	

}
