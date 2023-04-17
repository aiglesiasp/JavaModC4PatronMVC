package com.aiglesiasp.mvc.JavaModC4PatronMVC.views;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class FirstExerciseView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnCreate;
	public JButton btnUpdate;
	public JButton btnRead;
	public JButton btnDelete;
	public JButton btnSalir;


	/**
	 * Create the frame.
	 */
	public FirstExerciseView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjercicioCliente = new JLabel("EJERCICIO 1 - CLIENTE");
		lblEjercicioCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicioCliente.setBounds(125, 10, 200, 20);
		contentPane.add(lblEjercicioCliente);
		
		btnCreate = new JButton("CREAR");
		btnCreate.setBounds(50, 50, 100, 100);
		contentPane.add(btnCreate);
		
		btnUpdate = new JButton("MODIFICAR");
		btnUpdate.setBounds(50, 150, 100, 100);
		contentPane.add(btnUpdate);
		
		btnRead = new JButton("BUSCAR");
		btnRead.setBounds(175, 50, 100, 100);
		contentPane.add(btnRead);
		
		btnDelete = new JButton("ELIMINAR");
		btnDelete.setBounds(175, 150, 100, 100);
		contentPane.add(btnDelete);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(300, 100, 100, 100);
		contentPane.add(btnSalir);
	}
}