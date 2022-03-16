package controller;

public class Etichetta {

	public String nome;
	public double prezzo;

	public Etichetta(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "" + nome + ", " + prezzo + "€";
	}
	
	
	
}
