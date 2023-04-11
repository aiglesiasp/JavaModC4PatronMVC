/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.exercise1.FirstExerciseController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.FirstExerciseView;

/**
 * @author aitor
 *
 */
public class WelcomeController implements ActionListener {

	private WelcomeView view;

	public WelcomeController(WelcomeView view) {
		this.view = view;
		this.view.btnEjercicio1.addActionListener(this);
		this.view.btnEjercicio2.addActionListener(this);
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
		if (view.btnEjercicio1 == e.getSource()) {
			FirstExerciseView firstView = new FirstExerciseView();
			FirstExerciseController firstController = new FirstExerciseController(firstView);
			view.setVisible(false);
			firstController.initView();
			
		}
		if (view.btnEjercicio2 == e.getSource()) {

		}
		if (view.btnEjercicio2 == e.getSource()) {

		}

	}

}