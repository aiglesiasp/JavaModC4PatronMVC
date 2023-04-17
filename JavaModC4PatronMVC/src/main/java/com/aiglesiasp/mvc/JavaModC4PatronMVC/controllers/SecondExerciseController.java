/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.FirstExerciseView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.SecondExerciseView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;

/**
 * @author aitor
 *
 */
public class SecondExerciseController implements ActionListener {

	private SecondExerciseView view;

	public SecondExerciseController(SecondExerciseView view) {
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
			FirstExerciseView v = new FirstExerciseView();
			FirstExerciseController c = new FirstExerciseController(v);
			estado = false;
			c.initView();
		}
		if (view.btnVideos == e.getSource()) {

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
