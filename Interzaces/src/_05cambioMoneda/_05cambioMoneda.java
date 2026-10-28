package _05cambioMoneda;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Educacion.Estudios;

public class _05cambioMoneda {
	
	JFrame miVentana = new JFrame("Cambio de moneda");
	JPanel marPrincipal = new JPanel();
	JPanel marEuros = new JPanel();
	JLabel etiEuros = new JLabel();
	JTextField txtEuros = new JTextField(10);
	JPanel marDolares = new JPanel();
	JLabel etiDolares = new JLabel();
	JTextField txtDolares = new JTextField(10);
	JPanel marBotones = new JPanel();
	JButton botCambio = new JButton();
	
	
	
	public _05cambioMoneda() {
		
		miVentana.setSize(400,110);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marEuros.setLayout(new BorderLayout());
		//marEuros.setPreferredSize(new Dimension(70, 75));
		marDolares.setLayout(new BorderLayout());
		//marDolares.setPreferredSize(new Dimension(70, 75));
		
		etiEuros.setText("Euros (€)");
		etiEuros.setFont(new Font ("Arial", 0, 14));
		etiEuros.setForeground(Color.BLUE);
		etiEuros.setPreferredSize(new Dimension(80, 25));
		etiEuros.setHorizontalAlignment(JTextField.CENTER);
		etiEuros.setVerticalAlignment(JTextField.TOP);
		
		txtEuros.setText("");
		txtEuros.setFont(new Font("Arial",0,10));
		txtEuros.setForeground(Color.BLACK);
		txtEuros.setBackground(Color.WHITE);
		txtEuros.setPreferredSize(new Dimension(10, 25));
		txtEuros.setHorizontalAlignment(JTextField.CENTER);
		
		etiDolares.setText("Dolares ($)");
		etiDolares.setFont(new Font ("Arial", 0, 14));
		etiDolares.setForeground(Color.BLUE);
		etiDolares.setPreferredSize(new Dimension(80, 25));
		etiDolares.setHorizontalAlignment(JTextField.CENTER);
		etiDolares.setVerticalAlignment(JTextField.TOP);
		
		txtDolares.setText("");
		txtDolares.setFont(new Font("Ariel",0,10));
		txtDolares.setForeground(Color.BLACK);
		txtDolares.setBackground(Color.WHITE);
		txtDolares.setPreferredSize(new Dimension(80, 25));
		txtDolares.setHorizontalAlignment(JTextField.CENTER);
		
		botCambio.setIcon(new ImageIcon(getClass().getResource("Derecha.gif")));
		botCambio.setPreferredSize(new Dimension(140, 40));
		botCambio.addActionListener(new CalcEuroDolar(txtEuros, txtDolares));
		
		marEuros.add("North",etiEuros);
		marEuros.add("South",txtEuros);
		
		marDolares.add("North",etiDolares);
		marDolares.add("South",txtDolares);
		
		marBotones.add(botCambio);
		
		marPrincipal.add("West",marEuros);
		marPrincipal.add("Center",marBotones);
		marPrincipal.add("East",marDolares);
	
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new _05cambioMoneda();
	}
}
