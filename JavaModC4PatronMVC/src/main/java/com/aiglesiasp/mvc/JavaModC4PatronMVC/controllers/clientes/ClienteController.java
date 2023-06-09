/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.ClienteVideoController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.WelcomeController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.ClienteVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.ClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.CreateClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.DeleteClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.FindClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.UpdateClienteView;

/**
 * @author aitor
 *
 */
public class ClienteController implements ActionListener {

	private ClienteView view;

	public ClienteController(ClienteView view) {
		this.view = view;
		this.view.btnCreate.addActionListener(this);
		this.view.btnUpdate.addActionListener(this);
		this.view.btnRead.addActionListener(this);
		this.view.btnDelete.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
	}

	public void initView() {
		view.setTitle("PANTALLA DE CLIENTE");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean estado = true;
		if (view.btnCreate == e.getSource()) {
			CreateClienteView v = new CreateClienteView();
			CreateClienteController c = new CreateClienteController(v);
			estado = false;
			c.initView();
		}

		if (view.btnUpdate == e.getSource()) {
			UpdateClienteView v = new UpdateClienteView();
			UpdateClienteController c = new UpdateClienteController(v);
			estado = false;
			c.initView();
		}

		if (view.btnRead == e.getSource()) {
			FindClienteView v = new FindClienteView();
			FindClienteController c = new FindClienteController(v);
			estado = false;
			c.initView();
		}

		if (view.btnDelete == e.getSource()) {
			DeleteClienteView v = new DeleteClienteView();
			DeleteClienteController c = new DeleteClienteController(v);
			estado = false;
			c.initView();
		}

		if (view.btnSalir == e.getSource()) {
			ClienteVideoView v = new ClienteVideoView();
			ClienteVideoController c = new ClienteVideoController(v);
			estado = false;
			c.initView();
		}
		view.setVisible(estado);

	}

}
