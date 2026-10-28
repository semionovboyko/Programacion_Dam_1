package _07Dividir;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class ventanaDividir {
	
	JFrame miVentana = new JFrame("Concentracion");
	JPanel marPrincipal = new JPanel();
	JPanel marSup = new JPanel();
	JPanel marOperandos= new JPanel();
	Font fuente = new Font("Arial", 0,14);
	Border linea = BorderFactory.createLineBorder(Color.GRAY);
	TitledBorder titOperandos = BorderFactory.createTitledBorder(linea,
			"Operandos", TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.RED);
	JPanel marDivi = new JPanel();
	JLabel etiDivi = new JLabel();
	JTextField txtDivi= new JTextField(10);
	JPanel marDivisor = new JPanel();
	JLabel etiDivisor = new JLabel();
	JTextField txtDivisor= new JTextField(10);
	JPanel marSupe = new JPanel();
	JLabel etiCocien = new JLabel();
	JLabel etiResult = new JLabel();
	JButton botCalcular = new JButton("Calcular");
	
	public ventanaDividir() {
		
		miVentana.setSize(500,205);//anchura - altura
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		marPrincipal.setLayout(new BorderLayout());
		//marSup.setLayout(new BorderLayout());
		marOperandos.setLayout(new BorderLayout());
		marOperandos.setBorder(titOperandos);
		
		
		etiDivi.setText("Dividiendo ");
		etiDivi.setFont(new Font ("Arial", 0, 14));
		etiDivi.setForeground(Color.BLACK);
		etiDivi.setPreferredSize(new Dimension(140, 25));
		etiDivi.setHorizontalAlignment(JTextField.CENTER);
		etiDivi.setVerticalAlignment(JTextField.TOP);
		
		txtDivi.setText("");
		txtDivi.setFont(new Font("Ariel",0,10));
		txtDivi.setForeground(Color.BLACK);
		txtDivi.setBackground(Color.WHITE);
		txtDivi.setPreferredSize(new Dimension(30, 25));
		txtDivi.setHorizontalAlignment(JTextField.CENTER);
		
		etiDivisor.setText("Divisor ");
		etiDivisor.setFont(new Font ("Arial", 0, 14));
		etiDivisor.setForeground(Color.BLACK);
		etiDivisor.setPreferredSize(new Dimension(140, 25));
		etiDivisor.setHorizontalAlignment(JTextField.CENTER);
		etiDivisor.setVerticalAlignment(JTextField.TOP);
		
		txtDivisor.setText("");
		txtDivisor.setFont(new Font("Ariel",0,10));
		txtDivisor.setForeground(Color.BLACK);
		txtDivisor.setBackground(Color.WHITE);
		txtDivisor.setPreferredSize(new Dimension(30, 25));
		txtDivisor.setHorizontalAlignment(JTextField.CENTER);
		
		etiCocien.setText("Cociente ");
		etiCocien.setFont(new Font ("Arial", 0, 14));
		etiCocien.setForeground(Color.BLACK);
		etiCocien.setPreferredSize(new Dimension(110, 25));
		etiCocien.setHorizontalAlignment(JTextField.CENTER);
		etiCocien.setVerticalAlignment(JTextField.TOP);
		
		etiResult.setText("");
		etiResult.setFont(new Font ("Arial", 1, 14));
		etiResult.setForeground(Color.BLUE);
		etiResult.setBackground(Color.ORANGE);
		etiResult.setPreferredSize(new Dimension(160, 25));
		etiResult.setHorizontalAlignment(JTextField.CENTER);
		etiResult.setOpaque(true);
		
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(160, 85));
		botCalcular.addActionListener(new CalcularDivi(txtDivi, txtDivisor, etiResult));
		
		marSupe.add(etiCocien);
		marSupe.add(etiResult);
		
		marDivisor.add(etiDivisor);
		marDivisor.add(txtDivisor);
		
		marDivi.add(etiDivi);
		marDivi.add(txtDivi);
		
		marOperandos.add("North",marDivi);
		marOperandos.add("South",marDivisor);
		
		marSup.add(marOperandos);
		marSup.add(botCalcular);
		
		
		marPrincipal.add("North",marSup);
		marPrincipal.add("Center",marSupe);
		
		miVentana.add(marPrincipal);
		miVentana.setVisible(true);
		
	}
	
	public static void main(String []args) {
		
		new ventanaDividir();
	}

}
