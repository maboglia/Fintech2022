package database;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Libro;

public class LibroService {

	static Stream<String> libri;
	static List<Libro> listaLibri = new ArrayList<>();
	
	public static void riempi() {
		
		try {
			libri = 
					Files
						.lines(Paths.get("files/Biblioteca.csv"), Charset.forName("Cp1252"));
			
			libri.forEach(l -> {
				String[] split = l.split(",");
				String autore = split[1];
				String titolo = split[2];
				String classif =  split[7]!=null ? split[7]: "Non classificato";
				//System.out.println(autore + " | " + titolo + " | " + classif);
				Libro libro = new Libro();
				libro.setAutore(autore);
				libro.setTitolo(titolo);
				libro.setClassificazione(classif);
				listaLibri.add(libro);
				
			});
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
