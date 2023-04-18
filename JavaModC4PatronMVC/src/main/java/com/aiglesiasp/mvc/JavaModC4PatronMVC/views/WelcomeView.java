package com.aiglesiasp.mvc.JavaModC4PatronMVC.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class WelcomeView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnEjercicio12;
	public JButton btnEjercicio3;

	public WelcomeView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenidos. Elige uno de los ejercicios");
		lblNewLabel.setBounds(100, 10, 250, 20);
		contentPane.add(lblNewLabel);

		btnEjercicio12 = new JButton("CLIENTE-VIDEO");
		btnEjercicio12.setBounds(125, 60, 200, 60);
		contentPane.add(btnEjercicio12);

		btnEjercicio3 = new JButton("CIENTIFICOS");
		btnEjercicio3.setBounds(125, 180, 200, 60);
		contentPane.add(btnEjercicio3);
	}
}
