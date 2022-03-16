package model;

public class Bevanda {

	public String nome;
	public double prezzo;
	public Bicchiere bicchiere;
	
	public Bevanda() {
		System.out.println("costruita una generica bevanda");
		bicchiere = new Bicchiere();
	}

	@Override
	public String toString() {
		return "Bevanda [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
