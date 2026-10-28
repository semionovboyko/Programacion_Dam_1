package _04Centro;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

public class ventanaCentro {
	
	JFrame miVentana = new JFrame("Centro de estudios");
	JPanel marMensaje = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(20);
	JButton botCentro = new JButton();
	JButton botLocalidad = new JButton("Localidad");
	
	public static void main(String[] args) {
		new ventanaCentro();
	}
	
	public ventanaCentro() {
		
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
		botCentro.setText("Centro");
		botCentro.setFont(new Font("Ariel",0,14));
		botCentro.setPreferredSize(new Dimension(150, 40));
		botCentro.addActionListener(new Centro(txtMensaje));
		
		botLocalidad.setIcon(new ImageIcon(getClass().getResource("Localidad.gif")));
		botLocalidad.setFont(new Font("Ariel",0,14));
		botLocalidad.setPreferredSize(new Dimension(150, 40));
		botLocalidad.addActionListener(new Localidad(txtMensaje));
		
		
		marMensaje.add(txtMensaje);
		marBotones.add("North",botCentro);
		marBotones.add("South",botLocalidad);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
}
