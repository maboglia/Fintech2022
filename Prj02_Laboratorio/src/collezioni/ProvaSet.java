package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ProvaSet {

	public static void main(String[] args) {


		Set<String> note = new HashSet<>() ;//new LinkedList<>();
		note.size();
		note.add("fa");
		note.add("mi");
		note.add("fa");
		note.add("sol");
		note.add("fa");
		note.isEmpty();
		note.remove("do");
		note.forEach(System.out::println);//static method reference
		

	}

}
