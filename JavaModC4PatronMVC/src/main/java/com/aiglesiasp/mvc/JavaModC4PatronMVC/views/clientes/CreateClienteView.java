package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateClienteView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textNombre;
	public JTextField textApellido;
	public JTextField textDireccion;
	public JTextField textDni;
	public JButton btnAceptar;

	/**
	 * Create the frame.
	 */
	public CreateClienteView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitleNewClient = new JLabel("Introduce los datos del nuevo cliente:");
		lblTitleNewClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleNewClient.setBounds(75, 10, 300, 20);
		contentPane.add(lblTitleNewClient);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(10, 40, 100, 30);
		contentPane.add(lblNombre);

		JLabel lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setBounds(10, 80, 100, 30);
		contentPane.add(lblApellidos);

		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setBounds(10, 120, 100, 30);
		contentPane.add(lblDireccion);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 160, 100, 30);
		contentPane.add(lblDni);

		textNombre = new JTextField();
		textNombre.setBounds(120, 40, 200, 30);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(120, 80, 200, 30);
		contentPane.add(textApellido);

		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(120, 120, 200, 30);
		contentPane.add(textDireccion);

		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(120, 160, 200, 30);
		contentPane.add(textDni);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(125, 220, 200, 29);
		contentPane.add(btnAceptar);

	}
}
