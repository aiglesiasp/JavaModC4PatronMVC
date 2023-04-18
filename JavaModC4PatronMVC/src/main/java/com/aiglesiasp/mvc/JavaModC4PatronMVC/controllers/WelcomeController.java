/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.clientes.ClienteController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.ClienteVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.clientes.ClienteView;

/**
 * @author aitor
 *
 */
public class WelcomeController implements ActionListener {

	private WelcomeView view;

	public WelcomeController(WelcomeView view) {
		this.view = view;
		this.view.btnEjercicio12.addActionListener(this);
		this.view.btnEjercicio3.addActionListener(this);

	}

	public void initView() {
		view.setTitle("WELCOME");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (view.btnEjercicio12 == e.getSource()) {
			ClienteVideoView firstView = new ClienteVideoView();
			ClienteVideoController firstController = new ClienteVideoController(firstView);
			view.setVisible(false);
			firstController.initView();

		}
		if (view.btnEjercicio3 == e.getSource()) {
//			CienciasView secondView = new CienciasView();
//			CienciasController secondController = new CienciasController(secondView);
//			view.setVisible(false);
//			secondController.initView();

		}
		

	}

}
