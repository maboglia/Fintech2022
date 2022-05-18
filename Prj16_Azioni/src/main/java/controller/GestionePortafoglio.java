package controller;

import java.util.List;

import model.Azione;
import model.Portafoglio;

public class GestionePortafoglio {

	private Portafoglio portafoglio;
	
	public GestionePortafoglio(Portafoglio portafoglio) {

		this.portafoglio = portafoglio;
	}
	
	public void addAzione(Azione a) {
		this.portafoglio.getContenuto().add(a);
	}
	
	public List<Azione> getAzioni(){
		return this.portafoglio.getContenuto();
	}
	
	public static void main(String[] args) {
		GestionePortafoglio gp = new GestionePortafoglio(
				new Portafoglio("Portafoglio sig.rossi")	);
		
		Azione a = new Azione();
		a.setCodice(1);
		a.setNome("DELL");
		a.setQuotazione(10);
		
		gp.addAzione(a);
		for (Azione az : gp.portafoglio.getContenuto()) {
			System.out.println(az.getNome());
		}
	}
}
