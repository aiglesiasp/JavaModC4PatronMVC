package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class FindView extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldId;
	public JButton btnBuscar;
	public JTextArea textAreaCliente;

	/**
	 * Create the frame.
	 */
	public FindView() {
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
		textAreaCliente.setBounds(46, 70, 381, 174);
		contentPane.add(textAreaCliente);
	}
}
