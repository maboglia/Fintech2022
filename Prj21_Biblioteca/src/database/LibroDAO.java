package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Libro;

public class LibroDAO {

	private Connessione c;
	private Connection conn;
	
	private PreparedStatement ps;
	private ResultSet rs;
	
	public LibroDAO() {
		this.c = new Connessione();
		this.conn = this.c.getConn();
	}
	
	public void caricaLibri() {
		try {
			this.ps = this.conn.prepareStatement
					("INSERT INTO libri (autore, titolo, classificazione) values (?,?,?)");
		
			LibroService.riempi();
			for (Libro l:   LibroService.listaLibri) {
				this.ps.setString(1, l.getAutore());
				this.ps.setString(2, l.getTitolo());
				this.ps.setString(3, l.getClassificazione());
				this.ps.execute();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		LibroDAO ld = new LibroDAO();
		ld.caricaLibri();
//		LibroService.riempi();
//		LibroService.listaLibri.stream().forEach(System.out::println);
	}
}
