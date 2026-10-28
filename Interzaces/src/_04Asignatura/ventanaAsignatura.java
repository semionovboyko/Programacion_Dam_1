package _04Asignatura;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

public class ventanaAsignatura {
	
	JFrame miVentana = new JFrame("Asignatura");
	JPanel marMensaje = new JPanel();
	JPanel marCentro = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(25);
	
	JButton botCentro = new JButton("Centro");
	JButton botLocalidad = new JButton("Localidad");
	JButton botAsignatura = new JButton("Asignatura");
	public static void main(String[] args) {
		new ventanaAsignatura();
	}
	
	public ventanaAsignatura() {
		
		miVentana.setSize(500,130);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtMensaje.setText("");
		txtMensaje.setFont(new Font("Ariel",0,20));
		txtMensaje.setForeground(Color.BLUE);
		txtMensaje.setBackground(Color.ORANGE);
		txtMensaje.setHorizontalAlignment(JTextField.CENTER);
		
		botCentro.setIcon(new ImageIcon(getClass().getResource("Centro.gif")));
		botCentro.setFont(new Font("Ariel",0,14));
		botCentro.setPreferredSize(new Dimension(150, 40));
		botCentro.addActionListener(new Centro(txtMensaje));
		
		botLocalidad.setIcon(new ImageIcon(getClass().getResource("Localidad.gif")));
		botLocalidad.setFont(new Font("Ariel",0,14));
		botLocalidad.setPreferredSize(new Dimension(150, 40));
		botLocalidad.addActionListener(new Localidad(txtMensaje));
		
		botAsignatura.setIcon(new ImageIcon(getClass().getResource("Asignatura.gif")));
		botAsignatura.setFont(new Font("Ariel",0,14));
		botAsignatura.setPreferredSize(new Dimension(150, 40));
		botAsignatura.addActionListener(new Asignatura(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add("North",botCentro);
		marBotones.add("Center",botLocalidad);
		marBotones.add("South",botAsignatura);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
}
