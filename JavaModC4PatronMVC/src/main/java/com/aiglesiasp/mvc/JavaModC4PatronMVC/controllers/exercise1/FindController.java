/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.NetworkConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.FindView;

/**
 * @author aitor
 *
 */
public class FindController implements ActionListener{
	
	private FindView view;
	private NetworkConnector connector;
	
	public FindController(FindView view) {
		this.view = view;
		this.view.btnBuscar.addActionListener(this);
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
		boolean estado = false;
		Cliente c =  new Cliente();
		if(view.btnBuscar == e.getSource()) {
			idText = view.textFieldId.getText();
			if(idText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
				estado = true;
			} else {
				int id = Integer.parseInt(idText);
				connector = new NetworkConnector();
				c = connector.findDataCliente(id);
				connector.closeConnection();
				if(c == null) {
					JOptionPane.showMessageDialog(null, "No existe ese Cliente");
					estado = true;
				} else {
					view.textAreaCliente.setText("");
					view.textAreaCliente.append("ID: "+c.getId()+"\n");
					view.textAreaCliente.append("NOMBRE: "+c.getNombre()+"\n");
					view.textAreaCliente.append("APELLIDO: "+c.getApellido()+"\n");
					view.textAreaCliente.append("DIRECCION: "+c.getDireccion()+"\n");
					view.textAreaCliente.append("DNI: "+c.getDni()+"\n");
					view.textAreaCliente.append("FECHA: "+c.getFecha().toString()+"\n");
					estado = true;
				}
			}
			view.setVisible(estado);
			
		}
		
	}
	

}
