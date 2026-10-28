package _02ejercios;

import java.awt.*;
import javax.swing.*;

public class _02hola {
	
	JFrame miVentana = new JFrame ();
	JPanel marPrincipal = new JPanel();
	JTextField txtBienvenido = new JTextField(20);
	
	public _02hola() {
		
		miVentana.setTitle("Hola");
		miVentana.setSize(500,200);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtBienvenido.setText("Alexey Andreevich");
		txtBienvenido.setFont(new Font("Ariel",0,20));
		txtBienvenido.setForeground(Color.RED);
		txtBienvenido.setBackground(Color.ORANGE);
		txtBienvenido.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBienvenido);
		miVentana.add("South", marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		new _02hola();
	}
}
