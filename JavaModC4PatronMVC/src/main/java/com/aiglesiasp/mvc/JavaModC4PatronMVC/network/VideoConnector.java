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

import com.aiglesiasp.mvc.JavaModC4PatronMVC.models.VideoModel;

/**
 * @author aitor
 *
 */
public class VideoConnector {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection conexion = null;

	// CREAR CONEXIÓN
	public VideoConnector() {
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

	// INSERTAR VIDEO
	public void insertDataVideo(VideoModel video) {
		PreparedStatement st = null;
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String consulta = "INSERT INTO videos (title, director, cli_id) VALUES (?, ?, ?)";
			st = conexion.prepareStatement(consulta);
			st.setString(1, video.getTitle());
			st.setString(2, video.getDirector());
			st.setInt(3, video.getCliId());
			st.executeUpdate();

			System.out.println("Datos insertados correctamente en la tabla  videos");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error insertando datos en la tabla videos");
		}
	}

	// BUSCAR VIDEO
	public VideoModel findDataVideo(int id) {
		VideoModel video = new VideoModel();
		boolean existe = false;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String consulta = "SELECT * FROM videos WHERE id = ?";
			ps = conexion.prepareStatement(consulta);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				existe = true;
				video.setId(rs.getInt("id"));
				video.setTitle(rs.getString("title"));
				video.setDirector(rs.getString("director"));
				video.setCliId(rs.getInt("cli_id"));

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error buscando datos en la tabla videos");
		}

		if (existe) {
			return video;
		} else
			return null;
	}

	// MODIFICAR VIDEO
	public void updateDataVideo(VideoModel video) {
		PreparedStatement st = null;
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String consulta = "UPDATE videos SET id= ?, title= ?, director= ?, cli_id= ? WHERE id= ? ";
			st = conexion.prepareStatement(consulta);
			st.setInt(1, video.getId());
			st.setString(2, video.getTitle());
			st.setString(3, video.getDirector());
			st.setInt(4, video.getCliId());
			st.setInt(5, video.getId());
			st.executeUpdate();
			System.out.println(video.toString());

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error actualizando datos en la tabla videos");
		}
	}

	// ELIMINAR VIDEO
	public void deleteDataVideo(int id) {
		PreparedStatement st = null;
		try {
			String Querydb = "USE clientes";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String consulta = "DELETE FROM videos WHERE id= ? ";
			st = conexion.prepareStatement(consulta);
			st.setInt(1, id);
			st.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error eliminando datos en la tabla videos");
		}
	}

}
