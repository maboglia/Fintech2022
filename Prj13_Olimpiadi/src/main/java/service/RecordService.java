package service;

import java.sql.SQLException;
import java.util.List;

import dal.RecordOlimpicoDAO;
import dal.RecordOlimpicoDAOImpl;
import model.RecordOlimpico;

public class RecordService {

	RecordOlimpicoDAO repo = new RecordOlimpicoDAOImpl();
	
	public List<RecordOlimpico> getRecords(){
		try {
			return repo.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
