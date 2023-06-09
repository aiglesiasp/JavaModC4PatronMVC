/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.ClienteModel;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.ClienteConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.ClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.UpdateClienteView;

/**
 * @author aitor
 *
 */
public class UpdateClienteController implements ActionListener {

	private UpdateClienteView view;
	private ClienteConnector connector;
	private int id;

	public UpdateClienteController(UpdateClienteView view) {
		this.view = view;
		this.view.btnBuscar.addActionListener(this);
		this.view.btnModificar.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
	}

	public void initView() {
		view.setTitle("MODIFICAR CLIENTE");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String idText = "";
		ClienteModel c = new ClienteModel();
		if (view.btnBuscar == e.getSource()) {
			idText = view.textFieldID.getText();
			if (idText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No has introducido ningun ID");
			} else {
				id = Integer.parseInt(idText);
				connector = new ClienteConnector();
				c = connector.findDataCliente(id);
				connector.closeConnection();
				if (c == null) {
					JOptionPane.showMessageDialog(null, "No existe ese Cliente");
				} else {
					view.textFieldNombre.setText(c.getNombre());
					view.textFieldApellidos.setText(c.getApellido());
					view.textFieldDireccion.setText(c.getDireccion());
					view.textFieldDNI.setText("" + c.getDni());

				}
			}
			view.setVisible(true);
		}

		if (view.btnModificar == e.getSource()) {
			String nombre = view.textFieldNombre.getText();
			String apellidos = view.textFieldApellidos.getText();
			String direccion = view.textFieldDireccion.getText();
			String dniText = view.textFieldDNI.getText();

			if (nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || dniText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
			} else {
				int dni = Integer.parseInt(dniText);
				ClienteModel c1 = new ClienteModel(nombre, apellidos, direccion, dni);
				c1.setId(id);
				connector = new ClienteConnector();
				connector.updateDataCliente(c1);
				connector.closeConnection();
				view.textFieldID.setText("");
				view.textFieldNombre.setText("");
				view.textFieldApellidos.setText("");
				view.textFieldDireccion.setText("");
				view.textFieldDNI.setText("");
				JOptionPane.showMessageDialog(null, "Usuario modificado correctamente");
			}
			view.setVisible(true);

		}

		if (view.btnAtras == e.getSource()) {
			ClienteView v = new ClienteView();
			ClienteController cv = new ClienteController(v);
			cv.initView();
			view.setVisible(false);
		}

	}

}
