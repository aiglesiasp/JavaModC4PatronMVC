/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.videos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.ClienteVideoController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.WelcomeController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.ClienteVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.CreateVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.DeleteVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.FindVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.UpdateVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.VideoView;

/**
 * @author aitor
 *
 */
public class VideoController implements ActionListener {

	private VideoView view;

	public VideoController(VideoView view) {
		this.view = view;
		this.view.btnCreate.addActionListener(this);
		this.view.btnUpdate.addActionListener(this);
		this.view.btnRead.addActionListener(this);
		this.view.btnDelete.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
	}

	public void initView() {
		view.setTitle("PANTALLA DE VIDEO");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean estado = true;
		if (view.btnCreate == e.getSource()) {
			CreateVideoView v = new CreateVideoView();
			CreateVideoController c = new CreateVideoController(v);
			estado = false;
			c.initView();
		}

		if (view.btnUpdate == e.getSource()) {
			UpdateVideoView v = new UpdateVideoView();
			UpdateVideoController c = new UpdateVideoController(v);
			estado = false;
			c.initView();
		}

		if (view.btnRead == e.getSource()) {
			FindVideoView v = new FindVideoView();
			FindVideoController c = new FindVideoController(v);
			estado = false;
			c.initView();
		}

		if (view.btnDelete == e.getSource()) {
			DeleteVideoView v = new DeleteVideoView();
			DeleteVideoController c = new DeleteVideoController(v);
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
