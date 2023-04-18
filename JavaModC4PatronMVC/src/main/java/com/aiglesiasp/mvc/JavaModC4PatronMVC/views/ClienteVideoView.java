/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

/**
 * @author aitor
 *
 */
public class ClienteVideoView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnClientes;
	public JButton btnVideos;
	public JButton btnSalir;

	public ClienteVideoView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEjercicioCliente = new JLabel("PANEL CONTROL CLIENTES Y VIDEOS");
		lblEjercicioCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicioCliente.setBounds(75, 10, 300, 20);
		contentPane.add(lblEjercicioCliente);

		btnClientes = new JButton("CLIENTES");
		btnClientes.setBounds(30, 60, 120, 50);
		contentPane.add(btnClientes);

		btnVideos = new JButton("VIDEOS");
		btnVideos.setBounds(255, 60, 120, 50);
		contentPane.add(btnVideos);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(141, 167, 120, 50);
		contentPane.add(btnSalir);

	}
}
