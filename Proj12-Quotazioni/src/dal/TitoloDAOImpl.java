package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Titolo;

public class TitoloDAOImpl implements TitoloDAO {
	
	
	private MiaConnessione mc = new MiaConnessione(); 
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void addTitolo(Titolo t) {
		try {		
			this.ps = mc.getConn().prepareStatement(INSERT);
			this.ps.setString(1,t.getNome());
			this.ps.setString(2,t.getTipo().toString());
			this.ps.setDouble(3,t.getValore());
			this.ps.execute();
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Titolo> getAll() {
		List<Titolo> titoli = new ArrayList<Titolo>();
		try {
			this.stat = mc.getConn().createStatement();
			this.rs = stat.executeQuery(FINDALL);
			
			while(rs.next()) {
				Titolo t = new Titolo();
				
				t.setId(rs.getInt("id"));
				t.setNome(rs.getString("nome"));
			//	t.setTipo(rs.getString("tipo"));
				t.setValore(rs.getDouble("valore"));
				titoli.add(t);
			
			}
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return titoli;
	}

	@Override
	public Titolo getTitoloById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTitolo(Titolo t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTitoloById(int id) {
		// TODO Auto-generated method stub

	}

}
