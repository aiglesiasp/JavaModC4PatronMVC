/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.videos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.VideoModel;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.VideoConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.CreateVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.VideoView;

/**
 * @author aitor
 *
 */
public class CreateVideoController implements ActionListener {

	private CreateVideoView view;
	private VideoConnector connector;

	public CreateVideoController(CreateVideoView view) {
		this.view = view;
		this.view.btnAceptar.addActionListener(this);
	}

	public void initView() {
		view.setTitle("CREATE VIDEO");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean estado = false;
		if (view.btnAceptar == e.getSource()) {
			String title = view.textTitle.getText();
			String director = view.textDirector.getText();
			String cliId = view.textCliID.getText();

			if (title.isEmpty() || director.isEmpty() || cliId.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
				estado = true;
			} else {
				int id = Integer.parseInt(cliId);
				VideoModel c = new VideoModel(title, director, id);
				connector = new VideoConnector();
				connector.insertDataVideo(c);
				connector.closeConnection();
				JOptionPane.showMessageDialog(null, "Video agregado correctamente");
				estado = false;
			}
			VideoView v = new VideoView();
			VideoController c = new VideoController(v);
			c.initView();
			view.setVisible(estado);
		}

	}

}
