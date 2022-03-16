package view;

import java.util.Scanner;

import controller.BevandeCtrl;
import model.Bevanda;

public class Distributore {

	public static void main(String[] args) {
		
		BevandeCtrl ctrl = new BevandeCtrl();
		
		System.out.println(ctrl.stampaMenu());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scegli la bevanda");
		
		String scelta = sc.nextLine();
		
		System.out.println("Inserisci le monete");
		
		double monete = sc.nextDouble();
		sc.nextLine();
		
		Bevanda b = ctrl.dammiBevanda(scelta, monete);
		
		System.out.println(b);
		
		
		
	}

}
