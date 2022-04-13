package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiaConnessione {
	
	private final String HOST = "jdbc:mysql://localhost:3306/java2022";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conn;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
		} catch (SQLException e) {
			
			System.err.println("Errore di connessione " + e.getMessage());
			//e.printStackTrace();
		}
	}
	public Connection getConn() {
		if(this.conn==null) {
			connetti();
		}
		return conn;
	}
	
}
