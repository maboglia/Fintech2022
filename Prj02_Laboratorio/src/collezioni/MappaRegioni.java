package collezioni;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Comune;
import model.Regione;

public class MappaRegioni {

	public static void main(String[] args) {


		Map<Regione, List<Comune>> regioni = new HashMap<Regione, List<Comune>>();
		
		Regione r = new Regione();
		r.setNome("piemonte");
		
		Comune c1 = new Comune();
		c1.setNome("torino");

		Comune c2 = new Comune();
		c1.setNome("asti");
		
		
		
		regioni.put(r, Arrays.asList(c1, c2));
		
		
		
		
	}

}
