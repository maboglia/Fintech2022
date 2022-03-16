package controller;


import model.Bevanda;
import model.Caffe;
import model.The;

public class BevandeCtrl {

	public String stampaMenu() {
		
		String menu = "";
		
		for (Etichetta nomeBevanda : BevandeDisponibili.getBevande()) {
			menu += nomeBevanda + "\n";
		}
		
		
		return menu;
		
	}
	
	public Bevanda dammiBevanda(String nomeBevanda, double monete) {
		
		double prezzoBevanda = BevandeDisponibili.getPrezzo(nomeBevanda);
		Bevanda b = null;
		
		if (prezzoBevanda > monete) {
			System.out.println("Denaro non sufficiente");
		}
		
		if (monete > prezzoBevanda) {
			System.out.println("Hai messo: " + monete);
			System.out.println("La bevanda costa: " +  prezzoBevanda);
			System.out.println("Resto:............." + (monete - prezzoBevanda));
		}
		
		if (monete >= prezzoBevanda) {
			switch (nomeBevanda) {
				case "caffe":
						b = new Caffe();
					break;
				case "the":
					b = new The();
				break;
	
				default:
				System.out.println("bevanda " + nomeBevanda +  "non disponibile!");
				break;
			}
			
		}
		
		
		return b;
	}
	
	
	
}
