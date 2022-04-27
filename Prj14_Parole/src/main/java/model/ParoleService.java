package model;

import java.util.ArrayList;
import java.util.List;

public class ParoleService {

	public static List<Parola> parole = new ArrayList<Parola>();
	
	static {
		
		for(String parola : ArrayDiParole.lista) {
			parole.add(new Parola(parola));
			
		}
		
		
	}
	
 	
}
