package ctrl;

import java.util.ArrayList;
import java.util.List;

import model.Film;

public class FilmCtrl {
	
	private static List<Film> catalogo = new ArrayList<Film>();
	
	public static void addFilm(Film f) {
		catalogo.add(f);
	}
	
	public static void addFilm(int codice, String titolo, List<String> genere, double prezzo) {
		Film f = new Film(codice,titolo,genere,prezzo);
		catalogo.add(f);
	}
	
	public static Film getFilmbyCodice(int codice) {
		for (Film film : catalogo) {
			if(film.getCodice()==codice)
				return film;
		}
		return null;
	}
	
	public static List<Film> getAll(){
		return catalogo;
	}
	
}
