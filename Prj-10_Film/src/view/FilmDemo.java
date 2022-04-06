package view;

import java.util.Arrays;
import java.util.List;

import ctrl.FilmCtrl;
import model.Film;

public class FilmDemo {

	public static void main(String[] args) {
		
		Film f= new Film(1, "Le Iene", Arrays.asList("Commedia","Drammatico"), 22.90);
		
		FilmCtrl.addFilm(f);
		
		//List<Film> lista = Arrays.asList(f,new Film(2, "Django Unchained", Arrays.asList("Wester","Drammatico"), 25.50));
		
		FilmCtrl.addFilm(2, "Django Unchained", Arrays.asList("Wester","Drammatico"), 25.50);
		
		for (Film film : FilmCtrl.getAll()) {
			System.out.println(film);
		}
	}
}