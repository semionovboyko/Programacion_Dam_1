package Examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcular1 implements ActionListener {
	
	JTextField objX1;
	JTextField objX2;
	JTextField objY1;
	JTextField objY2;
	
	JLabel objResult;
	
	 double X1;
	 double Y1;
	 double X2;
	 double Y2;
	

	public Calcular1(JTextField txtX1, JTextField txtX2,JTextField txtY1, JTextField txtY2, JLabel etiResult) {
		objX1 = txtX1;
		objX2 = txtX2;
		objY1 = txtY1;
		objY2 = txtY2;
		objResult = etiResult;
		
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		try {
			X1 = Double.parseDouble(objX1.getText().replace(',','.'));
			Y1 = Double.parseDouble(objY1.getText().replace(',','.'));
			X2 = Double.parseDouble(objX2.getText().replace(',','.'));
			Y2 = Double.parseDouble(objY2.getText().replace(',','.'));
			
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Introduce valores numericos");
			return;
		}
		
		double restax = X2-X1;
		double restay = Y2-Y1;
		double potx =Math.pow(restax, 2);
		double poty = Math.pow(restay, 2);
		double result = potx + poty;
		
		DecimalFormat miFormato = new DecimalFormat("##,##00.00");
		objResult.setText(miFormato.format((float)Math.sqrt(result)));
		
		
		
	}
	
	
	

}
