package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.RecordOlimpico;

public class RecordOlimpicoDAOImpl implements RecordOlimpicoDAO {

	private MiaConnessione miaConn = new MiaConnessione();
	
	private Statement stat;
	private ResultSet rs;
	
	
	@Override
	public List<RecordOlimpico> findAll() throws SQLException {

		List<RecordOlimpico> temp = new ArrayList<>();
		
		this.stat = miaConn.getConn().createStatement();
		this.rs = this.stat.executeQuery(TROVA_TUTTI);
		
		while(this.rs.next()) {
			
			RecordOlimpico r = new RecordOlimpico();
			
			r.setId(rs.getInt(1));
			r.setEvent(rs.getString(2));
			r.setRecord(rs.getString(3));
			r.setAthlete(rs.getString(4));
			r.setNation(rs.getString(5));
			r.setGames(rs.getString(6));
			r.setGenre(rs.getString(7));
			
			temp.add(r);
			
		}
		
		return temp;
	}

}
