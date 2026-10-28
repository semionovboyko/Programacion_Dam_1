package _06RaizCuadrada;

import java.awt.*;
import javax.swing.*;


public class ventanaCalculadora {
	

	JFrame miVentana = new JFrame("Raiz cuadrada");
	JPanel marPrincipal = new JPanel();
	JPanel marSup = new JPanel();
	JPanel marNum = new JPanel();
	JLabel etiNum = new JLabel();
	JTextField txtNum= new JTextField(10);
	JPanel marResultados = new JPanel();
	JLabel etiRaiz = new JLabel();
	JLabel etiResultado = new JLabel();
	JButton botCalcular = new JButton();
	
	
	public ventanaCalculadora(){
		
		miVentana.setSize(400,150);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marPrincipal.setLayout(new BorderLayout());
		marNum.setLayout(new BorderLayout());
		
		etiNum.setText("Intruduce un numero: ");
		etiNum.setFont(new Font ("Arial", 0, 14));
		etiNum.setForeground(Color.BLACK);
		etiNum.setPreferredSize(new Dimension(140, 25));
		etiNum.setHorizontalAlignment(JTextField.CENTER);
		etiNum.setVerticalAlignment(JTextField.TOP);
		
		txtNum.setText("");
		txtNum.setFont(new Font("Ariel",0,10));
		txtNum.setForeground(Color.BLACK);
		txtNum.setBackground(Color.WHITE);
		txtNum.setPreferredSize(new Dimension(30, 25));
		txtNum.setHorizontalAlignment(JTextField.CENTER);
		
		etiRaiz.setText("Raiz cuadrada: ");
		etiRaiz.setFont(new Font ("Arial", 0, 14));
		etiRaiz.setForeground(Color.BLACK);
		etiRaiz.setPreferredSize(new Dimension(110, 25));
		etiRaiz.setHorizontalAlignment(JTextField.CENTER);
		etiRaiz.setVerticalAlignment(JTextField.TOP);
		
		etiResultado.setText("");
		etiResultado.setFont(new Font ("Arial", 1, 14));
		etiResultado.setForeground(Color.BLUE);
		etiResultado.setBackground(Color.ORANGE);
		etiResultado.setPreferredSize(new Dimension(160, 25));
		etiResultado.setHorizontalAlignment(JTextField.CENTER);
		etiResultado.setOpaque(true);
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(130, 50));
		botCalcular.addActionListener( new Calcular(txtNum, etiResultado));
		
		marResultados.add(etiRaiz);
		marResultados.add(etiResultado);
		
		marNum.add("North",etiNum);
		marNum.add("South",txtNum);
		
		marSup.add("West",marNum);
		marSup.add("East",botCalcular);
		
		
		marPrincipal.add("North",marSup);
		marPrincipal.add("Center",marResultados);
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ventanaCalculadora();
}
}

