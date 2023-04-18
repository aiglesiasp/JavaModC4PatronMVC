package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateVideoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTitle;
	public JTextField textDirector;
	public JTextField textCliID;
	public JButton btnAceptar;

	/**
	 * Create the frame.
	 */
	public CreateVideoView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitleNewClient = new JLabel("Introduce los datos nuevos del video:");
		lblTitleNewClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleNewClient.setBounds(75, 10, 300, 20);
		contentPane.add(lblTitleNewClient);

		JLabel lblTitle = new JLabel("TITLE:");
		lblTitle.setBounds(10, 40, 100, 30);
		contentPane.add(lblTitle);

		JLabel lblDirector = new JLabel("DIRECTOR:");
		lblDirector.setBounds(10, 80, 100, 30);
		contentPane.add(lblDirector);

		JLabel lblCliente = new JLabel("ID CLIENTE:");
		lblCliente.setBounds(10, 120, 100, 30);
		contentPane.add(lblCliente);

		textTitle = new JTextField();
		textTitle.setBounds(120, 40, 200, 30);
		contentPane.add(textTitle);
		textTitle.setColumns(10);

		textDirector = new JTextField();
		textDirector.setColumns(10);
		textDirector.setBounds(120, 80, 200, 30);
		contentPane.add(textDirector);

		textCliID = new JTextField();
		textCliID.setColumns(10);
		textCliID.setBounds(120, 120, 200, 30);
		contentPane.add(textCliID);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(125, 220, 200, 29);
		contentPane.add(btnAceptar);

	}
}
