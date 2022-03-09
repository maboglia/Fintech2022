package gioco;

import java.text.NumberFormat;

public class DadiUguali {

	public static void main(String[] args) {

		Dado d1 = new Dado();//dado da 6 bianco
		Dado d2 = new Dado("rosso");//dado da 6 rosso
		Dado d3 = new Dado("verde", 6);//dado da 6 rosso
		
		int res1, res2, res3;
		
		final int VOLTE = 1000_000;
		int punteggio = 0;
		
		for (int i = 0; i < VOLTE; i++) {
			res1 = d1.lancia();
			res2 = d2.lancia();
			res3 = d3.lancia();
			
			if ((res1 == res2) && (res2== res3) ) {
				//System.out.println("hai vinto con una coppia di " + res1);
				punteggio++;
			} else {
				//System.out.println("Dado 1 " + res1);
				//System.out.println("Dado 2 " + res2);
				//System.out.println("non hai vinto");
			}
		}//fine for
		double percentuale = (double) punteggio / VOLTE;
		System.out.println("hai vinto " + punteggio + " volte");
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		System.out.println("la percentuale è " + nf.format(percentuale));
		
	}

}
