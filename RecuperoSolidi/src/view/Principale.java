package view;

import model.Baule;
import model.Cosa;

public class Principale {

	public static void main(String[] args) {
		Cosa c1 = new Cosa();
		Cosa c2 = new Cosa("pizza");
		Cosa c3 = new Cosa("mandolino", 1.5);

		Baule b1 = new Baule("cavi") ;
		b1.addCosa(new Cosa("cavo di rete", 10));
		b1.addCosa(new Cosa("cavo elettrico", 20));
		b1.addCosa(new Cosa("cavo di acciaio", 20));
		
		System.out.println(b1);

	}
	
}
