package modelo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaMensajes implements Serializable {
	private ArrayList<Sms> listaSms;

	public ListaMensajes() {
		listaSms = new ArrayList<>();
	}

	public Sms getSms(int u) {
		return listaSms.get(u);
	}

	public void setSms(Sms men) {
		listaSms.add(men);
	}
	
	 public int longitud (){
	    return listaSms.size();
	}
	 
	 public void eliminar (int u) {
	    listaSms.remove(u);     
	}
	 
	 public static ListaMensajes BuscarMisSms(int id_chat) {
		 ListaMensajes listaSms= new ListaMensajes();
			
		       try {
		    	   Conexion mysql = new Conexion();
		           Connection cn= mysql.Conectar();
		    	 
		           if (cn == null) {
		               System.out.println("Conexión nula");
		           } else {
		               PreparedStatement s = cn.prepareStatement("SELECT * FROM sms NATURAL JOIN usu_sms_chat WHERE id_chat = ?");
		               s.setInt(1,id_chat);
		               ResultSet rs = s.executeQuery();
		               
		               
		               while (rs.next()){
				             String tipo = rs.getString("tipo_sms");
				             String contenido = rs.getString("contenido");
				             String fecha = rs.getString("fecha");
				             int id_usuario = rs.getInt("id_usuario");
				             Sms up = new Sms(tipo,contenido,fecha,id_usuario);
				             listaSms.setSms(up);
				       }
		           }
		       } catch (SQLException ex) {
		           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		       }
		      return listaSms;
		}
	 
	 
	 
	 @Override
	public String toString() {
		return "ListaMensajes " + getSms(0).getContenido();
	}

	public static void main (String []args) {
		
	}
		
}
