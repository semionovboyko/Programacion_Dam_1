package _05cambioMoneda2;
import java.awt.*;
import javax.swing.*;

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
	JButton botCambioDer = new JButton();
	JButton botCambioIzq = new JButton();
	
	
	public _05cambioMoneda() {
		
		miVentana.setSize(400,150);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marEuros.setLayout(new BorderLayout());
		marDolares.setLayout(new BorderLayout());
		marBotones.setLayout(new BorderLayout());
		
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
		txtEuros.setPreferredSize(new Dimension(80, 25));
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
		
		botCambioDer.setIcon(new ImageIcon(getClass().getResource("Derecha.gif")));
		botCambioDer.setPreferredSize(new Dimension(140, 40));
		botCambioDer.addActionListener(new CalcEuroDolar(txtEuros, txtDolares));
		
		botCambioIzq.setIcon(new ImageIcon(getClass().getResource("Izquierda.gif")));
		botCambioIzq.setPreferredSize(new Dimension(140, 40));
		botCambioIzq.addActionListener(new CalcDolarEuro(txtEuros, txtDolares));
		
		marEuros.add("North",etiEuros);
		marEuros.add("South",txtEuros);
		
		marDolares.add("North",etiDolares);
		marDolares.add("South",txtDolares);
		
		marBotones.add("North",botCambioDer);
		marBotones.add("South",botCambioIzq);
		
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
