package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import modelo.Privado;

public class Usuario_Privado {
	
	private int id_usuario;
	private int id_privado;
	static int key;
	public Usuario_Privado() {

	}
	
	public Usuario_Privado(int id_usuario) {
		super();
		this.id_usuario = id_usuario;
	}
	
	public Usuario_Privado(int id_usuario, int id_privado) {
		super();
		this.id_usuario = id_usuario;
		this.id_privado = id_privado;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_privado() {
		return id_privado;
	}

	public void setId_privado(int id_privado) {
		this.id_privado = id_privado;
	}
	
	public static int InsertarPrivado() {
	   	 
	       try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	        	  /* Statement pst = cn.createStatement();
	        	   pst.executeUpdate("INSERT INTO chat RETURNING id_chat",Statement.RETURN_GENERATED_KEYS);*/
	              PreparedStatement pst = cn.prepareStatement("INSERT INTO chat VALUES (DEFAULT) RETURNING id_chat",
	            		   ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	               //pst.executeUpdate();
	               ResultSet rs = pst.executeQuery();
	        	   //ResultSet rs = pst.getGeneratedKeys();
	               if ( rs.next() ) {
	                 key = rs.getInt(1);
	               }
	               
	               PreparedStatement priv = cn.prepareStatement("INSERT INTO privado VALUES (?)");
	               priv.setInt(1, key);
	               priv.executeUpdate();
	               
	               pst.close();
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return key;
	   }
	public static int BuscarUsuario(String usuari) {
		
		int id_usuraio = 0;
		
		String sentenciaSql = "SELECT id_usuario FROM usuario " +
	            "WHERE email = ? ";
	    
	    PreparedStatement sentencia = null;
	    ResultSet resultado = null;
	    
	    try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	
	        	   	sentencia = cn.prepareStatement(sentenciaSql);
	        	   	sentencia.setString(1, usuari);
	        	   	resultado = sentencia.executeQuery();
	        
	        	   	if(resultado.next()) {
	        	   		
	        	   		String id = resultado.getString("id_usuario");
	        	   		id_usuraio=Integer.parseInt(id);
	        	   	}else {
	    		
	        	   		JOptionPane.showMessageDialog( null, "Usuario no encontrado","ERROR", JOptionPane.ERROR_MESSAGE );
	        	   	}
	           }
	        } catch (SQLException ex) {
		           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		    }
	    return id_usuraio;
	}
public static String BuscarUsuarioPorId(int id) {
		
		String email = "";
		String sentenciaSql = "SELECT email  FROM usu_priv p, usuario u WHERE p.id_usuario=u.id_usuario AND p.id_usuario = ?";
	    
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
	
	public static void InsertarNuevoChatPrivado(Usuario_Privado chat ) {
		
		 int id_usu = chat.getId_usuario();
	   	 int id_privado = chat.getId_privado();
	   	 

	       try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	               PreparedStatement pst = cn.prepareStatement("INSERT INTO usu_priv (id_usuario, id_privado) VALUES (?,?)");
	               pst.setInt(1, id_usu);
	               pst.setInt(2, id_privado);
	               pst.executeUpdate();
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	       }

	   }
}
