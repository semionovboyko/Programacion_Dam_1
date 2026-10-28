package modelo;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import modelo.Conexion;

public class Usuario {
	
	
	private String email;
	private String contraseña;
	private String estado;
	private String apodo;
	
	public Usuario(){
		
		this.email = "";
		this.contraseña = "";
		this.estado = "";
		this.apodo = "";
	}
	
	public Usuario( String email, String contraseña, String estado, String apodo) {
		super();
	
		this.email = email;
		this.contraseña = contraseña;
		this.estado = estado;
		this.apodo = apodo;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
	
	public static void InsertarDatosUsuario(Usuario usu) {
		
   	 String email = usu.getEmail();
   	 String contraseña = usu.getContraseña();
   	 String estado = usu.getEstado();
   	 String apodo = usu.getApodo();
  
       try {
    	   Conexion mysql = new Conexion();
           Connection cn= mysql.Conectar();
    	 
           if (cn == null) {
               System.out.println("Conexión nula");
           } else {
               PreparedStatement pst = cn.prepareStatement("INSERT INTO usuario (email, contraseña, estado, apodo) VALUES (?,?,?,?)");
               pst.setString(1, email);
               pst.setObject(2, contraseña.hashCode());
               pst.setString(3, estado); 
               pst.setString(4, apodo);
               pst.executeUpdate();
           }

       } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }

   }
	
	public static boolean cargarUsuario(String ema, String password) {
		
		Conexion mysql = new Conexion();
        Connection cn= mysql.Conectar();
   
        
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        
        boolean correcto = true;
        
        try {
            sentencia = cn.prepareStatement("SELECT * FROM usuario WHERE email = ? AND contraseña = ?");
        	sentencia.setString(1, ema);
        	sentencia.setString(2,password);//String.valueOf(password.hashCode()
        	resultado = sentencia.executeQuery();
            
        	if(!resultado.next() ) {
          	  JOptionPane.showMessageDialog( null, "Usuario o contraseña erronea","ERROR", JOptionPane.ERROR_MESSAGE );
             correcto = false;
        	}
        	
        } catch (SQLException sqle) {
        	  sqle.printStackTrace();
        	} finally {
        	  if (sentencia != null)
        	    try {
        	      sentencia.close();
        	      resultado.close();
        	    } catch (SQLException sqle) {
        	      sqle.printStackTrace();

        	    }
        	}
	return correcto;
	}
}
