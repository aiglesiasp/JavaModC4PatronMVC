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
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.DeleteClienteView;

/**
 * @author aitor
 *
 */
public class DeleteClienteController implements ActionListener {

	private DeleteClienteView view;
	private ClienteConnector connector;
	private int id;

	public DeleteClienteController(DeleteClienteView view) {
		this.view = view;
		this.view.btnBuscar.addActionListener(this);
		this.view.btnEliminar.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
	}

	public void initView() {
		view.setTitle("ELIMINAR CLIENTE");
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
			idText = view.textFieldId.getText();
			if (idText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
			} else {
				id = Integer.parseInt(idText);
				connector = new ClienteConnector();
				c = connector.findDataCliente(id);
				connector.closeConnection();
				if (c == null) {
					JOptionPane.showMessageDialog(null, "No existe ese Cliente");
				} else {
					view.textAreaCliente.setText("");
					view.textAreaCliente.append("ID: " + c.getId() + "\n");
					view.textAreaCliente.append("NOMBRE: " + c.getNombre() + "\n");
					view.textAreaCliente.append("APELLIDO: " + c.getApellido() + "\n");
					view.textAreaCliente.append("DIRECCION: " + c.getDireccion() + "\n");
					view.textAreaCliente.append("DNI: " + c.getDni() + "\n");
					view.textAreaCliente.append("FECHA: " + c.getFecha().toString() + "\n");
				}
			}

			view.setVisible(true);
		}
		if (view.btnEliminar == e.getSource()) {
			String opcion = JOptionPane.showInputDialog("Estas seguro que quieres eliminar? SI/NO");
			if (opcion.equals("SI")) {
				connector = new ClienteConnector();
				connector.deleteDataCliente(id);
				connector.closeConnection();
				view.textAreaCliente.setText("");
				JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente");
			}

		}

		if (view.btnAtras == e.getSource()) {
			ClienteView v = new ClienteView();
			ClienteController cv = new ClienteController(v);
			cv.initView();
			view.setVisible(false);

		}

	}

}
