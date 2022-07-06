package model;

import java.util.Objects;

public class Libro implements Cloneable {

	private String titolo;
	private double prezzo;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Libro(String titolo, double prezzo) {
		super();
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(titolo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titolo, other.titolo);
	}



	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
