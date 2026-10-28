package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import Funciones.crearXML;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SpinnerNumberModel;

public class ventanaDividir  {

	public JFrame frame;
	public  JTextField textField;
	public JTextField textField_1;
	 String rutabuena;
	 String rutabuena2;
	 File fichero1;
	 int valorspiner1;
	 static String nombreparaxml;
	 long tamañofichero;
	 int npartesparaxml;
	 
	
	 /**
	  * @wbp.parser.entryPoint
	  */
	 public void ventanaDividireje() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaDividir.class.getResource("/Ventanas/imagen.jpg")));
		frame.setVisible(true); 
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 47, 277, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// boton buscar para buscar el archivo que se desea dividir
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// filechooser nos permite navegar por el ordenador y buscarlo
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(btnBuscar);
				
				if (seleccion==fileChooser.APPROVE_OPTION)
					
				{
					// GUARDAMOS EL FICHERO en la variable fichero 
					File fichero = fileChooser.getSelectedFile();
					// guardamos la ruta del fichero que se va a utilizar  para agregarla al textfield
					  String ruta = fichero.getPath();
					 textField.setText(ruta);
					 rutabuena = ruta;
					//PARA pasarle los parametros al  XML y poder crearlo en base al fichero.
					nombreparaxml =fichero.getName();
					//System.out.println(nombreparaxml);
					tamañofichero =  fichero.length();

				}
			}
		});
		btnBuscar.setBounds(307, 46, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//donde se va a guardar el archivo
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int seleccion = fileChooser.showOpenDialog(btnBuscar);
				
				if (seleccion==fileChooser.APPROVE_OPTION)
					
				{
					 File fichero = fileChooser.getSelectedFile();
					 fichero1 = fichero;
					 String ruta = fichero.getPath();
					 //añadimos la ruta al textfield y luego la guardamos en una variable para utilizarla mas tarde
					 textField_1.setText(ruta);
					rutabuena2 = ruta;
			
					

				}
			}
		});
		btnBuscar_1.setBounds(307, 144, 89, 23);
		frame.getContentPane().add(btnBuscar_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 145, 277, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSeleccionaElArchivo = new JLabel("Selecciona la ruta del archivo a dividir...");
		lblSeleccionaElArchivo.setBounds(20, 22, 232, 14);
		frame.getContentPane().add(lblSeleccionaElArchivo);
		
		JLabel lblSelecc = new JLabel("Selecciona la ruta donde guardar las partes...");
		lblSelecc.setBounds(20, 120, 232, 14);
		frame.getContentPane().add(lblSelecc);
		
	
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2, 2, 10, 1));
		spinner.setBounds(228, 78, 44, 31);
		frame.getContentPane().add(spinner);
		
		JLabel lblNmeroDePartes = new JLabel("N\u00FAmero de partes...");
		lblNmeroDePartes.setBounds(105, 86, 113, 14);
		frame.getContentPane().add(lblNmeroDePartes);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventanaMain nueva = new ventanaMain();
				frame.dispose();
			}
		});
		
		
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
								
				try {
					int valorspiner = (Integer) spinner.getValue(); 
					//para el xml
					npartesparaxml = valorspiner;
					//llamo a la función  dividir y le paso la rutabuena que es el fichero, el valorspiner y la rutabuena2 que es donde esta el fichero.
					Funciones.Dividir.splitFile(new File(rutabuena),valorspiner,new File (rutabuena2));
					 JOptionPane.showMessageDialog(null, "División completada con éxito!!", "atención: " + "División completa", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (IOException b) {
					JOptionPane.showMessageDialog(null, "No se pudo dividir", "atención: " + "División incompleta", JOptionPane.INFORMATION_MESSAGE);
					b.printStackTrace();
				}
			
				crearXML xml1 = new crearXML();
			try {
				//creacion del xml mandandole los parametros necesarios.
				xml1.XML(nombreparaxml, tamañofichero , npartesparaxml, rutabuena2, new File(nombreparaxml+".xml"));
				System.out.println(rutabuena2+"\\"+nombreparaxml);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			}
		});
		btnDividir.setBounds(50, 209, 89, 23);
		frame.getContentPane().add(btnDividir);
		btnVolver.setBounds(228, 209, 89, 23);
		frame.getContentPane().add(btnVolver);
		frame.setLocationRelativeTo(null);
	}
}
