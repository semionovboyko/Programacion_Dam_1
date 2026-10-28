package _07Nif;
import java.awt.*;
import javax.swing.*;


public class VentanaNif {
	
	JFrame miVentana = new JFrame ("Nif");
	JTextField txtDni = new JTextField(10);
	
	JPanel marPrincipal = new JPanel();
	JPanel marIzquierdo = new JPanel();
	JPanel marDerecho = new JPanel();
	JPanel marBotones = new JPanel();
	
	JLabel etiDni = new JLabel();
	JLabel etiNIF = new JLabel();
	JLabel etiResultado = new JLabel();
	
	JButton botCalcular = new JButton();
	
	public VentanaNif() {
		
		miVentana.setSize(310,200);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miVentana.setLayout(new BorderLayout());
		marDerecho.setLayout(new BorderLayout());
		marIzquierdo.setLayout(new BorderLayout());
		
		txtDni.setText("");
		txtDni.setFont(new Font("Arial",1,14));
		txtDni.setForeground(Color.BLACK);
		txtDni.setBackground(Color.WHITE);
		txtDni.setHorizontalAlignment(JLabel.CENTER);
		txtDni.setPreferredSize(new Dimension(100,30));
		txtDni.setOpaque(true);
		
		etiDni.setText("DNI");
		etiDni.setFont(new Font("Arial",0,14));
		etiDni.setForeground(Color.BLUE);
		etiDni.setPreferredSize(new Dimension(50,85));
		etiDni.setVerticalAlignment(JTextField.TOP);
		
		
		etiNIF.setText("NIF");
		etiNIF.setFont(new Font("Arial",0,14));
		etiNIF.setForeground(Color.BLUE);
		etiNIF.setPreferredSize(new Dimension(50,25));
		etiNIF.setVerticalAlignment(JTextField.CENTER);
		
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setFont(new Font("Arial",0,14));
		botCalcular.setPreferredSize(new Dimension(100,50));
		botCalcular.setHorizontalAlignment(JButton.CENTER);
		botCalcular.addActionListener(new Calcular (txtDni,etiResultado));
		
		
		etiResultado.setText("");
		etiResultado.setFont(new Font("Arial",1,14));
		etiResultado.setForeground(Color.BLACK);
		etiResultado.setBackground(Color.WHITE);
		etiResultado.setHorizontalAlignment(JLabel.CENTER);
		etiResultado.setPreferredSize(new Dimension(100,30));
		etiResultado.setOpaque(true);
		
		marIzquierdo.add("North",etiDni);
		marIzquierdo.add("South",etiNIF);
		
		marBotones.add(botCalcular);
		
		marDerecho.add("North",txtDni);
		marDerecho.add("Center",marBotones);
		marDerecho.add("South",etiResultado);

		marPrincipal.add(marIzquierdo);
		marPrincipal.add(marDerecho);
		
		miVentana.add("North",marPrincipal);
		miVentana.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VentanaNif();

	}

}
