/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.NetworkConnector;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.exercise1.CreateView;

/**
 * @author aitor
 *
 */
public class CreateController implements ActionListener {

	private CreateView view;
	private NetworkConnector connector;

	public CreateController(CreateView view) {
		this.view = view;
		this.view.btnAceptar.addActionListener(this);
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
		boolean estado = false;
		Pattern pat;
		Matcher mat;
		if (view.btnAceptar == e.getSource()) {
			String nombre = view.textNombre.getText();
			String apellido = view.textApellido.getText();
			String direccion = view.textDireccion.getText();
			String dniText = view.textDni.getText();
			//Comprovar cadena
			pat = Pattern.compile("[^a-zA-Z]*");
			mat = pat.matcher(dniText);
			
			if(nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || dniText.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
				estado = true;
			}else if(!mat.matches() || dniText.length()>=11) {
				JOptionPane.showMessageDialog(null, "Formato DNI Incorrecto");
				estado = true;
			} else {
				int dni = Integer.parseInt(dniText);
				Cliente c = new Cliente(nombre, apellido, direccion, dni);
				connector = new NetworkConnector();
				connector.insertDataCliente(c);
				connector.closeConnection();
				JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
				estado = false;
			}
			view.setVisible(estado);
		}
		

	}

}
