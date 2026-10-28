package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario_Grupo {
	
	private int id_usuario;
	private int id_grupo;
	private String nombre_grupo;
	
	public Usuario_Grupo() {
	}
	
	public Usuario_Grupo(String nombre_grupo) {
		super();
		this.nombre_grupo = nombre_grupo;
	}
	
	public Usuario_Grupo(String nombre_grupo, int id_grupo) {
		super();
		this.nombre_grupo = nombre_grupo;
		this.id_grupo = id_grupo;
	}
	
	public Usuario_Grupo(int id_usuario, int id_grupo) {
		super();
		this.id_usuario = id_usuario;
		this.id_grupo = id_grupo;
	}
	
	
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public int getId_grupo() {
		return id_grupo;
	}
	
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}

	
	
	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public static void InsertarNuevoChatPrivado(ArrayList<String> id_usu, int id_grupo) {

		
		PreparedStatement sentencia = null;
		try {
			 Conexion mysql = new Conexion();
	         Connection cn= mysql.Conectar();
		
		  //Inicia transacción
		  cn.setAutoCommit(false);
		  for (int i = 0; i<id_usu.size();i++) {
			  int id_usuario =Integer.parseInt(id_usu.get(i));
			  sentencia = cn.prepareStatement("INSERT INTO usu_priv (id_usuario, id_grupo) VALUES (?,?)");
			  sentencia.setInt(1, id_usuario);
			  sentencia.setInt(2, id_grupo);
			  sentencia.executeUpdate();
		  }
		  // Valida la transacción
		  cn.commit();
		} catch (SQLException sqle) {
		  sqle.printStackTrace();
		} finally {
		  if (sentencia != null)
		    try {
		      sentencia.close();
		     
		    } catch (SQLException sqle) {
		      sqle.printStackTrace();
		    }
		}
	}
	

}

