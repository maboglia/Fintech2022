package dal;

import java.util.List;

import model.Titolo;

public interface TitoloDAO {
	
	String FINDALL = "Select * from titoli";
	String INSERT = "INSERT INTO titoli(nome,tipo,valore) VALUES (?,?,?)";
	String FINDONE = "Select * from titoli WHERE id = ?";
	// CRUD 
	void addTitolo(Titolo t);
	
	List<Titolo> getAll();
	
	Titolo getTitoloById(int id);
	
	void updateTitolo(Titolo t);
	
	void deleteTitoloById(int id);
	
	
}
