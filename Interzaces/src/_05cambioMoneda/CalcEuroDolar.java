package _05cambioMoneda;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class CalcEuroDolar implements ActionListener {
	
	JTextField objEuros;
	JTextField objDolares;
	double valor;
	
	public CalcEuroDolar(JTextField txtEuros, JTextField txtDolares) {
		objEuros = txtEuros;
		objDolares = txtDolares;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			valor = Double.parseDouble(objEuros.getText().replace(',','.'));
			DecimalFormat miFormato = new DecimalFormat("#,##0.00");
			objDolares.setText(miFormato.format((valor * 1.54)));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Introduce un valor correcto");
		}
		
	}

}
