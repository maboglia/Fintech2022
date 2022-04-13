package model;

public class Titolo implements Comparable<Titolo>{

	private int id;
	private String nome;
	private Tipo tipo;
	private double valore;
	
	public Titolo() {
		}

	public Titolo(int id, String nome, Tipo tipo, double valore) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.valore = valore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Titolo [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", valore=");
		builder.append(valore);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Titolo o) {
		return this.tipo.compareTo(o.tipo);
	}
	
	
	
}
