package Educacion;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

public class CentroGrafico {
	
	JFrame miVentana = new JFrame("Centro de estudios");
	JPanel marMensaje = new JPanel();
	JPanel marCentro = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtEstudios = new JTextField(10);
	
	JTextField txtMensaje1 = new JTextField(8);
	
	JButton botCentro = new JButton("Centro");
	JButton botLocalidad = new JButton();
	JLabel imgAsignatura = new JLabel();
	
	public static void main(String[] args) {
		new CentroGrafico();
	}
	
	public CentroGrafico() {
		
		
		
		txtMensaje1.setText("");
		txtMensaje1.setFont(new Font("Ariel",0,20));
		//txtMensaje1.setForeground(Color.BLUE);
		//txtMensaje1.setBackground(Color.WHITE);
		txtMensaje1.setHorizontalAlignment(JTextField.CENTER);
		
		
		imgAsignatura.setText("Estudios");
		imgAsignatura.setFont(new Font("Ariel", 0,20));
		imgAsignatura.setHorizontalAlignment(JTextField.CENTER);
		imgAsignatura.setIcon(new ImageIcon(getClass().getResource("Asignatura.gif")));
		imgAsignatura.setPreferredSize(new Dimension(110, 40));
		
		txtEstudios.setText("");
		txtEstudios.setFont(new Font("Ariel",0,20));
		//txtMensaje.setForeground(Color.BLUE);
		//txtMensaje.setBackground(Color.WHITE);
		txtEstudios.setHorizontalAlignment(JTextField.CENTER);
		
		
		botCentro.setIcon(new ImageIcon(getClass().getResource("Centro.gif")));
		botCentro.setFont(new Font("Sanz",1,14));
		botCentro.setPreferredSize(new Dimension(140, 40));
		botCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String quieroEstudiar= txtMensaje1.getText();
					String centro = Estudios.queCentroTeToca(quieroEstudiar);
					txtEstudios.setText(centro);
			
			}
		});
		
		botLocalidad.setIcon(new ImageIcon(getClass().getResource("Localidad.gif")));
		botLocalidad.setText("Localidad");
		botLocalidad.setFont(new Font("Sanz",1,14));
		botLocalidad.setPreferredSize(new Dimension(140, 40));
		botLocalidad.addActionListener(new Localidad(txtEstudios));
		
		
		marMensaje.add(imgAsignatura);
		marCentro.add(txtEstudios);
		marMensaje.add(txtMensaje1);
		
		marBotones.add(botCentro);
		marBotones.add(botLocalidad);
		miVentana.add("North", marMensaje);
		miVentana.add("Center", marCentro);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
}
