package _02ejercios;
import java.awt.*;
import javax.swing.*;

public class _02Bienvenido {
	
	JFrame miVentana = new JFrame ();
	JPanel marPrincipal = new JPanel();
	JTextField txtBienvenido = new JTextField(20);
	
	public _02Bienvenido() {
		
		miVentana.setTitle("¡Bienvenido!");
		miVentana.setSize(400,100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtBienvenido.setText("Bienvenido a Java");
		txtBienvenido.setFont(new Font("Ariel",0,20));
		txtBienvenido.setForeground(Color.BLUE);
		txtBienvenido.setBackground(Color.YELLOW);
		txtBienvenido.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBienvenido);
		miVentana.add("North", marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		new _02Bienvenido();
	}
}
