/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.Cliente;

/**
 * @author aitor
 *
 */
public class ClienteConnector {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection conexion = null;

	// CREAR CONEXIÓN
	public ClienteConnector() {
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

	// INSERTAR CLIENTES
	public void insertDataCliente(Cliente cliente) {
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);
			java.util.Date fecha = cliente.getFecha();
			java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());

			String Query = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES ('"
					+ cliente.getNombre() + "', '" + cliente.getApellido() + "', '" + cliente.getDireccion() + "', "
					+ cliente.getDni() + ", '" + sqlFecha + "');";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Datos insertados correctamente en la table  clientes");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error insertando datos en la tabla clientes");
		}
	}

	// BUSCAR CLIENTE
	public Cliente findDataCliente(int id) {
		Cliente cliente = new Cliente();
		boolean existe = false;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM cliente WHERE id = " + id + ";";
			ps = conexion.prepareStatement(Query);
			rs = ps.executeQuery();
			while (rs.next()) {
				existe = true;
				cliente.setId(rs.getInt("id"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setDireccion(rs.getString("direccion"));
				cliente.setDni(rs.getInt("dni"));
				cliente.setFecha(rs.getDate("fecha"));
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error buscando datos en la tabla clientes");
		}

		if (existe) {
			return cliente;
		} else
			return null;
	}

	// ELIMINAR CLIENTE
	public void updateDataCliente(Cliente cliente) {
		PreparedStatement st = null;
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			java.util.Date fecha = cliente.getFecha();
			java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());

			String consulta = "UPDATE cliente SET id= ?, nombre= ?, apellido= ?, direccion= ?, dni= ?, fecha= ? WHERE id= ? ";
			st = conexion.prepareStatement(consulta);
			st.setInt(1, cliente.getId());
			st.setString(2, cliente.getNombre());
			st.setString(3, cliente.getApellido());
			st.setString(4, cliente.getDireccion());
			st.setInt(5, cliente.getDni());
			st.setDate(6, sqlFecha);
			st.setInt(7, cliente.getId());
			st.executeUpdate();
			System.out.println(cliente.toString());

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error actualizando datos en la tabla clientes");
		}
	}

	public void deleteDataCliente(int id) {
		PreparedStatement st = null;
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String consulta = "DELETE FROM cliente WHERE id= ? ";
			st = conexion.prepareStatement(consulta);
			st.setInt(1, id);
			st.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error actualizando datos en la tabla clientes");
		}
	}

}
