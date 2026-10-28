package _03Avanzado;

import java.awt.*;
import javax.swing.*;

public class ventanaAvanzado {
	
	JFrame miVentana = new JFrame("Avanzado");
	JPanel marMensaje = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(20);
	JButton botNombre = new JButton();
	
	public ventanaAvanzado() {
		
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
		botNombre.setFont(new Font("Ariel",0,20));
		botNombre.setPreferredSize(new Dimension(160, 40));
		botNombre.addActionListener(new Aceptar(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add(botNombre);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		
		new ventanaAvanzado();
	}
}
