package controller;

import java.util.ArrayList;

import model.Bevanda;

public class BevandeDisponibili {

	private static ArrayList<Etichetta> bevande = new ArrayList<>();
	
	public static ArrayList<Etichetta> getBevande(){
		bevande.clear();
		bevande.add(new Etichetta("The", 0.75));
		bevande.add(new Etichetta("Caffè", 0.50));
		bevande.add(new Etichetta("Cioccolata", 0.85));
		bevande.add(new Etichetta("Cappuccino", 0.65));
		bevande.add(new Etichetta("Camomilla", 0.45));
		
		return bevande;
	}
	
	public static double getPrezzo(String nomeBevanda) {
		
		double prezzo = 0;
		
		for (Etichetta etichetta : bevande) {
			if (etichetta.nome.equalsIgnoreCase(nomeBevanda))
				prezzo = etichetta.prezzo;
		}
		
		return prezzo;
		
	}
	
}
