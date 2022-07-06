package model;

public class Cosa {

	private String nome;
	private double peso;
	
	public Cosa() {
		nome = "cosa generica";
		peso = 0.0;
		System.out.println("ho costruito un oggetto di tipo cosa");
	}
	
	public Cosa(String nome) {
		this.nome = nome;
		this.peso = 0;
	}
	
	public Cosa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	@Override
	public String toString() {
		return "Cosa [nome=" + nome + ", peso=" + peso + "]";
	}



}
