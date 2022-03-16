package model;

public class The extends Bevanda {
	
	public The() {
		this.nome = "The verde al gianduja";
		this.prezzo = 0.75;
		preparaBevanda();
		System.out.println("ho preparato un the");
	}
	
	private void preparaBevanda() {
		
		System.out.println("metti polverina");
		System.out.println("metti gianduiotto");
		System.out.println("aggiungi zucchero");
		System.out.println("metti palettina");
		System.out.println("fai beep");
	}
	

}
