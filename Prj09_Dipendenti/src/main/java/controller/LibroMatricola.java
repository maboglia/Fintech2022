package controller;

import java.util.List;

import model.Dipendente;

public interface LibroMatricola {//come la classe astratta non può essere usata per creare istanze
	
	String nomeAzienda = "Marika spa";
	
	//tutti metodi implicitamente public e abstract
	
	void addDipendente(Dipendente d);
	void addDipendente(String nome, String ruolo);
	
	Dipendente getDipendenteByMatr(int nMatr);
	Dipendente getDipendenteByNome(String nome);
	
	List<Dipendente> getAll();
	List<Dipendente> getAllByRuolo(String ruolo);

}
