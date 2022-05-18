package model;


public class Azione {

	private int codice;
	private String nome;
	private Settore settore;
	private double quotazione;
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Settore getSettore() {
		return settore;
	}
	public void setSettore(Settore settore) {
		this.settore = settore;
	}
	public double getQuotazione() {
		return quotazione;
	}
	public void setQuotazione(double quotazione) {
		this.quotazione = quotazione;
	}
	
	
	
}
