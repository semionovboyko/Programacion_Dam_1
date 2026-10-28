package _04Centro;

import java.awt.event.*;
import javax.swing.*;

public class Asignatura implements ActionListener {
	
	JTextField objMensaje;
	
	public Asignatura(JTextField txtMensaje ) {
		objMensaje = txtMensaje;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("Desarrollo Aplicaciones Multiplataformicas");
		// TODO Auto-generated method stub
	}

}
