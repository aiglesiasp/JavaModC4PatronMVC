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
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.FindVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.VideoView;

/**
 * @author aitor
 *
 */
public class FindVideoController implements ActionListener {

	private FindVideoView view;
	private VideoConnector connector;

	public FindVideoController(FindVideoView view) {
		this.view = view;
		this.view.btnBuscar.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
	}

	public void initView() {
		view.setTitle("BUSCAR CLIENTE");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setLocationRelativeTo(null);
		view.setSize(450, 300);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String idText = "";
		VideoModel c = new VideoModel();
		if (view.btnBuscar == e.getSource()) {
			idText = view.textFieldId.getText();
			if (idText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
			} else {
				// TODO:
				int id = Integer.parseInt(idText);
				connector = new VideoConnector();
				c = connector.findDataVideo(id);
				connector.closeConnection();
				if (c == null) {
					JOptionPane.showMessageDialog(null, "No existe ese Video");
				} else {
					view.textAreaCliente.setText("");
					view.textAreaCliente.append("ID: " + c.getId() + "\n");
					view.textAreaCliente.append("TITLE: " + c.getTitle() + "\n");
					view.textAreaCliente.append("DIRECTOR: " + c.getDirector() + "\n");
					view.textAreaCliente.append("ID CLIENTE: " + c.getCliId() + "\n");
				}
			}
		}
		if (view.btnAtras == e.getSource()) {
			VideoView v = new VideoView();
			VideoController cv = new VideoController(v);
			cv.initView();
			view.setVisible(false);
		}

	}

}
