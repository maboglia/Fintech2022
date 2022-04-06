package model;

import java.util.List;

public class Film {

	/**
	 * Modificatore protected visibile anche alle sottoclassi
	 * Modificatore public visibile a tutti
	 * Modificatore senza precisare visibile a tutto il model
	 * */
	private/*Modificatore*/  int codice; 
	private String titolo;
	private List<String> genere;
	private double prezzo;
	
	/**
	 * Costruttore dell'oggetto Film
	 * @param codice inserire il codice dell'articolo
	 * @param titolo inserire il titolo dell'articolo
	 * @param genere inserire il genere separando con virgola
	 * @param prezzo inserire il prezzo in euro
	 */
	public Film(int codice, String titolo, List<String> genere, double prezzo) {
		this.codice = codice;
		this.titolo = titolo;
		this.genere = genere;
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<String> getGenere() {
		return genere;
	}

	public void setGenere(List<String> genere) {
		this.genere = genere;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [codice=");
		builder.append(codice);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", genere=");
		builder.append(genere);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}
	
}
