/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.CreateView;

/**
 * @author aitor
 *
 */
public class CreateController implements ActionListener{

	private CreateView view;
	
	public CreateController(CreateView view) {
		this.view = view;
	}
	
	public void initView() {
		view.setTitle("CREATE");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
