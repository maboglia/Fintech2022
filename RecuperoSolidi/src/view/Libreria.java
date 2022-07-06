package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Libro;

public class Libreria {

	public static void main(String[] args) {
		Libro l1 = new Libro(1, "io robot", "fanta", 10, 1000); 
		Libro l2 = new Libro(2, "tu robot", "drama", 15, 500); 
		Libro l3 = new Libro(3, "egli robot", "fanta", 12, 200); 
		Libro l4 = new Libro(4, "noi robot", "drama", 8, 300); 

		List<Libro> libri = new ArrayList<>();
		
		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(l4);
		
		Collections.sort(libri);
		System.out.println("-----------------ordina per titolo--------------");
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}

		System.out.println("-----------------ordina per pagine--------------");
		Collections.sort(libri, (lib1, lib2)->lib1.getPagine()-lib2.getPagine());
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		System.out.println("-----------------ordina per prezzo--------------");
		libri.stream()
			.sorted((lib1, lib2) -> Double.compare(lib1.getPrezzo(), lib2.getPrezzo()))
			.forEach(l -> System.out.println(l));
		
	}

}
