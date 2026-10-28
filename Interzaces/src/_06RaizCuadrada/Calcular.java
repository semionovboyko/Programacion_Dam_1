package _06RaizCuadrada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calcular implements ActionListener {
	
	JTextField objNum;
	double num;
	JLabel objRaiz;


	public Calcular(JTextField txtNum,  JLabel etiRaiz) {
		 objNum = txtNum;
		 objRaiz = etiRaiz;	
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		try {
			num = Double.parseDouble(objNum.getText().replace(',','.'));
			
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Introduce valores numericos");
			return;
		}if(num <=0) {
			objRaiz.setText("No tiene raiz real");
			return;
		}
		
		DecimalFormat miFormato = new DecimalFormat("#,##0.00");
		objRaiz.setText(miFormato.format((float) Math.sqrt(num)));
	
	}
	
	

}
