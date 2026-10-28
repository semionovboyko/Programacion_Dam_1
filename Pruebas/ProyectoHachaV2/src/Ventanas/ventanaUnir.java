package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import Funciones.Unir;
import Funciones.leerXML;

import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class ventanaUnir extends ventanaDividir {
	String rutabuena3;
	private JFrame frame;
	 File [] ficheros2 = new File [0];
	
	private JTextField textField_1;
	private JTextField textField_2;
	
	public ventanaUnir() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaUnir.class.getResource("/Ventanas/imagen.jpg")));
		frame.setVisible(true); 
		frame.setBounds(100, 100, 556, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		JPanel panel = new JPanel();
		panel.setBounds(130, 38, 346, 122);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		 DefaultListModel dml = new DefaultListModel();
		JList list = new JList(dml);
	

		list.setBounds(10, 11, 244, 45);
		//panel.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(list);
		scrollPane.setBounds(20, 11, 305, 96);
		panel.add(scrollPane);
			

		
		frame.setLocationRelativeTo(null);
		
		JButton btnBuscar = new JButton("Añadir");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setMultiSelectionEnabled(true);
				int seleccion = fileChooser.showOpenDialog(btnBuscar);
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
					if (seleccion==fileChooser.APPROVE_OPTION)
					
				{
					 File [] ficheros = fileChooser.getSelectedFiles();
					 ficheros2 = ficheros ;
					
					
					 for (int a = 0 ; ficheros2.length > a; a++) {
						 
						 dml.addElement(ficheros2[a]);
					 }
					
				
					

				}
				
				
				
			}
		});
		btnBuscar.setBounds(31, 61, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JLabel lblSeleccionaLasPartes = new JLabel("A\u00F1ade los ficheros que desees unir:");
		lblSeleccionaLasPartes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionaLasPartes.setBounds(27, 11, 301, 14);
		frame.getContentPane().add(lblSeleccionaLasPartes);
		
		
		
		JButton btnAtras = new JButton("Volver");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventanaMain nueva1 = new ventanaMain();
				frame.dispose();
			}
		});
		btnAtras.setBounds(379, 305, 81, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnBuscar_1 = new JButton("Destino");
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int seleccion = fileChooser.showOpenDialog(btnBuscar);
				
				if (seleccion==fileChooser.APPROVE_OPTION)
					
				{
					 File fichero = fileChooser.getSelectedFile();
					 String ruta = fichero.getPath();
					 textField_1.setText(ruta);
					rutabuena3 = ruta;
					
				}
			}
		});
		btnBuscar_1.setBounds(27, 196, 89, 23);
		frame.getContentPane().add(btnBuscar_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 197, 301, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 256, 171, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {".txt", ".gif", ".png", ".mp3", ".mp4"}));
		comboBox.setBounds(327, 255, 55, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnUnir = new JButton("Unir");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
						
		//System.out.println(rutabuena2+nombre);
				
				
				try {
				// llamo a la función leer xml y le paso el nombre del xml que esta guardado el la misma carpeta del proyecto
				String num = leerXML.leexml(nombreparaxml+".xml"); 
				//la funcion me devuelve un numero que guardo en num1
				int num1 =Integer.parseInt(num);
				// en num2 guardo las partes del fichero  y mas abajo en el if lo comparo y tienen que ser iguales a priori
				int  num2 = ficheros2.length;
				
				
				if (num1 ==  num2) {
					String rutafinal = textField_1.getText();
				String nombre = "\\"+ textField_2.getText();
				String extension = (String) comboBox.getSelectedItem();
				//SI soy iguales llama a la función unir con la rutafinal que es donde se va a guardar el nuevo fichero con el nuevo nuevo y su extension
				Funciones.Unir.UnirFicheros(ficheros2, new File (rutafinal+nombre+extension));
					JOptionPane.showMessageDialog(null, "Unión completada con éxito!!", "atención: " + "Unión completada", JOptionPane.INFORMATION_MESSAGE);}
				
				else {JOptionPane.showMessageDialog(null, "Unión incompleta!!", "atención: " + "Revise que todo este bien!!", JOptionPane.INFORMATION_MESSAGE);}
			} 
				
				
				
				catch (IOException e1) {
				
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
			
					
				}
			
				System.out.println(ficheros2.length);
			
				
				
			}
		});
		btnUnir.setBounds(51, 305, 89, 23);
		frame.getContentPane().add(btnUnir);
		JLabel lblNuevoNombre = new JLabel("Nuevo nombre:");
		lblNuevoNombre.setBounds(51, 258, 107, 17);
		frame.getContentPane().add(lblNuevoNombre);
		
		JButton btnQuitar = new JButton("Quitar");
		btnQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dml.removeAllElements();
			}
		});
		btnQuitar.setBounds(31, 113, 89, 23);
		frame.getContentPane().add(btnQuitar);
		
		
		
		
		

		

		
		
		
	}
}
