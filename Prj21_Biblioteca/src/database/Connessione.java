package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3306/java2022";
	private final String USER = "root";
	private final String PASS = "";
	
	private Connection conn;
	
	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("sei connesso");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("non sei connesso: " + e.getMessage());
		}
		
	}

	public Connection getConn() {
		if (this.conn == null)
			connetti();
		return conn;
	}

}
