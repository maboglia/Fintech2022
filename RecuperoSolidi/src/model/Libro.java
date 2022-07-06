package model;

public class Libro implements Comparable<Libro>{

	private int id;
	private String titolo;
	private String genere;
	private double prezzo;
	private int pagine;
	
	public Libro(int id, String titolo, String genere, double prezzo, int pagine) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", prezzo=" + prezzo + ", pagine="
				+ pagine + "]";
	}

	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(altroLibro.titolo);
	}
	
	
	
	
}
