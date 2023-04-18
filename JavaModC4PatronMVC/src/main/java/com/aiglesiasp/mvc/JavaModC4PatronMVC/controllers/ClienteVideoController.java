/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.clientes.ClienteController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.videos.VideoController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.ClienteVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.ClienteView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.VideoView;

/**
 * @author aitor
 *
 */
public class ClienteVideoController implements ActionListener {

	private ClienteVideoView view;

	public ClienteVideoController(ClienteVideoView view) {
		this.view = view;
		this.view.btnClientes.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
		this.view.btnVideos.addActionListener(this);
	}

	public void initView() {
		view.setTitle("EXERCISE 2");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean estado = true;
		if (view.btnClientes == e.getSource()) {
			ClienteView v = new ClienteView();
			ClienteController c = new ClienteController(v);
			estado = false;
			c.initView();
		}
		if (view.btnVideos == e.getSource()) {
			VideoView v = new VideoView();
			VideoController c = new VideoController(v);
			estado = false;
			c.initView();

		}
		if (view.btnSalir == e.getSource()) {
			WelcomeView v = new WelcomeView();
			WelcomeController c = new WelcomeController(v);
			estado = false;
			c.initView();
		}

		view.setVisible(estado);

	}

}
