package model;

public class Impiegato extends Dipendente {

	private int numOre;
	private double pagaOraria;
	
	public Impiegato(String nome) {
		super(nome);
		this.ruolo = "impiegato";
	}

	@Override
	public double calcolaStipendio() {//ppc: sono obbligato a implementare il metodo abstract
		return numOre * pagaOraria;
	}

}
