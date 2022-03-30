package model;

public abstract class Dipendente {//non posso creare istanze

	
	private static int contatore = 1;//appartiene alla classe
	
	private int matricola;
	private String nome;
	protected String ruolo;
	
	public Dipendente(String nome) {
		this.matricola = contatore++;
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public String getNome() {
		return nome;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public abstract double calcolaStipendio();

	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", nome=" + nome + ", ruolo=" + ruolo + "]";
	}
	
	
	
	
}
