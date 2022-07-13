package main;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetCarte {

	public static void main(String[] args) {
		
//		Set<String> carte2 = new HashSet<>();
//		carte2.add("sette");
//		carte2.add("quattro");
//		carte2.add("sette");
//		carte2.forEach(System.out::println);
		
		
		
		
		
		Collection<Carta> carte = new TreeSet<>();
		
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
		
		carte.stream()
			//.sorted()
			.forEach(System.out::println);
		

	}

}
