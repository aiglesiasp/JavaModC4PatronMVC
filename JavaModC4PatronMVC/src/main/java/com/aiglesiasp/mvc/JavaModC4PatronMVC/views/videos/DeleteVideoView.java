package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class DeleteVideoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFieldId;
	public JButton btnBuscar;
	public JTextArea textAreaCliente;
	public JButton btnEliminar;
	public JButton btnAtras;

	/**
	 * Create the frame.
	 */
	public DeleteVideoView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduce el ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 28, 120, 30);
		contentPane.add(lblNewLabel);

		textFieldId = new JTextField();
		textFieldId.setBounds(168, 30, 130, 26);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(310, 30, 117, 29);
		contentPane.add(btnBuscar);

		textAreaCliente = new JTextArea();
		textAreaCliente.setBounds(46, 70, 381, 151);
		contentPane.add(textAreaCliente);

		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(310, 237, 117, 29);
		contentPane.add(btnEliminar);

		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(6, 237, 117, 29);
		contentPane.add(btnAtras);
	}
}
