package _04Centro;

import java.awt.event.*;
import javax.swing.*;

public class Centro implements ActionListener {
	
	JTextField objMensaje;
	
	public Centro(JTextField txtMensaje ) {
		objMensaje = txtMensaje;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("IES EL GRAO");
		// TODO Auto-generated method stub
	}

}
