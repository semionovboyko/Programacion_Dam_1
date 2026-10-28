package NifFALLO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _06RaizCuadrada.Calcular;

public class ventanaDni {
	
	JFrame miVentana = new JFrame("NIF");
	JPanel marPrincipal = new JPanel();
	JPanel marDni = new JPanel();
	JPanel marNif = new JPanel();
	JPanel marbot = new JPanel();
	JLabel etiDNI = new JLabel();
	JTextField txtDni= new JTextField(10);
	JButton botCalcular = new JButton();
	JLabel etiNIF = new JLabel();
	JLabel etiResultado = new JLabel();
	
	public ventanaDni() {
		
		miVentana.setSize(300,180);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marPrincipal.setLayout(new BorderLayout());
		
		//marbot.setLayout(new BorderLayout());
		//marbot.setPreferredSize(new Dimension(20, 75));
		
		etiDNI.setText("DNI");
		etiDNI.setFont(new Font ("Arial", 0, 14));
		etiDNI.setForeground(Color.BLACK);
		etiDNI.setPreferredSize(new Dimension(60, 25));
		etiDNI.setHorizontalAlignment(JTextField.CENTER);
		//Desde el margen en el que esta
		//etiDNI.setVerticalAlignment(JTextField.TOP);
		
		txtDni.setText("");
		txtDni.setFont(new Font("Ariel",0,20));
		txtDni.setForeground(Color.BLACK);
		txtDni.setBackground(Color.WHITE);
		txtDni.setPreferredSize(new Dimension(10, 25));
		txtDni.setHorizontalAlignment(JLabel.CENTER);
		txtDni.setOpaque(true);
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(150, 60));
		botCalcular.addActionListener( new Calcular(txtDni, etiResultado));
		
		
		etiNIF.setText("NIF ");
		etiNIF.setFont(new Font ("Arial", 0, 14));
		etiNIF.setForeground(Color.BLACK);
		etiNIF.setPreferredSize(new Dimension(30, 25));
		etiNIF.setHorizontalAlignment(JTextField.CENTER);
		//etiNIF.setVerticalAlignment(JTextField.TOP);
		
		etiResultado.setText("");
		etiResultado.setFont(new Font ("Arial", 0, 24));
		etiResultado.setForeground(Color.BLUE);
		etiResultado.setBackground(Color.ORANGE);
		etiResultado.setPreferredSize(new Dimension(150, 25));
		etiResultado.setHorizontalAlignment(JTextField.CENTER);
		etiResultado.setOpaque(true);
		
		marNif.add(etiNIF);
		marNif.add(etiResultado);
		
		marbot.add(botCalcular);
		
		marDni.add(etiDNI);
		marDni.add(txtDni);
		
		marPrincipal.add("North",marDni);
		marPrincipal.add("Center",marbot);
		marPrincipal.add("South",marNif);
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
	
	}
	
	public static void main (String[]args) {
		new ventanaDni();
	}
}
