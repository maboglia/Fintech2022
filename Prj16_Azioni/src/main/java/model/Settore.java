package model;

public enum Settore {
	TECH(100), FOOD(200), AUTOMOTIVE(300);

	private int codice;
	
	private Settore(int codice) {
		this.codice = codice;
	}

	public int getCodice() {
		return codice;
	}
	
	
	
}
