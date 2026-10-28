package _08Poliedro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calcular implements ActionListener{
	JComboBox<String> objcmbPoliedro;
	JTextField objArista;
	JLabel objResultado;
	double arista;
	public Calcular(JComboBox<String> cmbPoliedro, JTextField txtArista, JLabel etiResultado) {
		objcmbPoliedro = cmbPoliedro;
		objArista = txtArista;
		objResultado = etiResultado;
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			arista = Double.parseDouble(objArista.getText().replace(',','.'));
			switch(objcmbPoliedro.getSelectedIndex()+1) {
				case 1:
					arista =(Math.pow(arista,2)*Math.sqrt(3));
					break;
				case 2:
					arista =(6*Math.pow(arista,2));
					break;	
				case 3:
					arista =(2*Math.pow(arista,2)*Math.sqrt(3));
					break;
				case 4:
					arista =(5*Math.pow(arista,2)*Math.sqrt(3));
					break;
				case 5:
					arista =(3*Math.pow(arista,2)*Math.sqrt(25+10*Math.sqrt(5)));
					break;	
				}
			DecimalFormat miFormato = new DecimalFormat("#,##0.00");
			objResultado.setText(miFormato.format((arista)));
			
			}
			catch(Exception e1) {
				JOptionPane.showMessageDialog(null,"Introduce un valor de arista valido");
			}
	}
}
