package dal;

import java.sql.SQLException;
import java.util.List;

import model.RecordOlimpico;

public interface RecordOlimpicoDAO {

	String TROVA_TUTTI = "select * from olympics";
	
	List<RecordOlimpico> findAll() throws SQLException;
	
	
}
