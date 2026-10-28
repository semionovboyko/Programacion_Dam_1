package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Usuario_Sms_Chat {
	
	private static int id_usu;
	private static int id_sms;
	private static int id_chat;
	

	
	public Usuario_Sms_Chat() {
		
	}
	
	
	public Usuario_Sms_Chat(int id_usu, int id_sms, int id_chat) {
		super();
		this.id_usu = id_usu;
		this.id_sms = id_sms;
		this.id_chat = id_chat;
	}

	public int getId_usu() {
		return id_usu;
	}

	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}

	public int getId_sms() {
		return id_sms;
	}

	public void setId_sms(int id_sms) {
		this.id_sms = id_sms;
	}

	public int getId_chat() {
		return id_chat;
	}

	public void setId_chat(int id_chat) {
		this.id_chat = id_chat;
	}
	
	
	public static int InsertarMensaje(Sms mensaje) {
		
	   	 String tipo = mensaje.getTipo_sms();
	   	 String contenido = mensaje.getContenido();
	   	 java.sql.Date sqlDate = new java.sql.Date(0L);
	  
	   	 int key = 0;
	       try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	               PreparedStatement pst = cn.prepareStatement("INSERT INTO sms ( tipo_sms, contenido, fecha) VALUES (?,?,?) RETURNING id_sms",
	            		   ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	               pst.setString(1, tipo);
	               pst.setString(2, contenido); 
	               pst.setDate(3, sqlDate); 
	               //pst.executeUpdate();
	               ResultSet rs = pst.executeQuery();
	               if ( rs.next() ) {
	                 key = rs.getInt(1);

	               }
	              pst.close();
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	       }
		return key;
	   }

	public static void InsertarUsu_sms_chat(Usuario_Sms_Chat ususmschat) {
		
		 int idusu = ususmschat.getId_usu();
		 int idsms = ususmschat.getId_sms();
		 int idchat = ususmschat.getId_chat();
		 
	       try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	               PreparedStatement pst = cn.prepareStatement("INSERT INTO usu_sms_chat (id_usuario, id_sms, id_chat) VALUES (?,?,?)");
	               pst.setInt(1, idusu);
	               pst.setInt(2, idsms);
	               pst.setInt(3, idchat); 
	           
	               pst.executeUpdate();
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "", ex);
	       }

	   }
	
public static String BuscarMisMensajes(int id) {
		
		String email = "";
		String sentenciaSql = "SELECT * FROM usu_sms_chat WHERE id_usuario = ?";
	    
	    PreparedStatement sentencia = null;
	    ResultSet resultado = null;
	    
	    try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	
	        	   	sentencia = cn.prepareStatement(sentenciaSql);
	        	   	sentencia.setInt(1, id);
	        	   	resultado = sentencia.executeQuery();
	        
	        	   	if(resultado.next()) {
	        	   		
	        	   		email = resultado.getString("email");
	        	   		
	        	   	}else {
	    		
	        	   		JOptionPane.showMessageDialog( null, "Usuario no encontrado","ERROR", JOptionPane.ERROR_MESSAGE );
	        	   	}
	           }
	        } catch (SQLException ex) {
		           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		    }
	    return email;
	}
}
