package com.aiglesiasp.mvc.JavaModC4PatronMVC.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class WelcomeView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnEjercicio1;
	public JButton btnEjercicio2;
	public JButton btnEjercicio3;

	public WelcomeView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenidos. Elige uno de los ejercicios");
		lblNewLabel.setBounds(100, 10, 250, 20);
		contentPane.add(lblNewLabel);

		btnEjercicio1 = new JButton("Ejercicio1-Cliente");
		btnEjercicio1.setBounds(125, 60, 200, 30);
		contentPane.add(btnEjercicio1);

		btnEjercicio2 = new JButton("Ejercicio2-Videos");
		btnEjercicio2.setBounds(125, 120, 200, 30);
		contentPane.add(btnEjercicio2);

		btnEjercicio3 = new JButton("Ejercicio3-Cientificos");
		btnEjercicio3.setBounds(125, 180, 200, 30);
		contentPane.add(btnEjercicio3);
	}
}
