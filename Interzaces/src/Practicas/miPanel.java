package Practicas;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import _03Nombre.Nombre;

public class miPanel extends JFrame{

		
		JPanel contentPane = new JPanel();
		JTextField txtMensaje = new JTextField(20);
		JButton botAceptar = new JButton();
		private JRadioButton rdbtnMujer;
		private JRadioButton rdbtnHombre;
		private JTextField tfEdad;
		private final ButtonGroup buttonGroup = new ButtonGroup();
		
		public miPanel() {
			//TABLA
			setTitle("");
			setSize(800,220);//Tamaño
			setBounds(100, 100, 470, 361);//Limites
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Layout decide cómo se reparten los botones (Y demás controles)
			//dentro de la ventana. qué posición van 
			//los botones y demás componentes, si van alineados, en 
			//forma de matriz, cuáles se hacen grandes
			//al agrandar la ventana, etc
			setLayout(new FlowLayout()); 
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
			JPanel panel = new JPanel();
			contentPane.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING,
					TitledBorder.TOP, null, null));
			contentPane.setBounds(33, 11, 175, 55);
			contentPane.add(panel);
			
			JLabel lblEdad = new JLabel("Edad");
			lblEdad.setHorizontalAlignment(SwingConstants.TRAILING);
			lblEdad.setBounds(11, 80, 142, 14);
			contentPane.add(lblEdad);
			
			tfEdad = new JTextField();
			tfEdad.setBounds(159, 77, 50, 20);
			contentPane.add(tfEdad);
			tfEdad.setColumns(10);
			
			rdbtnHombre = new JRadioButton("Hombre");
			buttonGroup.add(rdbtnHombre);
			rdbtnHombre.setSelected(true);
			panel.add(rdbtnHombre);

			rdbtnMujer = new JRadioButton("Mujer");
			buttonGroup.add(rdbtnMujer);
			panel.add(rdbtnMujer);
			
			txtMensaje.setText("");
			txtMensaje.setFont(new Font("Ariel",0,20));
			txtMensaje.setForeground(Color.BLUE);
			txtMensaje.setBackground(Color.YELLOW);
			txtMensaje.setHorizontalAlignment(JTextField.CENTER);
			
			botAceptar.setIcon(new ImageIcon(getClass().getResource("Aceptar.gif")));
			botAceptar.setText("Aceptar");
			botAceptar.setFont(new Font("Arial",0,14));
			botAceptar.setPreferredSize(new Dimension(120, 40));
			botAceptar.addActionListener(new Nombre(txtMensaje));
			
			//contentPane.add(txtMensaje);
			//contentPane.add(botAceptar);
			add(contentPane);
			add(contentPane);
			setVisible(true);
		}
		
		public static void main(String [] args) {
			
		new miPanel();
		
		}
}



