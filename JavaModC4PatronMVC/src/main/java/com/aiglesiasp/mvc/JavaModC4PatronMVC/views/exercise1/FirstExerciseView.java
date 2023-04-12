package com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1;



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
		
		btnCreate = new JButton("CREATE");
		btnCreate.setBounds(50, 50, 100, 30);
		contentPane.add(btnCreate);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(50, 100, 100, 30);
		contentPane.add(btnUpdate);
		
		btnRead = new JButton("READ");
		btnRead.setBounds(175, 50, 100, 30);
		contentPane.add(btnRead);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(175, 100, 100, 30);
		contentPane.add(btnDelete);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(300, 100, 100, 30);
		contentPane.add(btnSalir);
	}
}
