package model;

public class Dirigente extends Dipendente {

	private double emolumenti;
	private double premi;
	
	public Dirigente(String nome) {
		super(nome);
		this.ruolo = "dirigente";
	}

	@Override
	public double calcolaStipendio() {
		return emolumenti + premi;
	}

}
