package modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sms {
	
	private String tipo_sms;
	private String contenido;
	private String fecha;
	private int id_usuario;
	

	public Sms() {
	
	}
	
	public Sms( String tipo_sms, String contenido, String fecha, int id_usuario) {
		super();
		this.tipo_sms = tipo_sms;
		this.contenido = contenido;
		this.fecha = fecha;
		this.id_usuario = id_usuario;
	}


	public String getTipo_sms() {
		return tipo_sms;
	}

	public void setTipo_sms(String tipo_sms) {
		this.tipo_sms = tipo_sms;
	}


	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	
	
}
