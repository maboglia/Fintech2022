package model;

public class Fattorino extends Dipendente {

	private int nConsegne;
	private double pagaBase;
	
	public Fattorino(String nome) {
		super(nome);
		this.ruolo = "fattorino";
	}

	@Override
	public double calcolaStipendio() {
		return nConsegne * pagaBase;
	}

}
