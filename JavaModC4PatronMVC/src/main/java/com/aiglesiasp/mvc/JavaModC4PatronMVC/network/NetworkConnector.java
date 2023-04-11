/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;

/**
 * @author aitor
 *
 */
public class NetworkConnector {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection conexion = null;

	// CREAR CONEXIÓN
	public NetworkConnector() {
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Server Connected");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.print("No se ha podido conectar con mi base de datos");
			System.out.println(ex);
		}
	}

	// OBTENER CONEXION
	public static Connection getConexion() {
		return conexion;
	}

	// CLOSE CONNECTION
	public void closeConnection() {
		try {
			conexion.close();
			System.out.println("Se ha finalizado la conexion con el servidor");
		} catch (SQLException ex) {
			System.err.println("Error al cerrar la conexión con la base de datos");
			System.out.println(ex);
		}
	}
	
	//INSERTAR CLIENTES
	public void insertDataCliente(Cliente cliente) {
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			String Query = "INSERT INTO cliente VALUES ("+cliente.getId()+", '"+cliente.getNombre()+"', '"+cliente.getApellido()+"', '"+cliente.getDireccion()+"', "+cliente.getDni()+", '"+cliente.getFecha()+"');";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Datos insertados correctamente en la table  clientes");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error insertando datos en la tabla clientes");
		}
	}
}
