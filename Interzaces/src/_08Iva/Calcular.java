package _08Iva;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calcular implements ActionListener{
		
	JComboBox<String> objcmbIVA;
		JTextField objBaseImp;
		JLabel objImporteTotal;
		double importe;
	
		public Calcular (JComboBox<String> cmbIVA, JTextField txtBaseImp ,JLabel etiImporteTotal ) {
			objcmbIVA = cmbIVA;
			objBaseImp = txtBaseImp;
			objImporteTotal = etiImporteTotal;
		}
			
		public void actionPerformed(ActionEvent arg0) {
				try {
					
					importe = Double.parseDouble(objBaseImp.getText().replace(',','.'));
					
					switch(objcmbIVA.getSelectedIndex()+1) {
						case 1:
							importe =importe*0.04;
							break;
						case 2:
							importe =importe*0.07;
							break;	
						case 3:
							importe =importe*0.016;
							break;	
						}
					DecimalFormat miFormato = new DecimalFormat("#,##0.00");
					objImporteTotal.setText(miFormato.format((importe)));
					
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null,"Introduce un valor valido");
					
				}
			}
}
