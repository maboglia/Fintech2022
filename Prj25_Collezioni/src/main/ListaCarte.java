package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaCarte {

	public static void main(String[] args) {


		Collection<Carta> carte = new LinkedList<>();
		
		carte.add(new Carta(1, Seme.CUORI));
		carte.add(new Carta(2, Seme.QUADRI));
		carte.add(new Carta(3, Seme.CUORI));
		carte.add(new Carta(4, Seme.FIORI));
		carte.add(new Carta(5, Seme.PICCHE));
		carte.add(new Carta(2, Seme.CUORI));
		carte.add(new Carta(3, Seme.QUADRI));
		carte.add(new Carta(3, Seme.CUORI));
		carte.add(new Carta(4, Seme.FIORI));
		carte.add(new Carta(5, Seme.PICCHE));
		
		//Collections.sort(carte);
		
		List<Carta> carteCuori = carte	
			.stream()
			.filter(c -> c.getSeme().equals(Seme.CUORI))
			.sorted()
			.collect(Collectors.toList());
		
		System.out.println("------Collezione originale--------");
		carte.forEach(System.out::println);
	}

}
