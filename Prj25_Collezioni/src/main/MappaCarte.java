package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MappaCarte {

	public static void main(String[] args) {
		//   Set   Collection
		Map<Integer, List<Carta>> carte = new HashMap<>();
		
		
		carte.put(1, List.of(new Carta(1, Seme.QUADRI), new Carta(1, Seme.CUORI)));
		carte.put(2, List.of(new Carta(1, Seme.FIORI), new Carta(1, Seme.PICCHE)));
		
		Set<Integer> keySet = carte.keySet();
		Collection<List<Carta>> values = carte.values();
		
		keySet.forEach(System.out::println);
		
		values.forEach(System.out::println);
		
		for (Integer i : keySet) {
			System.out.println(carte.get(i));
		}
		
		for( Entry<Integer, List<Carta>> carta   : carte.entrySet()  ) {
			
			System.out.println(carta.getKey());
			System.out.println(carta.getValue());
			
		}
		
		
		
		
		
		
	}

}
