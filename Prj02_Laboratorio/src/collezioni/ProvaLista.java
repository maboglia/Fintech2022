package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProvaLista {

	public static void main(String[] args) {


		List<String> note = new ArrayList<String>()   ;//new LinkedList<>();
		note.size();
		note.add("fa");
		note.add("mi");
		note.add("fa");
		note.add("sol");
		note.add("fa");
		note.get(0);
//		Iterator<String> iterator = note.iterator();
//		while(iterator.hasNext()) {
//			
//		}
//		note.remove(0);
		
//		for (int i = 0; i < note.size(); i++) {
//			System.out.println(note.get(i));
//		}
		
//		for (var nota : note) {
//			System.out.println(nota);
//		}
		
		note.forEach(n -> System.out.println(n));

		List<List<String>> supernote = new ArrayList<List<String>>();
		
	}

}
