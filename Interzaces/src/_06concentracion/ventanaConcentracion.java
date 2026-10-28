package _06concentracion;

import java.awt.*;
import javax.swing.*;

import _05cambioMoneda2._05cambioMoneda;


public class ventanaConcentracion {
	

	JFrame miVentana = new JFrame("Concentracion");
	JPanel marPrincipal = new JPanel();
	
	JPanel marIzq = new JPanel();
	JPanel marSoluto = new JPanel();
	JLabel etiSoluto = new JLabel();
	JTextField txtSoluto= new JTextField(10);
	JPanel marDisolucion = new JPanel();
	JLabel etiDisolucion = new JLabel();
	JTextField txtDisolucion= new JTextField(10);
	JLabel imgFormula = new JLabel();
	
	JPanel marBoton = new JPanel();
	
	JPanel marDerec = new JPanel();
	JButton botCalcular = new JButton();
	JLabel imgConcentracion = new JLabel();
	JLabel etiConcentrado = new JLabel();
	JLabel etiResultado = new JLabel();
	
	
	public ventanaConcentracion(){
		
		miVentana.setSize(500,250);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		
		marIzq.setLayout(new BorderLayout());
		
		marDerec.setLayout(new BorderLayout());
		
		marBoton.setLayout(new BorderLayout());
		
		etiSoluto.setText("Gramos de soluto (g)");
		etiSoluto.setFont(new Font ("Arial", 0, 14));
		etiSoluto.setForeground(Color.BLACK);
		etiSoluto.setPreferredSize(new Dimension(140, 25));
		etiSoluto.setHorizontalAlignment(JTextField.CENTER);
		etiSoluto.setVerticalAlignment(JTextField.TOP);
		
		txtSoluto.setText("");
		txtSoluto.setFont(new Font("Ariel",0,10));
		txtSoluto.setForeground(Color.BLACK);
		txtSoluto.setBackground(Color.WHITE);
		txtSoluto.setPreferredSize(new Dimension(30, 25));
		txtSoluto.setHorizontalAlignment(JTextField.CENTER);
		
		etiDisolucion.setText("Volumen de disolucion (l)");
		etiDisolucion.setFont(new Font ("Arial", 0, 14));
		etiDisolucion.setForeground(Color.BLACK);
		etiDisolucion.setPreferredSize(new Dimension(160, 25));
		etiDisolucion.setHorizontalAlignment(JTextField.CENTER);
		etiDisolucion.setVerticalAlignment(JTextField.TOP);
		
		txtDisolucion.setText("");
		txtDisolucion.setFont(new Font("Ariel",0,10));
		txtDisolucion.setForeground(Color.BLACK);
		txtDisolucion.setBackground(Color.WHITE);
		txtDisolucion.setPreferredSize(new Dimension(30, 25));
		txtDisolucion.setHorizontalAlignment(JTextField.CENTER);
		
		imgFormula.setIcon(new ImageIcon(getClass().getResource("Formula.gif")));
		imgFormula.setPreferredSize(new Dimension(80, 70));
		imgFormula.setHorizontalAlignment(JLabel.CENTER);
		imgFormula.setVerticalAlignment(JLabel.CENTER);
		
		imgConcentracion.setIcon(new ImageIcon(getClass().getResource("Concentracion.jpg")));
		imgConcentracion.setPreferredSize(new Dimension(150, 150));
		imgConcentracion.setHorizontalAlignment(JLabel.CENTER);
		imgConcentracion.setVerticalAlignment(JLabel.CENTER);
		
		etiConcentrado.setText("Concentrado (g/l)");
		etiConcentrado.setFont(new Font ("Arial", 1, 14));
		etiConcentrado.setForeground(Color.BLACK);
		etiConcentrado.setPreferredSize(new Dimension(30, 20));
		etiConcentrado.setHorizontalAlignment(JTextField.CENTER);
		etiConcentrado.setVerticalAlignment(JTextField.TOP);
		
		etiResultado.setText("");
		etiResultado.setFont(new Font ("Arial", 1, 14));
		etiResultado.setForeground(Color.BLUE);
		etiResultado.setBackground(Color.ORANGE);
		etiResultado.setPreferredSize(new Dimension(1, 25));
		etiResultado.setHorizontalAlignment(JTextField.CENTER);
		etiResultado.setOpaque(true);
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(100, 40));
		botCalcular.addActionListener( new Calcular(txtSoluto, txtDisolucion, etiResultado));
		
		
		marSoluto.add("North",etiSoluto);
		marSoluto.add("South",txtSoluto);
		
		marDisolucion.add("North",etiDisolucion);
		marDisolucion.add("South",txtDisolucion);
		
		marBoton.add("North",botCalcular);
		marBoton.add("South",imgFormula);
		
		marIzq.add("North",marSoluto);
		marIzq.add("Center",marDisolucion);
		marIzq.add("South",marBoton);
		
		marDerec.add("North",imgConcentracion);
		marDerec.add("Center",etiConcentrado);
		marDerec.add("South",etiResultado);
		
		marPrincipal.add(marIzq);
		marPrincipal.add(marDerec);
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ventanaConcentracion();
}
}
