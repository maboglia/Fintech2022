package gioco;

public class Dado {

	String colore;
	int nFacce;
	
	public Dado() {
		colore = "bianco".toUpperCase();
		nFacce = 6;
	}
	
	public Dado(String colore) {//new Dado("rosso");
		this.colore = colore.toUpperCase();
		nFacce = 6;
	}
	
	public Dado(String colore, int nFacce) {
		this.colore = colore.toUpperCase();
		this.nFacce = nFacce;
	}
	
	public int lancia() {
		int i = 1;
		
		i = (int) (   Math.random() * nFacce) + 1;
		
		return i;
	}
	
}
