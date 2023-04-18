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
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.UpdateVideoView;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.videos.VideoView;

/**
 * @author aitor
 *
 */
public class UpdateVideoController implements ActionListener {

	private UpdateVideoView view;
	private VideoConnector connector;
	private int id;

	public UpdateVideoController(UpdateVideoView view) {
		this.view = view;
		this.view.btnBuscar.addActionListener(this);
		this.view.btnModificar.addActionListener(this);
		this.view.btnAtras.addActionListener(this);
	}

	public void initView() {
		view.setTitle("MODIFICAR VIDEO");
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
			idText = view.textFieldID.getText();
			if (idText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No has introducido ningun ID");
			} else {
				id = Integer.parseInt(idText);
				connector = new VideoConnector();
				c = connector.findDataVideo(id);
				connector.closeConnection();
				if (c == null) {
					JOptionPane.showMessageDialog(null, "No existe ese Video");
				} else {
					view.textFieldTitle.setText(c.getTitle());
					view.textFieldDirector.setText(c.getDirector());
					view.textFieldCliente.setText("" + c.getCliId());
				}
			}
			view.setVisible(true);
		}

		if (view.btnModificar == e.getSource()) {
			String title = view.textFieldTitle.getText();
			String director = view.textFieldDirector.getText();
			String cliId = view.textFieldCliente.getText();

			if (title.isEmpty() || director.isEmpty() || cliId.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
			} else {
				int clienteID = Integer.parseInt(cliId);
				VideoModel c1 = new VideoModel(title, director, clienteID);
				c1.setId(id);
				connector = new VideoConnector();
				connector.updateDataVideo(c);
				connector.closeConnection();
				view.textFieldID.setText("");
				view.textFieldTitle.setText("");
				view.textFieldDirector.setText("");
				view.textFieldCliente.setText("");
				JOptionPane.showMessageDialog(null, "Video modificado correctamente");
			}
			view.setVisible(true);

		}

		if (view.btnAtras == e.getSource()) {
			VideoView v = new VideoView();
			VideoController cv = new VideoController(v);
			cv.initView();
			view.setVisible(false);
		}

	}

}
