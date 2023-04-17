package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UpdateClienteView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFieldID;
	public JTextField textFieldNombre;
	public JTextField textFieldApellidos;
	public JTextField textFieldDireccion;
	public JTextField textFieldDNI;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnAtras;

	/**
	 * Create the frame.
	 */
	public UpdateClienteView() {
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

		JLabel lblNewLabel_1_1 = new JLabel("NOMBRE:");
		lblNewLabel_1_1.setBounds(10, 30, 65, 30);
		panelCliente.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("APELLIDOS: ");
		lblNewLabel_1_2.setBounds(10, 70, 76, 30);
		panelCliente.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("DIRECCION: ");
		lblNewLabel_1_3.setBounds(10, 110, 96, 30);
		panelCliente.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("DNI:");
		lblNewLabel_1_4.setBounds(250, 30, 36, 30);
		panelCliente.add(lblNewLabel_1_4);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(100, 30, 130, 30);
		panelCliente.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(100, 70, 130, 30);
		panelCliente.add(textFieldApellidos);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(100, 110, 130, 30);
		panelCliente.add(textFieldDireccion);

		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(302, 30, 130, 30);
		panelCliente.add(textFieldDNI);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(279, 72, 117, 29);
		panelCliente.add(btnModificar);

		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(279, 123, 117, 29);
		panelCliente.add(btnAtras);
	}
}
