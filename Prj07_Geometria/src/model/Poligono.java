package model;

public class Poligono {

	private String nome;
	protected double perimetro, superficie;
	
	public Poligono(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Poligono [nome=" + nome + ", perimetro=" + perimetro + ", superficie=" + superficie + "]";
	}
	
	
	
}
