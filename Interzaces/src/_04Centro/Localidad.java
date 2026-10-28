package _04Centro;

import java.awt.event.*;
import javax.swing.*;

public class Localidad implements ActionListener {
	JTextField objMensaje;
	
	public Localidad(JTextField txtMensaje) {
		 objMensaje = txtMensaje;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		objMensaje.setText("Valencia");
	}

}
