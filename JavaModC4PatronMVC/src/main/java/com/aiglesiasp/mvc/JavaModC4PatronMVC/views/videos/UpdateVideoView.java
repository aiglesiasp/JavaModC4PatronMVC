package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateVideoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFieldID;
	public JTextField textFieldTitle;
	public JTextField textFieldDirector;
	public JTextField textFieldCliente;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnAtras;

	/**
	 * Create the frame.
	 */
	public UpdateVideoView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelID = new JPanel();
		panelID.setBounds(6, 6, 438, 79);
		contentPane.add(panelID);
		panelID.setLayout(null);

		JLabel lblNewLabel = new JLabel("BUSCAR");
		lblNewLabel.setBounds(6, 6, 100, 16);
		panelID.add(lblNewLabel);

		textFieldID = new JTextField();
		textFieldID.setBounds(117, 32, 130, 30);
		panelID.add(textFieldID);
		textFieldID.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(77, 39, 29, 16);
		panelID.add(lblNewLabel_1);

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(272, 34, 117, 29);
		panelID.add(btnBuscar);

		JPanel panelCliente = new JPanel();
		panelCliente.setBounds(6, 97, 438, 169);
		contentPane.add(panelCliente);
		panelCliente.setLayout(null);

		JLabel lblModificar = new JLabel("MODIFICAR");
		lblModificar.setBounds(6, 6, 100, 16);
		panelCliente.add(lblModificar);

		JLabel lblTitle = new JLabel("TITLE:");
		lblTitle.setBounds(10, 30, 65, 30);
		panelCliente.add(lblTitle);

		JLabel lblDirector = new JLabel("DIRECTOR:");
		lblDirector.setBounds(10, 70, 76, 30);
		panelCliente.add(lblDirector);

		JLabel lblCliente = new JLabel("ID CLIENTE:");
		lblCliente.setBounds(10, 110, 96, 30);
		panelCliente.add(lblCliente);

		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(100, 30, 130, 30);
		panelCliente.add(textFieldTitle);
		textFieldTitle.setColumns(10);

		textFieldDirector = new JTextField();
		textFieldDirector.setColumns(10);
		textFieldDirector.setBounds(100, 70, 130, 30);
		panelCliente.add(textFieldDirector);

		textFieldCliente = new JTextField();
		textFieldCliente.setColumns(10);
		textFieldCliente.setBounds(100, 110, 130, 30);
		panelCliente.add(textFieldCliente);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(279, 32, 117, 29);
		panelCliente.add(btnModificar);

		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(279, 112, 117, 29);
		panelCliente.add(btnAtras);
	}
}
