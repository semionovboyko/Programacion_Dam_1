package _08Poliedro;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class ventanaPoliedros {
	

	JFrame miVentana = new JFrame("Poliedros");
	JPanel marPrincipal = new JPanel();
	JPanel marDatos = new JPanel();
	JPanel marIzquierdo = new JPanel();
	JPanel marLista = new JPanel();
	JPanel marArista = new JPanel();
	JLabel etiArista = new JLabel();
	JTextField txtArista= new JTextField(10);
	JPanel marResultados = new JPanel();
	JLabel etiArea = new JLabel();
	JLabel etiResultado = new JLabel();
	JButton botCalcular = new JButton();
	Font fuente = new Font("Arial", 0,14);
	Border linea = BorderFactory.createLineBorder(Color.GRAY);
	TitledBorder titdatos = BorderFactory.createTitledBorder(linea,
			"Datos", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
	TitledBorder titresultado = BorderFactory.createTitledBorder(linea,
			"Resultado", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
	String[] lista = { "Tetraedro", "Cubo o Hexaedro", "Octaedro", "Dodecaedro", "Icosaedro"};
	JComboBox cmbPoliedro = new JComboBox(lista);
	JLabel imgPoliedro = new JLabel();
	JLabel etiLista = new JLabel();
	
	public ventanaPoliedros(){
		
		miVentana.setSize(300,315);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marArista.setLayout(new BorderLayout());
		marLista.setLayout(new BorderLayout());
		marIzquierdo.setLayout(new BorderLayout());
		marPrincipal.setLayout(new BorderLayout());
		
		//Font fuente = new Font("Arial",0,14);
		//Border linea = BorderFactory.createLineBorder(Color.GRAY);
		//TitledBorder titDatos = BorderFactory.createTitledBorder(linea,"Datos",
						//	TitledBorder.LEFT,TitledBorder.TOP, fuente, Color.RED);
		marDatos.setBorder(titdatos);
		
		etiArista.setText("Arista (cm) ");
		etiArista.setFont(new Font ("Arial", 0, 14));
		etiArista.setForeground(Color.BLACK);
		etiArista.setPreferredSize(new Dimension(140, 25));
		etiArista.setHorizontalAlignment(JTextField.CENTER);
		etiArista.setVerticalAlignment(JTextField.TOP);
		
		etiLista.setText("Tipo Poliedro");
		etiLista.setFont(new Font("Arial",0,14));
		etiLista.setForeground(Color.BLUE);
		etiLista.setPreferredSize(new Dimension(70,25));
		etiLista.setVerticalAlignment(JTextField.TOP);
		
		txtArista.setText("");
		txtArista.setFont(new Font("Ariel",0,10));
		txtArista.setForeground(Color.BLACK);
		txtArista.setBackground(Color.WHITE);
		txtArista.setPreferredSize(new Dimension(30, 25));
		txtArista.setHorizontalAlignment(JTextField.CENTER);
		txtArista.setOpaque(true);
		
		etiArea.setText("Raiz cuadrada: ");
		etiArea.setFont(new Font ("Arial", 0, 14));
		etiArea.setForeground(Color.BLACK);
		etiArea.setPreferredSize(new Dimension(110, 25));
		etiArea.setHorizontalAlignment(JTextField.CENTER);
		etiArea.setVerticalAlignment(JTextField.TOP);
		
		
		etiResultado.setText("");
		etiResultado.setFont(new Font ("Arial", 1, 14));
		etiResultado.setForeground(Color.BLUE);
		etiResultado.setBackground(Color.ORANGE);
		etiResultado.setPreferredSize(new Dimension(160, 25));
		etiResultado.setHorizontalAlignment(JTextField.CENTER);
		etiResultado.setOpaque(true);
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(130, 50));
		botCalcular.addActionListener( new Calcular(cmbPoliedro, txtArista ,etiResultado));
		botCalcular.setHorizontalAlignment(JButton.CENTER);
		
		imgPoliedro.setIcon(new ImageIcon(getClass().getResource("Tetraedro.gif")));
		imgPoliedro.setPreferredSize(new Dimension(150,150));
		imgPoliedro.setHorizontalAlignment(JLabel.CENTER);
		imgPoliedro.setVerticalAlignment(JLabel.CENTER);
		
		//TitledBorder titResultado = BorderFactory.createTitledBorder(linea,"Resultado",
				//TitledBorder.LEFT,TitledBorder.TOP, fuente, Color.RED);
		marResultados.setBorder(titresultado);
		
		cmbPoliedro.setFont(fuente);
		cmbPoliedro.setSelectedIndex(0);
		cmbPoliedro.setBackground(Color.YELLOW);
		cmbPoliedro.setForeground(Color.BLUE);
		cmbPoliedro.addActionListener( new Seleccionar(cmbPoliedro, imgPoliedro));
		
		marResultados.add(etiArea);
		marResultados.add(etiResultado);
		
		marArista.add("North",etiArista);
		marArista.add("South",txtArista);
		
		marLista.add("North",etiLista);
		marLista.add("South",cmbPoliedro);
		
		marIzquierdo.add("North",marLista);
		marIzquierdo.add(marArista);
		marIzquierdo.add("South",botCalcular);
		
		marDatos.add(marIzquierdo);
		marDatos.add(imgPoliedro);
	
		marPrincipal.add("North",marDatos);
		marPrincipal.add("South",marResultados);
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ventanaPoliedros();
}
}

