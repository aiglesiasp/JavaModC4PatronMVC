/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.NetworkConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.CreateView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.FirstExerciseView;

/**
 * @author aitor
 *
 */
public class FirstExerciseController implements ActionListener {

	private FirstExerciseView view;
	private NetworkConnector connector;

	public FirstExerciseController(FirstExerciseView view) {
		this.view = view;
		this.view.btnCreate.addActionListener(this);
		this.view.btnUpdate.addActionListener(this);
		this.view.btnRead.addActionListener(this);
		this.view.btnDelete.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
	}

	public void initView() {
		view.setTitle("EXERCISE 1");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (view.btnCreate == e.getSource()) {
			CreateView v = new CreateView();
			CreateController c = new CreateController(v);
			c.initView();
		}

		if (view.btnUpdate == e.getSource()) {

		}

		if (view.btnRead == e.getSource()) {

		}

		if (view.btnDelete == e.getSource()) {

		}

		if (view.btnSalir == e.getSource()) {

		}

	}

}
