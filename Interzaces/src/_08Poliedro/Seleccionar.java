package _08Poliedro;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Seleccionar implements ActionListener{
	JComboBox<String> objcmbPoliedro;
	JLabel objimgPoliedro;
	public Seleccionar(JComboBox<String> cmbPoliedro, JLabel lblimgPoliedro) {
		objcmbPoliedro = cmbPoliedro;
		objimgPoliedro = lblimgPoliedro;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String seleccion= objcmbPoliedro.getSelectedItem()+".gif";
		objimgPoliedro.setIcon(new ImageIcon(getClass().getResource(seleccion)));
		
	}
}
