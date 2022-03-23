package model;

public class Quadrato extends Rettangolo {


	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.setNome("Quadrato");
		
	}

	@Override
	public double calcolaPerimetro() {
		
		return this.base.getLunghezza() * 4;
	}

	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		return Math.pow(this.base.getLunghezza(), 2);
	}
	
	
	
}
