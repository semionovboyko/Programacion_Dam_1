package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ventanaMain {

	private JFrame frame;

	/**
	 * VENTANA MAIN PARA EJECUTAR TODO DESDE AQUI
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaMain window = new ventanaMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaMain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaMain.class.getResource("/Ventanas/imagen.jpg")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			ventanaDividir nueva1 = new ventanaDividir();
			nueva1.ventanaDividireje();
			frame.dispose();
				
			}
			
		});
		btnDividir.setBounds(23, 40, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnUnir = new JButton("Unir");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventanaUnir nueva = new ventanaUnir();
				frame.dispose();
				
			}
		});
		btnUnir.setBounds(23, 125, 89, 23);
		frame.getContentPane().add(btnUnir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ventanaMain.class.getResource("/Ventanas/images.png")));
		label.setBounds(160, 29, 228, 221);
		frame.getContentPane().add(label);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(23, 206, 89, 23);
		frame.getContentPane().add(btnSalir);
		frame.setLocationRelativeTo(null);
	}
}
