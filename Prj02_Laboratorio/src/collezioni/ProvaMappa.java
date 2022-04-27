package collezioni;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappa {

	public static void main(String[] args) {

		Map<String, String> capoluoghi = new HashMap<>();
		
		capoluoghi.put("piemonte", "torino");
		capoluoghi.put("puglia", "bari");
		capoluoghi.put("lombardia", "milano");
		capoluoghi.put("lazio", "roma");
		//capoluoghi.put("piemonte", "cuneo");

		Set<String> regioni = capoluoghi.keySet();
		
		//chiavi.stream().forEach(System.out::println);
		
		Collection<String> valori = capoluoghi.values();
		
		//valori.forEach(System.out::println);
		
		for (String regione : regioni) {
			System.out.println(regione +": "+  capoluoghi.get(regione));
		}
		
		
	}

}
