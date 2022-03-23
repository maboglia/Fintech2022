package model;

public class Animale {

	private String nome;
	private String collocazione;

	public Animale(String nome, String collocazione) {
		this.nome = nome;
		this.collocazione = collocazione;
	}

	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", collocazione=" + collocazione + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
