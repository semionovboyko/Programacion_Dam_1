package _08Iva;

import java.awt.*;
import javax.swing.*;

public class VentanaIva {
	

		JFrame miVentana = new JFrame ("IVA");
		JTextField txtBaseImp = new JTextField(5);
		
		String[] lista = {"Libros(4%)","Alimentacion(7%)","Consumo general(16%)"};
		JComboBox<String> cmbIVA = new JComboBox<>(lista);
		
		JPanel marPrincipal = new JPanel();
		JPanel marSuperior = new JPanel();
		JPanel marInferior = new JPanel();
		JPanel marIzq = new JPanel();
		JPanel marDer = new JPanel();
		JPanel marBot = new JPanel();
		JPanel marResultado = new JPanel();
		
		JLabel etiBaseImp = new JLabel();
		JLabel etiImporteTotal = new JLabel();
		JLabel etiImporte = new JLabel();
		
		JButton botCalcular = new JButton();
		
		public VentanaIva(){
			
			miVentana.setSize(310,210);
			miVentana.setLocationRelativeTo(null);
			miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			miVentana.setLayout(new BorderLayout());
			marPrincipal.setLayout(new BorderLayout());
			marIzq.setLayout(new BorderLayout());
			marDer.setLayout(new BorderLayout());
		
			cmbIVA.setFont(new Font("Arial",0,14));
			cmbIVA.setSelectedIndex(0);
			cmbIVA.setBackground(Color.WHITE);
			cmbIVA.setForeground(Color.BLACK);
			
			txtBaseImp.setText("");
			txtBaseImp.setFont(new Font("Arial",1,14));
			txtBaseImp.setForeground(Color.BLACK);
			txtBaseImp.setBackground(Color.WHITE);
			txtBaseImp.setHorizontalAlignment(JLabel.CENTER);
			txtBaseImp.setPreferredSize(new Dimension(100,30));
			txtBaseImp.setOpaque(true);
			
			botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
			botCalcular.setPreferredSize(new Dimension(100,50));
			botCalcular.setHorizontalAlignment(JButton.CENTER);
			botCalcular.addActionListener(new Calcular (cmbIVA,txtBaseImp,etiImporte));
			
			etiImporte.setText("");
			etiImporte.setFont(new Font("Arial",1,14));
			etiImporte.setForeground(Color.BLACK);
			etiImporte.setBackground(Color.WHITE);
			etiImporte.setHorizontalAlignment(JLabel.CENTER);
			etiImporte.setPreferredSize(new Dimension(100,30));
			etiImporte.setOpaque(true);
			
			etiBaseImp.setText("Base imponible");
			etiBaseImp.setFont(new Font("Arial",0,14));
			etiBaseImp.setForeground(Color.BLUE);
			etiBaseImp.setPreferredSize(new Dimension(100,85));
			etiBaseImp.setVerticalAlignment(JTextField.TOP);
			
			etiImporteTotal.setText("Importe total");
			etiImporteTotal.setFont(new Font("Arial",0,14));
			etiImporteTotal.setForeground(Color.BLUE);
			etiImporteTotal.setPreferredSize(new Dimension(100,25));
			etiImporteTotal.setVerticalAlignment(JTextField.CENTER);
			
			marDer.add("North",txtBaseImp);
			marDer.add(marBot);
			marDer.add("South",etiImporte);
			
			marIzq.add("North",etiBaseImp);
			marIzq.add("South",etiImporteTotal);
			
			marBot.add(botCalcular);
			
			marSuperior.add(cmbIVA);
			
			marInferior.add(marIzq);
			marInferior.add(marDer);
			
			marPrincipal.add("North",marSuperior);
			marPrincipal.add("South",marInferior);
			
			miVentana.add("North",marPrincipal);
			miVentana.setVisible(true);
			
		}
		
		public static void main(String[] args) {
			new VentanaIva();


		}

}