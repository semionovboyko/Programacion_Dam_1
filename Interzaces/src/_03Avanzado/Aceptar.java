package _03Avanzado;

import java.awt.event.*;
import javax.swing.*;

public class Aceptar implements ActionListener {
	
	JTextField objMensaje;
	
	public Aceptar(JTextField txtMensaje ) {
		objMensaje = txtMensaje;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("Avanzando con Java");
		// TODO Auto-generated method stub
	}

}
