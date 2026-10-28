package _07Dividir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcularDivi implements ActionListener {
	
	JTextField objDivi;
	JTextField objDivisor;
	double dividiendo;
	double divisor;
	JLabel objResult;


	public CalcularDivi(JTextField txtDivi, JTextField txtDivisor,  JLabel etiResult) {
		 objDivi = txtDivi;
		 objDivisor = txtDivisor;
		 objResult = etiResult;	
	}
	
	@Override
	public void actionPerformed (ActionEvent arg0) {
		if(objDivi.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Introduce un dividiendo");
			return;
		}
		if(objDivisor.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Introduce un divisor");
			return;
		}
		
		try {
			dividiendo = Double.parseDouble(objDivi.getText().replace(',','.'));
			divisor = Double.parseDouble(objDivisor.getText().replace(',','.'));
			if(divisor == 0) {
				if(dividiendo == 0) {
					objResult.setText("Indeterminado");
				}else {
					objResult.setText("Infinito");
				}
			}else {
				DecimalFormat miFormato = new DecimalFormat("#,##0.00");
				objResult.setText(miFormato.format(dividiendo/divisor));
			}
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Introduce valores numericos");
		}
	
	}
	
	

}
