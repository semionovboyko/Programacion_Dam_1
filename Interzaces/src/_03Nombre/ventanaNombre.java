package _03Nombre;

import java.awt.*;
import javax.swing.*;

public class ventanaNombre {
	
	JFrame miVentana = new JFrame("Nombre");
	JPanel marMensaje = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(15);
	JButton botNombre = new JButton();
	
	public ventanaNombre() {
		
		miVentana.setSize(400,125);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtMensaje.setText("");
		txtMensaje.setFont(new Font("Ariel",0,20));
		txtMensaje.setForeground(Color.BLUE);
		txtMensaje.setBackground(Color.YELLOW);
		txtMensaje.setHorizontalAlignment(JTextField.CENTER);
		
		botNombre.setIcon(new ImageIcon(getClass().getResource("Aceptar.gif")));
		botNombre.setText("Aceptar");
		botNombre.setFont(new Font("Ariel",0,14));
		botNombre.setPreferredSize(new Dimension(120, 40));
		botNombre.addActionListener(new Nombre(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add(botNombre);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		
		new ventanaNombre();
	}
}
