package controller;

import java.util.ArrayList;
import java.util.List;

import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class LibroMatricolaImpl implements LibroMatricola{

	private static List<Dipendente> dipendenti = new ArrayList<>();
	
	@Override
	public void addDipendente(Dipendente d) {
		dipendenti.add(d);
		
	}

	@Override
	public void addDipendente(String nome, String ruolo) {
		Dipendente d = null;
		
		switch (ruolo) {
		case "fattorino":
			d = new Fattorino(nome);
			break;
		case "impiegato":
			d = new Impiegato(nome);
			break;
		case "dirigente":
			d = new Dirigente(nome);
			break;

		default:
			break;
		}
		
		dipendenti.add(d);
	}

	@Override
	public Dipendente getDipendenteByMatr(int nMatr) {

		for (Dipendente dipendente : dipendenti) {
			if (dipendente.getMatricola() == nMatr)
				return dipendente;
		}
		
		return null;
	}

	@Override
	public Dipendente getDipendenteByNome(String nome) {
		for (Dipendente dipendente : dipendenti) {
			if (dipendente.getNome().equals(nome))
				return dipendente;
		}
		
		return null;
	}

	@Override
	public List<Dipendente> getAll() {
		// TODO Auto-generated method stub
		return dipendenti;
	}

	@Override
	public List<Dipendente> getAllByRuolo(String ruolo) {
		List<Dipendente> dipByRuolo = new ArrayList<>();
		
		for (Dipendente dipendente : dipendenti) {
			if (dipendente.getRuolo().equals(ruolo))
				dipByRuolo.add(dipendente);
		}
		
		return dipByRuolo;
	}

	
}
