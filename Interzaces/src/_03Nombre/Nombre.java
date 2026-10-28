package _03Nombre;

import java.awt.event.*;
import javax.swing.*;

public class Nombre implements ActionListener {
	
	JTextField objMensaje;
	
	public Nombre(JTextField txtMensaje ) {
		objMensaje = txtMensaje;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("Alexey Semionov Boyko");
	}

}
