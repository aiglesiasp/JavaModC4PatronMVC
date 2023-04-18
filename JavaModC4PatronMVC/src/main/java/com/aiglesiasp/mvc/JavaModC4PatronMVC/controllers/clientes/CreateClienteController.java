/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.ClienteModel;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.ClienteConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.ClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.CreateClienteView;

/**
 * @author aitor
 *
 */
public class CreateClienteController implements ActionListener {

	private CreateClienteView view;
	private ClienteConnector connector;

	public CreateClienteController(CreateClienteView view) {
		this.view = view;
		this.view.btnAceptar.addActionListener(this);
	}

	public void initView() {
		view.setTitle("CREATE CLIENTE");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean estado = false;
		Pattern pat;
		Matcher mat;
		if (view.btnAceptar == e.getSource()) {
			String nombre = view.textNombre.getText();
			String apellido = view.textApellido.getText();
			String direccion = view.textDireccion.getText();
			String dniText = view.textDni.getText();
			// Comprovar cadena
			pat = Pattern.compile("[^a-zA-Z]*");
			mat = pat.matcher(dniText);

			if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || dniText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
				estado = true;
			} else if (!mat.matches() || dniText.length() >= 11) {
				JOptionPane.showMessageDialog(null, "Formato DNI Incorrecto");
				estado = true;
			} else {
				int dni = Integer.parseInt(dniText);
				ClienteModel c = new ClienteModel(nombre, apellido, direccion, dni);
				connector = new ClienteConnector();
				connector.insertDataCliente(c);
				connector.closeConnection();
				JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
				estado = false;
			}
			ClienteView v = new ClienteView();
			ClienteController c = new ClienteController(v);
			c.initView();
			view.setVisible(estado);
		}

	}

}
