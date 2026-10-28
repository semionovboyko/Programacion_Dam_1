package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {

	public Conexion() {
    }

	    public Connection Conectar() {

	        Connection cn = null;

	        try {

	            Class.forName("org.postgresql.Driver");
	            //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
	            cn = DriverManager.getConnection("jdbc:postgresql://localhost"
	            		+ ":5432/Mensajeria",
	            	    "postgres", "postgres");

	        } catch (Exception e) {
	            e.printStackTrace(); //Muestra la ruta del error

	        }
	        return cn;
	    }   
	}

