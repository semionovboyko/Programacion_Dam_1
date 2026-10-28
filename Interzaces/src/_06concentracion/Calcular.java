package _06concentracion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcular implements ActionListener {
	
	JTextField objSoluto;
	JTextField objDisolucion;
	 double soluto;
	 JLabel objConcentracion;
	 double disolucion;

	public Calcular(JTextField txtSoluto, JTextField txtDisolucion, JLabel lblConcentracion) {
		 objSoluto = txtSoluto;
		 objDisolucion = txtDisolucion;
		 objConcentracion = lblConcentracion;
		
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		try {
			soluto = Double.parseDouble(objSoluto.getText().replace(',','.'));
			disolucion = Double.parseDouble(objDisolucion.getText().replace(',','.'));
			
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Introduce valores numericos");
			return;
		}if(soluto <=0) {
			JOptionPane.showMessageDialog(null, "Soluto: escribe un valor positivo");
			return;
		}if(disolucion <=0) {
			JOptionPane.showMessageDialog(null, "Disolucion: escribe un valor positivo");
			return;
		}
		
		DecimalFormat miFormato = new DecimalFormat("#,##0.00");
		objConcentracion.setText(miFormato.format((soluto/disolucion)));
	}
	
	

}
