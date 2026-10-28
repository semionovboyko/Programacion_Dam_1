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

public class ListaGrupos implements Serializable {
    private ArrayList<Usuario_Grupo> listaGrupos;

	public ListaGrupos() {
		listaGrupos = new ArrayList<>();
	}

	public Usuario_Grupo getUsuario_Grupo(int g) {
		return listaGrupos.get(g);
	}

	public void setUsuario_Grupo (Usuario_Grupo lg) {
		listaGrupos.add(lg);
	}

	public int longitud (){
        return listaGrupos.size();
    }
    public void eliminar (int g) {
        listaGrupos.remove(g);     
    }
    
    public ListaGrupos SeleccionarGrupos() {
        
        Statement st;
        ResultSet rs = null;
        ListaGrupos listaGrupos= new ListaGrupos();

        try {
	    	Conexion mysql = new Conexion();
	        Connection cn= mysql.Conectar();
	    	 
	       
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM usu_grup");
            
        while (rs.next()){
        int usuario = rs.getInt("id_usuario");
        int grupo = rs.getInt("id_grupo");
     
        //Usuario_Grupo usu = new Usuario_Grupo(usuario, grupo);
        //listaGrupos.setUsuario_Grupo(usu);
        }
   
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaGrupos;  
 }

  public static ListaGrupos BuscarMisGrupos(String usuari) {
		
		int id = Usuario_Privado.BuscarUsuario(usuari);
		
		ListaGrupos listaGrupos= new ListaGrupos();
		
	       try {
	    	   Conexion mysql = new Conexion();
	           Connection cn= mysql.Conectar();
	    	 
	           if (cn == null) {
	               System.out.println("Conexión nula");
	           } else {
	               PreparedStatement s = cn.prepareStatement("SELECT DISTINCT id_grupo FROM usu_grup WHERE id_usuario = ?");
	               s.setInt(1,id);
	               ResultSet rs = s.executeQuery();
	               int i=1;
	               
	              while (rs.next()){
	            	     int num =Integer.parseInt(rs.getString("id_grupo"));
		            	 PreparedStatement st = cn.prepareStatement("SELECT DISTINCT nombre_grupo FROM grupo NATURAL JOIN usu_grup WHERE id_grupo = ?");
			             st.setInt(1, num);
			             ResultSet rst = st.executeQuery();
			             
			             while (rst.next()) {
			            	 	 int id_num = rs.getInt("id_grupo");
			            		 String nombre = rst.getString("nombre_grupo");
			            		 Usuario_Grupo up = new Usuario_Grupo(nombre, id_num);
			            	     listaGrupos.setUsuario_Grupo(up);
			             } 
	              }
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	       }
	      return listaGrupos;
	}
}
