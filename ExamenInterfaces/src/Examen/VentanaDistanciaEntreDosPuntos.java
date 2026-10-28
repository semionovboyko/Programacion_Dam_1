package Examen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class VentanaDistanciaEntreDosPuntos {
		
		JFrame miVentana = new JFrame("Distancia entre dos puntos A y B");
		JPanel marPrincipal = new JPanel();
		JPanel marImagen = new JPanel();
		JPanel marOperandos= new JPanel();
		Font fuente = new Font("Arial", 0,14);
		Border linea = BorderFactory.createLineBorder(Color.GRAY);
		TitledBorder titA = BorderFactory.createTitledBorder(linea,
				"A", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
		TitledBorder titB = BorderFactory.createTitledBorder(linea,
				"B", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
		TitledBorder titDistancia = BorderFactory.createTitledBorder(linea,
				"Distancia", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
		JPanel marDatos = new JPanel();
		JPanel marDistancia = new JPanel();
		JPanel marA = new JPanel();
		JPanel marX1 = new JPanel();
		JLabel etiX1 = new JLabel();
		JTextField txtX1= new JTextField(10);
		JPanel marY1 = new JPanel();
		JLabel etiY1= new JLabel();
		JTextField txtY1= new JTextField(10);
		JPanel marB= new JPanel();
		JPanel marX2= new JPanel();
		JLabel etiX2 = new JLabel();
		JTextField txtX2= new JTextField(10);
		JPanel marY2 = new JPanel();
		JLabel etiY2= new JLabel();
		JTextField txtY2= new JTextField(10);
		
		JLabel imgFormula_A = new JLabel();
		JLabel imgDistancia = new JLabel();
		
		JLabel etiResult = new JLabel();
		JButton botCalcular = new JButton("Calcular");
		
		public VentanaDistanciaEntreDosPuntos() {
			
			miVentana.setSize(700,405);
			miVentana.setLocationRelativeTo(null);
			miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			miVentana.setLayout(new BorderLayout());
			
			//marPrincipal.setLayout(new BorderLayout());
			
			marOperandos.setLayout(new BorderLayout());
			marImagen.setLayout(new BorderLayout());
			
			marDatos.setLayout(new BorderLayout());
			
			marA.setLayout(new BorderLayout());
			marB.setLayout(new BorderLayout());
			
			marX1.setLayout(new BorderLayout());
			marY1.setLayout(new BorderLayout());
			
			marX2.setLayout(new BorderLayout());
			marY2.setLayout(new BorderLayout());
			
			
			
			
			etiX1.setText("X1");
			etiX1.setFont(new Font ("Arial", 0, 14));
			etiX1.setForeground(Color.BLUE);
			etiX1.setPreferredSize(new Dimension(30, 25));
			etiX1.setHorizontalAlignment(JTextField.CENTER);
			//etiX1.setVerticalAlignment(JTextField.TOP);
			
			txtX1.setText("");
			txtX1.setFont(new Font("Ariel",0,10));
			txtX1.setForeground(Color.BLUE);
			txtX1.setBackground(Color.YELLOW);
			txtX1.setPreferredSize(new Dimension(10, 25));
			txtX1.setHorizontalAlignment(JTextField.CENTER);
			
			etiX2.setText("X2");
			etiX2.setFont(new Font ("Arial", 0, 14));
			etiX2.setForeground(Color.BLUE);
			etiX2.setPreferredSize(new Dimension(30, 25));
			etiX2.setHorizontalAlignment(JTextField.CENTER);
			
			
			txtX2.setText("");
			txtX2.setFont(new Font("Ariel",0,10));
			txtX2.setForeground(Color.BLUE);
			txtX2.setBackground(Color.YELLOW);
			txtX2.setPreferredSize(new Dimension(30, 25));
			txtX2.setHorizontalAlignment(JTextField.CENTER);
			
			etiY1.setText("Y1");
			etiY1.setFont(new Font ("Arial", 0, 14));
			etiY1.setForeground(Color.BLUE);
			etiY1.setPreferredSize(new Dimension(30, 25));
			etiY1.setHorizontalAlignment(JTextField.CENTER);
			
			
			txtY1.setText("");
			txtY1.setFont(new Font("Ariel",0,10));
			txtY1.setForeground(Color.BLUE);
			txtY1.setBackground(Color.YELLOW);
			txtY1.setPreferredSize(new Dimension(10, 25));
			txtY1.setHorizontalAlignment(JTextField.CENTER);
			
			etiY2.setText("Y2");
			etiY2.setFont(new Font ("Arial", 0, 14));
			etiY2.setForeground(Color.BLUE);
			etiY2.setPreferredSize(new Dimension(30, 25));
			etiY2.setHorizontalAlignment(JTextField.CENTER);
	
			
			txtY2.setText("");
			txtY2.setFont(new Font("Ariel",0,10));
			txtY2.setForeground(Color.BLUE);
			txtY2.setBackground(Color.YELLOW);
			txtY2.setPreferredSize(new Dimension(30, 25));
			txtY2.setHorizontalAlignment(JTextField.CENTER);
			
			etiResult.setText("");
			etiResult.setFont(new Font ("Arial", 1, 14));
			etiResult.setForeground(Color.BLUE);
			etiResult.setBackground(Color.ORANGE);
			etiResult.setPreferredSize(new Dimension(160, 25));
			etiResult.setHorizontalAlignment(JTextField.CENTER);
			etiResult.setOpaque(true);
			
			botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
			botCalcular.setPreferredSize(new Dimension(50, 55));
			botCalcular.addActionListener(new Calcular1(txtX1, txtX2, txtY1, txtY2, etiResult));
			
			imgFormula_A.setIcon(new ImageIcon(getClass().getResource("Formula_A.png")));
			imgFormula_A.setPreferredSize(new Dimension(250, 80));
			imgFormula_A.setHorizontalAlignment(JLabel.CENTER);
			imgFormula_A.setVerticalAlignment(JLabel.BOTTOM);
			
			imgDistancia.setIcon(new ImageIcon(getClass().getResource("Distancia.png")));
			imgDistancia.setPreferredSize(new Dimension(350, 250));
			imgDistancia.setHorizontalAlignment(JLabel.CENTER);
			imgDistancia.setVerticalAlignment(JLabel.BOTTOM);
			
			marA.setBorder(titA);
			marB.setBorder(titB);
			marDistancia.setBorder(titDistancia);
			
			marX2.add("West",etiX2);
			marX2.add("East",txtX2);
			
			marY2.add("West",etiY2);
			marY2.add("East",txtY2);
			
			marB.add("West",marX2);
			marB.add("East",marY2);
			
			marX1.add("West",etiX1);
			marX1.add("East",txtX1);
			
			marY1.add("West",etiY1);
			marY1.add("East",txtY1);
			
			marA.add("West",marX1);
			marA.add("East",marY1);
			
			marDatos.add("North",marA);
			marDatos.add("South",marB);
			
			marDistancia.add(etiResult);
			
			marImagen.add("South",imgFormula_A);
			marImagen.add("North",imgDistancia);
			
			marOperandos.add("North",marDatos);
			marOperandos.add("Center",botCalcular);
			marOperandos.add("South",marDistancia);
			
			marPrincipal.add("West",marOperandos);
			marPrincipal.add("East",marImagen);
			
			
			miVentana.add(marPrincipal);
			miVentana.setVisible(true);
			
		}
		
		public static void main(String []args) {
			
			new VentanaDistanciaEntreDosPuntos();
		}

}

