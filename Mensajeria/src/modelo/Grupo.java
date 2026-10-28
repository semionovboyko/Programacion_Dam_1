package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grupo {
	
	private int Id_chat;
	private int Id_grupo;
	private String nombre_grupo;
	private int Num_personas;
	static int key;

	
	public Grupo(String nombre_grupo, int num_personas) {
		super();
		//Id_chat = id_chat;
		//Id_grupo = id_grupo;
		this.nombre_grupo = nombre_grupo;
		this.Num_personas = num_personas;
	}

	public int getId_chat() {
		return Id_chat;
	}

	public void setId_chat(int id_chat) {
		Id_chat = id_chat;
	}

	public int getId_grupo() {
		return Id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		Id_grupo = id_grupo;
	}

	public String getNombre_grupo() {
		return nombre_grupo;
	}

	public void setNombre_grupo(String nombre_grupo) {
		this.nombre_grupo = nombre_grupo;
	}

	public int getNum_personas() {
		return Num_personas;
	}

	public void setNum_personas(int num_personas) {
		Num_personas = num_personas;
	}
	
	public static int InsertarDatosGrupo(Grupo grup) {
		
		 String nombre = grup.getNombre_grupo();
	   	 int num = grup.getNum_personas();
		
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
	               
	               PreparedStatement priv = cn.prepareStatement("INSERT INTO grupo(nombre_grupo,id_grupo,nparticipantes) VALUES (?,?,?)");
	               priv.setString(1,nombre);
	               priv.setInt(2, key);
	               priv.setInt(3, num);
	               priv.executeUpdate();
	               
	               pst.close();
	           }

	       } catch (SQLException ex) {
	           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return key;
	   }
	
}
