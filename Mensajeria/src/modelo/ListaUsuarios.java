package modelo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import modelo.Usuario_Privado;

public class ListaUsuarios implements Serializable {
	private ArrayList<Usuario_Privado> listaUsuarios;

	public ListaUsuarios() {
		listaUsuarios = new ArrayList<>();
	}

	public Usuario_Privado getUsuarios_Privado(int u) {
		return listaUsuarios.get(u);
	}

	public void setUsuario_Privado(Usuario_Privado usu) {
		listaUsuarios.add(usu);
	}
	
	 public int longitud (){
	    return listaUsuarios.size();
	}
	 
	 public void eliminar (int u) {
	    listaUsuarios.remove(u);     
	}
	 
	 /*public ListaUsuarios SeleccionarPrivados(String u) {
	        
	        PreparedStatement st;
	        ResultSet rs = null;
	        ListaUsuarios listaUsuarios= new ListaUsuarios();
	        
	        String sentenciaSql = "SELECT * FROM usu_priv p JOIN usuario u ON p.id_usuario = u.id_usuario WHERE email= ? ";

	        try {
		    	Conexion mysql = new Conexion();
		        Connection cn= mysql.Conectar();
		    	 
		       
	            st = cn.prepareStatement(sentenciaSql);
	            st.setString(1, u);
	            rs = st.executeQuery();
	            
	        while (rs.next()){
	        int usuario = rs.getInt("id_usuario");
	        System.out.println(usuario);
	        int privado = rs.getInt("id_privado");
	        System.out.println(privado);
	     
	        Usuario_Privado usu = new Usuario_Privado(usuario, privado);
	        listaUsuarios.setUsuario_Privado(usu);
	        }
	        
	        
	   
	        } catch (SQLException ex) {
	            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return listaUsuarios;  
	 }*/
	 
		public static ListaUsuarios BuscarMisPrivados(String usuari) {
	
			int id = Usuario_Privado.BuscarUsuario(usuari);
			
			ListaUsuarios listaUsuarios= new ListaUsuarios();
			
		       try {
		    	   Conexion mysql = new Conexion();
		           Connection cn= mysql.Conectar();
		    	 
		           if (cn == null) {
		               System.out.println("Conexión nula");
		           } else {
		               PreparedStatement s = cn.prepareStatement("SELECT DISTINCT id_privado FROM usu_priv WHERE id_usuario = ?");
		               s.setInt(1,id);
		               ResultSet rs = s.executeQuery();
		               int i=1;
		               
		              while (rs.next()){
		            	     int num =Integer.parseInt(rs.getString("id_privado"));
			            	 PreparedStatement st = cn.prepareStatement("SELECT * FROM usu_priv WHERE id_privado = ?");
				             st.setInt(1, num);
				             ResultSet rst = st.executeQuery();
				             
				             while (rst.next()) {
				            	 if(rst.getInt("id_usuario")!=id){
				            		 int id_usu = rst.getInt("id_usuario");
				            		 int id_privado = rst.getInt("id_privado");
				            		 Usuario_Privado up = new Usuario_Privado(id_usu,id_privado);
				            	     listaUsuarios.setUsuario_Privado(up);
				            	 }
				             } 
		              }
		           }

		       } catch (SQLException ex) {
		           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		       }
		      return listaUsuarios;
		}
		
		public static ListaUsuarios BuscarUsuarios(String usuari) {
			
			int id = Usuario_Privado.BuscarUsuario(usuari);
			
			ListaUsuarios listaUsuarios= new ListaUsuarios();
			
		       try {
		    	   Conexion mysql = new Conexion();
		           Connection cn= mysql.Conectar();
		    	 
		           if (cn == null) {
		               System.out.println("Conexión nula");
		           } else {
		            	
			            	 PreparedStatement st = cn.prepareStatement("SELECT * FROM usuario ");
				             ResultSet rst = st.executeQuery();
				             
				             while (rst.next()) {
				            	
				            	 while (rst.next()) {
					            	 //if(rst.getInt("id_usuario")!=id){
					            		 int id_usu = rst.getInt("id_usuario");
					            		 Usuario_Privado up = new Usuario_Privado(id_usu);
					            	     listaUsuarios.setUsuario_Privado(up);
					            	 //}
					             } 
				            	 
				             } 
		             }
		           

		       } catch (SQLException ex) {
		           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		       }
		      return listaUsuarios;
		}
		
		public static String BuscarUsuarioId(int id) {
			
			String email = "";
			String sentenciaSql = "SELECT email  FROM usuario WHERE id_usuario = ?";
		    
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
