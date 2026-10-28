package _07Nif;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcular implements ActionListener{
	JTextField objDni;
	JLabel objNIF;
	int dni;
	int pos;
			public Calcular (JTextField txtDni ,JLabel lblNIF ) {
				objDni = txtDni;
				objNIF = lblNIF;
				}
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKET";
					dni = Integer.parseInt(objDni.getText());
					pos = dni%23;
					objNIF.setText(objDni.getText()+'-'+letrasNIF.charAt(pos));
					}
					catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Introduce valores numericos");
					return;
					}
				}
}
